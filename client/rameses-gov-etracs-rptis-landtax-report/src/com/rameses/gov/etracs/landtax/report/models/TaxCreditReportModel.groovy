package com.rameses.gov.etracs.landtax.report.models;

import com.rameses.rcp.common.*;
import com.rameses.rcp.annotations.*;
import com.rameses.osiris2.client.*;
import com.rameses.osiris2.common.*;
import com.rameses.osiris2.reports.*;
import com.rameses.etracs.shared.*;

class TaxCreditReportModel
{
    @Service('LandTaxReportTaxCreditService')
    def svc 

    @Service("ReportParameterService")
    def reportSvc;
    
    def entity;
    def data = [:]
    def mode;
    
    String title = 'Realty Tax Credit'
    
    def reportName = 'com/rameses/gov/etracs/landtax/reports/rpttaxcredit.jasper'
    
    def preview() {
        buildReportInfo()
        mode = 'preview'
        return 'preview'
    }
    
    
    void buildReportInfo(){
        data = svc.getReportData([objid:entity.objid])
        report.viewReport()
    }

               
    def report = [
        getReportName : { return reportName },
        getSubReports  : { return null },
        getReportData : { return data.items },
        getParameters : { return reportSvc.getStandardParameter() }
    ] as ReportModel
    

}
