import React, { useState } from 'react'
import {
  Card,
  Panel,
  Text,
  Button,
  FormPanel,
  ActionBar,
  Spacer,
  Service,
  Error,
  Subtitle,
  Title,
  Decimal,
  BackLink,
  useData
} from 'rsi-react-web-components'

import PayOption from '../components/PayOption'

const origin = 'filipizen'

const OnlineBilling = ({
  title,
  partner,
  onCancel,
  onSubmit,
  error: paymentError
}) => {
  const [ctx, dispatch] = useData();
  const { refno, txntype, contact, bill: initialBill } = ctx;
  const [bill, setBill] = useState(initialBill);
  const [error, setError] = useState(paymentError);
  const [loading, setLoading] = useState(false)
  const [showPayOption, setShowPayOption] = useState(false)
  const [year, setYear] = useState()
  const [qtr, setQtr] = useState()
  const [barcode, setBarcode] = useState()

  const getBilling = async (billOptions = {}) => {
    const svc = await Service.lookupAsync(`${partner.id}:OnlineLandTaxBillingService`, "rpt")
    const params = { txntype, refno, ...billOptions }
    return await svc.invoke("getBilling", params);
  }

  const loadBill = (billOptions = {}) => {
    setLoading(true);
    setError(null);
    getBilling(billOptions).then(bill => {
      setBill(bill.info);
      setBarcode(bill.info.billno);
      setLoading(false)
    }).catch(err => {
      setError(err.toString());
      setLoading(false)
    })
  }

  const payOptionHandler = (billOption) => {
    setShowPayOption(false)
    loadBill(billOption)
  }

  const checkoutPayment = () => {
    const po = { ...bill, barcode };
    const items = po.items;
    delete po.items;

    onSubmit({
      refno,
      txntype,
      origin,
      orgcode: partner.id,
      billtoyear: bill.billtoyear,
      billtoqtr: bill.billtoqtr,
      paidby: bill.paidby,
      paidbyaddress: bill.paidbyaddress,
      amount: bill.amount,
      particulars: `Real Property TD No. ${bill.tdno} ${bill.billperiod}`,
      items: items,
      info: {data: po},
    })
  }

  const onCancelBilling = () => {
    onCancel(0);
  }

  const visibleContactInfo = !contact.email ? false : contact.email === bill.email;

  return (
    <Card style={{maxWidth: 500}}>
      <Title>{title}</Title>
      <Subtitle>Billing Information</Subtitle>
      <Spacer />
      <Error msg={error} />
      <FormPanel context={bill} handler={setBill}>
        <Panel row>
          <Text name='billno' caption='Bill No.' readOnly />
          <Text name='billdate' caption='Bill Date' readOnly />
        </Panel>
        <Text name='tdno' caption='TD No.' readOnly />
        <Text name='fullpin' caption='PIN' readOnly />
        <Text name='taxpayer.name' caption='Property Owner' readOnly visibleWhen={visibleContactInfo} />
        <Text name='taxpayer.address' caption='Owner Address' readOnly visibleWhen={visibleContactInfo} />
        <Text name='billperiod' caption='Bill Period' readOnly />
        <Decimal name='amount' caption='Amount Due' readOnly textAlign="left" />
      </FormPanel>
      <ActionBar disabled={loading}>
        <BackLink caption='Back' action={onCancelBilling} />
        <Panel row>
          <Button caption='Pay Option' action={() => setShowPayOption(true)} variant="outlined" />
          <Button caption='Confirm Payment' action={checkoutPayment} disableWhen={bill.amount === 0} />
        </Panel>
      </ActionBar>

      <PayOption
        initialValue={
          bill && {
            billtoyear: bill.billtoyear,
            billtoqtr: bill.billtoqtr,
            fromyear: bill.fromyear,
          }
        }
        open={showPayOption}
        onAccept={payOptionHandler}
        onCancel={() => setShowPayOption(false)}
      />
    </Card>
  )
}

export default OnlineBilling
