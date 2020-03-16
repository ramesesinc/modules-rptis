package com.rameses.rptis.sync.models;

import com.rameses.rcp.annotations.*;
import com.rameses.rcp.common.*;
import com.rameses.osiris2.common.*;
import com.rameses.osiris2.client.*;
import com.rameses.seti2.models.*;

class SyncDataModel extends CrudFormModel {
    @Service('QueryService')
    def qrySvc;
    
    def listHandler = [
        fetchList: { getItems() }
    ] as BasicListModel;
    
    def getItems() {
        def p = [_schemaname: 'syncdata_item'];
        p.findBy = [parentid: entity.objid];
        p.orderBy = 'idx';
        return qrySvc.getList(p);
    }
}