package com.rameses.rptis.sync.models;

import com.rameses.rcp.annotations.*;
import com.rameses.rcp.common.*;
import com.rameses.osiris2.common.*;
import com.rameses.osiris2.client.*;
import com.rameses.seti2.models.*;

class SyncDataListModel extends CrudListModel  
{
    @Service('RPTSyncDataManagementService')
    def svc;

    void clearAll() {
        if (MsgBox.confirm('Clear all errors?')) {
            svc.clearAllErrors();
            reload();
        }
    }
}