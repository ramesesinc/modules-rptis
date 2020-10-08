package com.rameses.gov.etracs.rptis.models;
        
import com.rameses.rcp.annotations.* 
import com.rameses.rcp.common.* 
import com.rameses.osiris2.client.*
import com.rameses.osiris2.common.*

public class FAASFilterModel
{
    def entity = [:];
    def onFilter = {};
    def list;
    
    def filter() {
        if (!entity.starttdno && !entity.endtdno) {
            onFilter(list);
        } else {
            def filteredList = [];
            filteredList = list.findAll { 
                // start and end are specified
                if (entity.starttdno && entity.endtdno) {
                    if (it.tdno >= entity.starttdno && it.tdno <= entity.endtdno) {
                        return true;
                    }
                    return false;
                } 
                
                //start only is specified
                if (entity.starttdno ) {
                    if (it.tdno >= entity.starttdno ) {
                        return true;
                    }
                    return false;
                } 
                
                //end only is specified
                if (it.tdno <= entity.endtdno ) {
                    return true;
                }
                return false;
            }
            onFilter(filteredList);
        }
        return "_close";
    }
}


