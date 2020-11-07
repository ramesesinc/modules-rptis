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

  const [error, setError] = useState();
  const [errors, setErrors] = useState({});
  const [loading, setLoading] = useState(false);
  const [refno, setRefno] = useState();
  const [purpose, setPurpose] = useState();

  const getBilling = async () => {
    const svc = await Service.lookupAsync(`${partner.id}:OnlineRealtyTaxClearanceService`, "rpt");
    const params = { txntype, refno, purpose };
    return await svc.invoke("getBilling", params);
  }

  const validated = () => {
    if (!refno) setErrors({...errors, refno: "Tax Declaration No. is required."})
    if (!purpose) setErrors({...errors, purpose: "Purpose is required."})
    return Object.keys(errors).length === 0;
  }

  const loadBill = () => {
    if (validated()) {
      setLoading(true);
      setError(null);
      getBilling().then(bill => {
        dispatch({type: "SET_BILL", refno: refno, bill: bill});
        moveNextStep();
      }).catch(err => {
        setError(err.toString());
        setLoading(false)
      });
    }
  }

  return (
    <React.Fragment>
    <Card>
      <Title>{title}</Title>
      <Subtitle>Initial Information</Subtitle>
      <Spacer />
      <Error msg={error} />
      <Text
          caption='Tax Declaration No.'
          name='refno'
          value={refno}
          onChange={setRefno}
          readOnly={loading}
          autoFocus={true}
          error={errors.refno}
          helperText={errors.refno}
        />
        <Text
          caption='Purpose'
          name='purpose'
          value={purpose}
          onChange={setPurpose}
          readOnly={loading}
          error={errors.purpose}
          helperText={errors.purpose}
        />
      <ActionBar>
        <BackLink caption='Back' variant="text" action={movePrevStep} />
        <Button caption='Next' action={loadBill} loading={loading} disabled={loading} />
      </ActionBar>
    </Card>
    </React.Fragment>
  )
}

export default InitialInfo
