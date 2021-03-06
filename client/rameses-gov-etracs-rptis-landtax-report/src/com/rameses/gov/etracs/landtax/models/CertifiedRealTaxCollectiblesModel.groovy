package com.rameses.gov.etracs.landtax.models;

import com.rameses.rcp.common.*;
import com.rameses.rcp.annotations.*;
import com.rameses.osiris2.client.*;
import com.rameses.osiris2.reports.*;

class CertifiedRealTaxCollectiblesModel extends com.rameses.gov.etracs.rpt.report.AsyncReportController
{
    @Service('LandTaxReportCertifiedCollectibleService') 
    def svc
    
    String title = 'Certified List of Real Property Tax Collectibles';
    String reportName = 'com/rameses/gov/etracs/rpt/report/landtax/certified_realty_tax_collectibles.jasper'
    
    void buildReportData(entity, asyncHandler){
        svc.buildReport(entity, asyncHandler);
    }
    
    def initReport(){
        entity.basicrate = 1.0
        entity.sefrate = 1.0
        return 'default'
    }
    

    def formControl = [
         getFormControls: {
             return [
                new FormControl( "combo", [captionWidth:100, caption:'LGU', name:'entity.lgu', required:true, allowNull:false, items:'lgus', expression:'#{item.name}']),
                new FormControl( "combo", [captionWidth:100, caption:'Barangay', name:'entity.barangay', required:true, allowNull:false, items:'barangays', expression:'#{item.name}', depends:'entity.lgu', dynamic:true, preferredSize:'0,21']),
                 new FormControl( "integer", [captionWidth:100, caption:'Year', name:'entity.year', required:true]),
                 new FormControl( "decimal", [captionWidth:100, caption:'Basic (%)', name:'entity.basicrate', required:true, scale:4, pattern:'##0.0000']),
                 new FormControl( "decimal", [captionWidth:100, caption:'SEF (%)', name:'entity.sefrate', required:true, scale:4, pattern:'##0.0000']),
             ]    
         },
    ] as FormPanelModel;

}