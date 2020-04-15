package com.rameses.gov.etracs.rptis.models;

import com.rameses.rcp.annotations.* 
import com.rameses.rcp.common.* 
import com.rameses.osiris2.client.*
import com.rameses.osiris2.common.*
import com.rameses.gov.etracs.rptis.util.RPTUtil;

class SubdivisionCancelledImprovementModel
{
    @Binding
    def binding;
    
    @Caller
    def caller;
    

    @Service('CancelledFAASService')
    def cancelSvc 

    String entityName = 'cancelledimprovement'

    def svc;
    
    def entity;
    def selectedItem;
    def cancelledrpus;
    def mode;
    
    
    def MODE_READ = 'read';
    def MODE_EDIT = 'edit';
    
    String title = 'Cancelled Improvements';

    def getEntity() {
        return selectedItem;
    }
    
    void init(){
        cancelledrpus = svc.getCancelledImprovements(this.entity.objid);
        listHandler?.load();
        mode = MODE_READ;
    }
    
    void edit(){
        caller.addMessage([type:'cancelledimprovement', msg:'Cancelled Affected Improvements still in editing mode.']);
        mode = MODE_EDIT;
    }
    
    void save(){
        caller.clearMessages('cancelledimprovement');
        mode = MODE_READ;
    }


    def getCancelReasons(){
        return cancelSvc.getCancelReasons()
    }
   
    def improvement;

    def modifyCancel(){
        if (selectedItem ){
            improvement = [:]
            improvement.putAll(selectedItem)
            return new PopupOpener(outcome:'cancelinfo');
        }
        return null; 
    }

    
    def doSaveCancelledImprovement(){
        if (MsgBox.confirm('Update cancellation?')){
            svc.updateCancelledImprovement(improvement);
            selectedItem.putAll(improvement);
            listHandler.refreshSelectedItem();
            return '_close'
        }
    }    
    
    void undoCancel(){
        if (selectedItem && MsgBox.confirm('Undo cancellation?')){
            svc.undoCancelledImprovement(selectedItem);
            cancelledrpus.remove(selectedItem);
            listHandler.reload();
        }
    }
    
    def listHandler = [
        getRows : { return cancelledrpus.size() + 1 },
        fetchList : { return cancelledrpus },
    ] as BasicListModel 
            
    boolean getShowActions(){
        if (this.entity.taskstate && this.entity.taskstate.matches('assign.*')) return false;
        if (this.entity.taskstate && !this.entity.taskstate.matches('.*taxmapper.*')) return false;
        if (this.entity.state.matches('APPROVED')) return false;
        if (mode != MODE_READ) return false;
        return true;
    }
    
    boolean getAllowEdit(){
        return mode != MODE_READ
    }
    
}
       