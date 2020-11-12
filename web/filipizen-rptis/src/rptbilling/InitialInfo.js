import React, { useState } from 'react'
import {
  Text,
  Title,
  Button,
  ActionBar,
  Subtitle,
  Spacer,
  Service,
  Error,
  BackLink,
  useData,
  Label,
  Integer,
  Panel,
  Card
} from 'rsi-react-web-components'

const InitialInfo = ({
  title,
  partner,
  moveNextStep,
  movePrevStep,
}) => {

  const [ctx, dispatch] = useData();
  const { txntype } = ctx;

  const currentYear = new Date().getFullYear();

  const [error, setError] = useState();
  const [loading, setLoading] = useState(false);
  const [refno, setRefno] = useState();
  const [billtoyear, setBilltoyear] = useState(currentYear+1);
  const [mode, setMode] = useState("initial");

  const getBilling = async (billOptions = {}) => {
    const svc = await Service.lookupAsync(`${partner.id}:OnlineLandTaxBillingService`, "rpt")
    const params = { txntype, refno, ...billOptions }
    if (mode === "initial-advance") {
      params.billtoyear = billtoyear;
    }
    return await svc.invoke("getBilling", params);
  }

  const loadBill = () => {
    if (mode === "initial-advance") {
      if (billtoyear <= currentYear) {
        setError("Advance year to pay should be greater than " + currentYear);
        return;
      }
    }

    setLoading(true);
    setError(null);
    getBilling().then(bill => {
      dispatch({type: "SET_BILL", refno: refno, bill: bill.info});
      moveNextStep();
    }).catch(err => {
      if (/unpaid|full/ig.test(err)) {
        setMode("initial-advance");
      } else {
        setError(err.toString());
      }
      setLoading(false);
    })
  }

  return (
    <React.Fragment>
    <Card>
      <Title>{title}</Title>
      <Subtitle>Initial Information</Subtitle>
      <Spacer />
      <Error msg={error} />
      <Panel visibleWhen={mode === "initial"}>
        <Text
          caption='Tax Declaration No.'
          name='refno'
          value={refno}
          onChange={setRefno}
          readOnly={loading}
          autoFocus={true}
        />
      </Panel>

      <Panel visibleWhen={mode === "initial-advance"}>
        <p>
        The associated ledger is fully paid for the current year.<br/>
        To pay in advance, specify the year and click Next button.
        </p>
        <Spacer />
        <Panel>
          <Text
            caption='Tax Declaration No.'
            name='refno'
            value={refno}
            onChange={setRefno}
            readOnly={true}
          />
          <Integer
            caption="Advance Year to Pay"
            name="billtoyear"
            value={billtoyear}
            onChange={setBilltoyear}
            thousandSeparator={false}
            autoFocus={true}
          />
        </Panel>
      </Panel>
      <ActionBar>
        <BackLink caption='Back' variant="text" action={movePrevStep} />
        <Button caption='Next' action={loadBill} loading={loading} disabled={loading} />
      </ActionBar>
    </Card>
    </React.Fragment>
  )
}

export default InitialInfo
