package com.rameses.gov.etracs.landtax.models;

import com.rameses.common.*;
import com.rameses.rcp.common.*;
import com.rameses.rcp.annotations.*;
import com.rameses.osiris2.common.*;
import com.rameses.osiris2.client.*;
import com.rameses.seti2.models.*;

class BatchRPTTaxCreditModel extends CrudFormModel  
{
    @Binding
    def binding;

    @Service('BatchRPTTaxCreditService')
    def svc;

    def processing = false;
    def barangays = [];
    def task;
    def selectedItem;

    def STATE_DRAFT = 'DRAFT';
    def STATE_COMPLETED = 'COMPLETED';

    
    def oncancel = {
        processing = false;
        binding.refresh("formActions");
    };

    def oncomplete = {
        processing = false;
        entity.state = STATE_COMPLETED;
        persistenceService.update(entity);
        binding.refresh("formActions");
    };

    def updateStatus = {brgy ->
        listHandler.refresh();
    };
    

    void postCredits() {
        if (MsgBox.confirm("Post tax credits?")) {
            task = new BatchRPTTaxCreditPostingTask([
                svc: svc,
                entity: entity,
                oncancel: oncancel,
                oncomplete: oncomplete,
                updateStatus: updateStatus,
                barangays: barangays,
            ]);
            task.start();
            processing = true;
        }
    }

    void cancelPosting() {
        if (MsgBox.confirm("Cancel postiong?")) {
            task.cancel();
        }
    }

    def viewErrors() {
        return Inv.lookupOpener("vw_batch_rpttaxcredit_error:open", [entity: entity])
    }

    def listHandler = [
        fetchList: { 
            if (!barangays) {
                barangays = svc.getBarangays(entity);
            }
            return barangays;
        }
    ] as BasicListModel
    
}