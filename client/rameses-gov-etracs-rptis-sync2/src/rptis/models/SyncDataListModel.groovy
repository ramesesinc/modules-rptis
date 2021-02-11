package rptis.models;

import com.rameses.rcp.annotations.*;
import com.rameses.rcp.common.*;
import com.rameses.osiris2.common.*;
import com.rameses.osiris2.client.*;
import com.rameses.seti2.models.*;

class SyncDataListModel extends CrudListModel  
{
    @Service('RPTSyncDataManagementService')
    def svc;

    void rescheduleErrors() {
        if (MsgBox.confirm('Reschedule all errors?')) {
            svc.rescheduleErrors();
            reload();
        }
    }

    void deleteAllErrors() {
        if (MsgBox.confirm('Delete all errors from file server?')) {
            svc.deleteErrors();
            reload();
        }
    }
}