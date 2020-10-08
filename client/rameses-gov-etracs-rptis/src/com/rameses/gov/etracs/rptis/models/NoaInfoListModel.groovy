package com.rameses.gov.etracs.rptis.models;

import com.rameses.rcp.common.*;
import com.rameses.rcp.annotations.*;
import com.rameses.osiris2.client.*;
import com.rameses.osiris2.common.*
import com.rameses.osiris2.reports.*;

public class NoaInfoListModel
{
    @Binding
    def binding;
    
    @Service('RPTAssessmentNoticeService')
    def noticeSvc;

    @Service('PersistenceService')
    def persistence;
    
    def entity;
    def selectedItem;
    def notices;
    boolean printing = false;
    def printTask;
    def noaTask;
    def msg;
    def mode = 'view';
    
    
    void init() {
        notices = noticeSvc.getNoticesByRef([objid: entity.objid]);
    }
    
    def listHandler = [
        getRows   : { return notices.size(); },
        fetchList : { return notices; },
        getColumns  : { return [
            new Column(name:'txnno', caption:'Txn No.', editable:false, ),
            new Column(name:'tdno', caption:'TD No.', editable:true, width:150, required:true),
        ]},
    ] as BasicListModel;
    
    
    def reportopener;
    
    def getOpener(){
        if (printing) {
            return reportopener;
        }
       
        reportopener = null;
        if (selectedItem) {
            selectedItem._schemaname = 'assessmentnotice';
            def noa = persistence.read(selectedItem);
            reportopener = InvokerUtil.lookupOpener('assessmentnotice:report', [entity: noa]);
        }
        return reportopener;
    }
    
    void cancelPrinting(){
        printTask.cancelled = true;
        printing = false;
    }
    
    
    
    def oncomplete = {
        printing = false;
        mode = 'read';

        binding.refresh('printAll|cancelPrinting');
    }
    
    def onprogress = {
        msg = it;
        binding.refresh('msg');
    }
    
    def printAll(){
        if (!notices) {
            return;
        }

        def onFilter = {filteredList ->
            printTask = new PrintTask(
                notices: filteredList, 
                oncomplete: oncomplete, 
                onprogress: onprogress, 
                persistence: persistence,
                noticeSvc: noticeSvc
            );
            Thread t = new Thread(printTask);
            t.start();
            printing = true;
        }

        return Inv.lookupOpener('faas:report:filter', [onFilter: onFilter, list: notices]);
    }

    def getShowGenerateNoa() {
        return !notices.size();
    }

    void generateNoa() {
        def msg = 'Individual Notice of Assessment for each new FAAS would be generated.\nProceed?'
        if (!MsgBox.confirm(msg))  {
            return;
        }

        def reloadNotices = {
            init();
            listHandler.reload();
        }

        noaTask = new NoaTask(svc: noticeSvc, entity: entity, oncomplete:oncomplete, reloadNotices: reloadNotices);
        Thread t = new Thread(noaTask);
        t.start();
        mode = 'processing';
    }
    
}


public class PrintTask implements Runnable
{
    def notices;
    boolean cancelled;
    def oncomplete;
    def onprogress;
    def persistence;
    def noticeSvc;
    
    public void run(){
        int count = 0;
        cancelled = false;
        
        for(int i=0; i < notices.size(); i++){
            if (cancelled) 
                break;

            try {
                def notice = notices[i];
                notice._schemaname = 'assessmentnotice';
                def noa = persistence.read(notice);
                def o = InvokerUtil.lookupOpener('assessmentnotice:report', [entity: noticeSvc.open(noa)]);
                if (o){
                    // o.handle.report.viewReport();
                    ReportUtil.print(o.handle.report.report, false);
                }
                count += 1;
                onprogress('Printing ' + noa.txnno);
                
                try{
                    Thread.sleep(2000);
                }
                catch(e){
                    //ignore
                }
            } catch (e ) {
                e.printStackTrace();
            }
        }
        
        onprogress('');
        oncomplete();
    }   
}



public class NoaTask implements Runnable
{
    def entity;
    def faases;
    boolean cancelled;
    def oncomplete;
    def svc;
    def reloadNotices;
    
    public void run(){
        int count = 0;
        cancelled = false;

        def faases = svc.getFaasesForNoaByRef([objid: entity.objid]);
        
        for(int i=0; i < faases.size(); i++){
            if (cancelled) {
                break;
            }

            def faas = faases[i];
            def noa = svc.loadNotice([:], faas);
            
            try{
                Thread.sleep(500);
            }
            catch(e){
                //ignore
            }
        }
        reloadNotices();
        oncomplete();
    }   
}