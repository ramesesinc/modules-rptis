import React from 'react'
import { Page, Panel, Content } from 'rsi-react-web-components'

import { EPayment } from 'rsi-react-filipizen-components'
import OnlineTaxClearance from './OnlineTaxClearance'

const RealtyTaxClearanceWebController = (props) => {
  const module = {
    title: 'Online Realty Tax Clearance',
    component: OnlineTaxClearance
  }
  return (
    <Page>
      <Content center>
        <Panel>
          <EPayment module={module} {...props} />
        </Panel>
      </Content>
    </Page>
  )
}

export default RealtyTaxClearanceWebController
