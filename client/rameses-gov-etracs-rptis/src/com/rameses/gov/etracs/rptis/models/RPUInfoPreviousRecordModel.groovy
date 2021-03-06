package com.rameses.gov.etracs.rptis.models;

import com.rameses.rcp.annotations.* 
import com.rameses.rcp.common.* 
import com.rameses.osiris2.client.* 
import com.rameses.osiris2.common.* 
import com.rameses.gov.etracs.rptis.util.RPTUtil;

class RPUInfoPreviousRecordModel extends SubPageModel
{
    @Service('FAASService')
    def svc;

    @Service('Var')
    def var;
    
    def selectedItem;

    def taxabilities = ['TAXABLE', 'EXEMPT'];
    
    def listHandler = [
        createItem : {
            def item = [:];
            item.objid  = 'PF' + new java.rmi.server.UID();
            item.faasid = entity.objid;
            item.prevpin = entity.fullpin;
            item.prevowner = entity.owner?.name;
            item.prevadministrator = entity.administrator?.name;
            item.prevmv = 0;
            item.prevav = 0;
            item.prevareasqm = 0;
            item.prevareaha = 0;
            return item;
        },
        
        getRows   : { ( entity.previousfaases.size() <= 10 ? 10 : entity.previousfaases.size() + 1) },
        
        fetchList : { entity.previousfaases },
        
        onColumnUpdate : {item, colname -> 
            if ('prevtdno' == colname)
                buildPrevFaasInfo(item)
            else if ('prevmv' == colname)
                item.prevmv = format('#,##0.00', item.prevmv)
            else if ('prevav' == colname)
                item.prevav = format('#,##0.00', item.prevav)
            else if ('prevareasqm' == colname)
                updateAreaHa(item)
            else if ('prevareaha' == colname)
                updateAreaSqm(item)
        },
        
        onAddItem : {item -> 
            entity.previousfaases << item;
            updatePrevTdno();
        },
        
        onRemoveItem : {item ->
            if (MsgBox.confirm('Delete selected item?')){
                entity.previousfaases.remove(item);
                if (!entity._previousfaases) 
                    entity._previousfaases = [];
                entity._previousfaases << item;
                updatePrevTdno();
                return true;
            }
            return false;
        },
        
        validate : {li -> 
            def item = li.item;
            if (!item.prevtdno) throw new Exception('TD No. is required.');
            if (!item.prevpin) throw new Exception('PIN. is required.');
            if (item.prevmv == null) item.prevmv = 0.0;
            if (!item.prevav == null) item.prevav = 0.0;
            if (!item.prevareasqm == null) item.prevareasqm = 0.0;
            if (!item.prevareaha == null) item.prevareaha = 0.0;
            def dup = entity.previousfaases.find{it.prevtdno == item.prevtdno && it.objid != item.objid};
            if (dup) throw new Exception('Duplicate TD No. is not allowed.')
        },
        
    ] as EditorListModel
    
    
    void updatePrevTdno(){
        entity.prevtdno = null;
        if (entity.previousfaases){
            entity.prevtdno = entity.previousfaases.prevtdno.join(', ')
        }
    }
    
    def format(pattern, val){
        try{
            def tmp = val;
            if (tmp == null) tmp = '0.0';
            return RPTUtil.format(pattern, RPTUtil.toDecimal(tmp.toString().replace(',','')))
        }
        catch(e){
            return val;
        }
    }
    
    
    void updateAreaHa(item){
        if (item.prevareasqm == null)
            item.prevareasqm = '0.00'
        try{
            def val = RPTUtil.toDecimal(item.prevareasqm.replace(',',''));
            if (val >= 0.0)
                item.prevareaha = format('#,##0.000000', val / 10000.0);
            item.prevareasqm = format('#,##0.00', val);
        }
        catch(e){}
    }
    
    void updateAreaSqm(item){
        if (item.prevareaha == null)
            item.prevareaha = '0.00'
        try{
            def val = RPTUtil.toDecimal(item.prevareaha.replaceAll(',',''));
            if (val >= 0.0)
                item.prevareasqm = format('#,##0.00', val * 10000.0);
            item.prevareaha = format('#,##0.000000', val);
        }
        catch(e){}
    }
    
    void buildPrevFaasInfo(item){
        def faas = svc.getFaasByTdNo(item.prevtdno)
        def initSuperseded = RPTUtil.toBoolean(var.get('faas_datacapture_initialize_superseded'), true);
        if (faas && initSuperseded){
            item.prevfaasid = faas.objid;
            item.prevrpuid = faas.rpuid;
            item.prevpin = faas.fullpin;
            item.prevowner = faas.owner?.name;
            item.prevadministrator = faas.administrator?.name;
            item.prevav = RPTUtil.format('#,##0.00', faas.rpu.totalav);
            item.prevmv = RPTUtil.format('#,##0.00', faas.rpu.totalmv);
            item.prevareasqm = RPTUtil.format('#,##0.00', faas.rpu.totalareasqm);
            item.prevareaha = RPTUtil.format('#,##0.000000', faas.rpu.totalareaha);
            item.preveffectivity = faas.effectivityyear+'';
        }
        else{
            item.prevfaasid = null;
            item.prevrpuid = null;
            item.prevpin = entity.fullpin;
            item.prevowner = entity.owner?.name;
            item.prevadministrator = entity.administrator?.name;
            item.prevav = '0.00';
            item.prevmv = '0.00';
            item.prevareasqm = '0.00';
            item.prevareaha = '0.00';
            item.preveffectivity = null;
        }
    }
    
    
    def viewFaas(){
        if (selectedItem && selectedItem.prevfaasid){
            def faas = svc.openFaas([objid:selectedItem.prevfaasid]);
            if (faas){
                return InvokerUtil.lookupOpener('prevfaas:open',[entity:faas])
            }
        }
        return null;
    }
    
}    
    