package com.rameses.gov.etracs.rptis.landtax.province.models;

import com.rameses.rcp.common.*;
import com.rameses.rcp.annotations.*;
import com.rameses.osiris2.client.*;
import com.rameses.osiris2.common.*;

class RPTLedgerModel
{
    @Binding 
    def binding;
    
    @Caller
    def caller;
    
    @Service('ProvinceRPTLedgerService')
    def svc;
    
    String title = 'Create Province Ledger';
    
    def mode; 
    def createMode = 'online'
    def msg; 
    def faas;
    def entity;
    def rputypes = ['land', 'bldg', 'mach', 'planttree', 'misc'];
    def quarters = [1,2,3,4];

    @PropertyChangeListener
    def listener = [
        'faas.rp.barangay': {
            if (faas.rp.barangay) {
                faas.fullpin = faas.rp.barangay.pin;
            } else {
                faas.fullpin = null;
            }
            binding.refresh("faas.fullpin");
        },
        'faas.taxpayer': {
            if (faas.taxpayer) {
                faas.owner = [name: faas.taxpayer.name];
            } 
            binding.refresh("faas.owner.*");
        },
        'faas.rpu.(classification|totalarea.*)' : {
            updateAreaValues();
        }
    ]

    void updateAreaValues() {
        if (faas.rpu.classification.name == 'AGRICULTURAL') {
            faas.rpu.totalareasqm = faas.rpu.totalareaha * 10000
        } else {
            faas.rpu.totalareaha = faas.rpu.totalareasqm / 10000
        }
    }
    
    def init() {
        faas = [owner:[:], administrator: [:], rpu: [:], rp: [:]];
        mode = 'init';
        createMode = svc.getCreateMode();
        return createMode == 'online' ?  'default'  : 'manual';
    }
    
    def onComplete = {
        msg = 'Loading newly created ledger...';
        binding.refresh('msg');
        if (hasCallerMethod('refresh', caller)) {
            caller.refresh();
        }
        
        def inv = Inv.lookupOpener('rptledger:open', [entity:entity]);
        binding.fireNavigation(inv);
        
        faas = null;
        mode = 'init';
        binding.refresh();
    }
    
    def onError = {err ->
        mode = 'ERROR';
        binding.refresh();
        MsgBox.alert(err);
    }
    
    
    def createLedger = {
        mode = 'processing';
        msg = 'Creating new ledger. Please wait...';
        binding.refresh('faas|msg');
        entity = svc.createLedger(faas);
    }
    
    def syncLedger = {
        msg = 'Synchronizing with municipal ledger. Please wait...';
        binding.refresh('msg');
        
        try {
            def params = [:]
            params.objid = entity.objid
            params.faasid = entity.faasid 
            params.tdno = entity.tdno
            params.barangayid = entity.barangayid 
            svc.syncLedger(params)
        } catch(e) {
            msg = null;
            println 'SyncLedger [ERROR] ' + e.message;
            binding.refresh('msg');
        }
    }
    
    def task = [
        run :  {
            try {
                createLedger();
                syncLedger();
                onComplete();
            } catch(e) {
                onError(e.message);
            }
        }
    ] as Runnable 
    
    def create(){
        if (createMode == 'online') {
            if (MsgBox.confirm('Create ledger?')){
                new Thread(task).start();
            }
            return null;
        } else {
            def ledger = svc.createManualLedger(faas);
            faas = [owner:[:], administrator: [:], rpu: [:], rp: [:]];
            binding.refresh('faas.*');
            def invoker = Inv.lookupOpener('rptledger:open', [entity: ledger]);
            invoker.target = 'self';
            return invoker;
        }
    }
    
    def getLookupFaas(){
        return Inv.lookupOpener('faas:lookup', [
            onselect : {
                if (!'CURRENT'.equalsIgnoreCase(it.state))
                    throw new Exception('FAAS is not current.')
                faas = it;
            },
            
            onempty : {
                faas = null;
            }
        ])
    }
    
    
    public def getSelectedItem(){
        return entity;
    }

    boolean hasCallerMethod( property, bean ) {
        if ( bean == null ) return false; 
        return bean.metaClass.respondsTo(bean, property ); 
    }   


    def getMunicipalities() {
        return svc.getMunicipalities();
    }

    def getBarangays() {
        if (faas.lgu && faas.lgu.objid) {
            return svc.getBarangays(faas.lgu);
        }
        return [];
    }

    def getTxntypes() {
        return svc.getTxnTypes();
    }

    def getClassifications() {
        return svc.getClassifications();
    }

    
    
}