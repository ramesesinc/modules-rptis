package com.rameses.gov.etracs.landtax.models;


import com.rameses.rcp.common.*;
import com.rameses.rcp.annotations.*;
import com.rameses.osiris2.client.*;


class BatchRPTTaxCreditPostingTask implements Runnable
{
    def svc;
    def entity;
    def oncancel = {};    
    def oncomplete = {};
    def updateStatus = {};
    def cancelled = false;
    def barangays = []; 
    
    
    public void start() { 
        new Thread(this).start(); 
    } 
    
    public void run(){
        cancelled = false; 
        barangays.each {brgy -> 
            if (cancelled) {
                oncancel();
                return;
            }
            def ledgers = svc.getLedgers([batchid: entity.objid, barangayid: brgy.objid]);
            def count = ledgers.size();
            while (count > 0) {
                if (cancelled) break;
                def ledger = ledgers.remove(0);
                def res = svc.postTaxCredit([batch: entity, rptledger: ledger]);
                if (res.status == "OK") {
                    brgy.forpostingcount--;
                    brgy.postedcount++;
                } else {
                    brgy.forpostingcount--;
                    brgy.errorcount++;
                }
                updateStatus(brgy);
                count = ledgers.size();
            }
            brgy.completed = true;
        }   

        if (!cancelled) {
            oncomplete();
        }
    }
    
    public void cancel() {
        cancelled = true; 
    }
}