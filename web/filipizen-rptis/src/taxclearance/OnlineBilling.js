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

  const checkoutPayment = () => {
    const po = { ...bill, barcode };
    const items = po.items;
    delete po.items;

    onSubmit({
      refno,
      txntype,
      origin,
      orgcode: partner.id,
      paidby: bill.paidby,
      paidbyaddress: bill.paidbyaddress,
      amount: bill.amount,
      particulars: `Realty Tax Clearance for TD No. ${bill.tdno}`,
      items: bill.billitems,
      info: {data: bill}
    })
  }

  const onCancelBilling = () => {
    onCancel(0);
  }

  return (
    <Card style={{maxWidth: 500}}>
      <Title>{title}</Title>
      <Subtitle>Billing Information</Subtitle>
      <Spacer />
      <Error msg={error} />
      <FormPanel context={bill} handler={setBill}>
          <Text name='tdno' caption='TD No.' readOnly />
          <Text name='pin' caption='PIN' readOnly />
          <Text name='owner.name' caption='Property Owner' readOnly />
          <Text name='owner.address' caption='Owner Address' readOnly />
          <Text name='purpose' caption='Purpose' readOnly />
          <Spacer />
          <Decimal name='amount' caption='Amount Due' readOnly textAlign="left" />
        </FormPanel>
      <ActionBar disabled={loading}>
        <BackLink caption='Back' action={onCancelBilling} />
        <Button caption='Confirm Payment' action={checkoutPayment} disableWhen={bill.amount === 0} />
      </ActionBar>
    </Card>
  )
}

export default OnlineBilling
