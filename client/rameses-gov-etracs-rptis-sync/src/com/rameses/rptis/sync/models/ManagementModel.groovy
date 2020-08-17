package com.rameses.rptis.sync.models;

import com.rameses.rcp.annotations.*;
import com.rameses.rcp.common.*;
import com.rameses.osiris2.common.*;
import com.rameses.osiris2.client.*;

class ManagementModel  {
    @Service('QueryService')
    def qrySvc;

    @Service('PersistenceService')
    def persistence;

    @Service('RPTSyncManagementService')
    def svc;

    def timer;
    
    void init() {
        timer = new Thread(new TimerTask(refreshScreen));
        timer.start();
    }

    void refresh() {
    	outboxListHandler.reload();
    	inboxListHandler.reload();
    	orgListHandler.reload();
    	pendingListHandler.reload();
    }

    def refreshScreen = {
        refresh();
    }

    /* outbox support */

    def getOutboxItems() {
        return svc.getOutboxItems([orgid: OsirisContext.env.ORGID])
    }

    def selectedOutboxItem;

    def outboxListHandler = [
    	fetchList: { outboxItems },
    	onOpenItem : {item, colName -> 
    		return Inv.lookupOpener('syncdata:open', [entity: item])
    	}
    ] as BasicListModel;



     /* inactive outbox support */

    def getInactiveItems() {
    	def p = [_schemaname: 'syncdata'];
    	p.where = ['orgid = :orgid AND remote.state = :inactive',  [orgid: OsirisContext.env.ORGID, inactive: 'INACTIVE']];
    	p.orderBy = 'dtfiled';
    	return qrySvc.getList(p);
    }

    def inactiveListHandler = [
    	fetchList: { inactiveItems },
        onOpenItem : {item, colName -> 
            return Inv.lookupOpener('syncdata:open', [entity: item])
        }
    ] as BasicListModel;


	/* inbox support */

    def getInboxItems() {
        return svc.getInboxItems([remoteorgid: OsirisContext.env.ORGID])
    }

    def selectedInboxItem;

    def inboxListHandler = [
    	fetchList: { inboxItems }
    ] as BasicListModel;



	/* pending support */

    def getPendingItems() {
    	def p = [_schemaname: 'syncdata'];
    	p.where = ['orgid = :orgid AND pending.objid IS NOT NULL', [orgid: OsirisContext.env.ORGID]];
    	p.orderBy = 'dtfiled';
    	return qrySvc.getList(p);
    }

    def selectedPendingItem;

    def pendingListHandler = [
    	fetchList: { pendingItems },
        onOpenItem : {item, colName -> 
            return Inv.lookupOpener('syncdata:open', [entity: item])
        }
    ] as BasicListModel;


    /* org support */
    def getOrgs() {
    	def p = [_schemaname: 'syncdata_org'];
    	p.where = ['1=1'];
    	p.orderBy = 'orgid';
    	return qrySvc.getList(p);
    }

    def selectedOrg;

    def orgListHandler = [
    	fetchList: { orgs }
    ] as BasicListModel;


    void activateOrg() {
    	updateOrgState('Activate?', 'ACTIVE')
    }

    void deactivateOrg() {
    	updateOrgState('Deactivate?', 'INACTIVE')
    }

    void updateOrgState(title, state) {
    	if (!selectedOrg) return;
    	if (MsgBox.confirm(title)) {
	    	selectedOrg._schemaname = 'syncdata_org';
	    	selectedOrg.state = state;
	    	selectedOrg.errorcount = 0;
	    	persistence.update(selectedOrg);
	    	orgListHandler.refresh();
    	}
    }

}

class TimerTask  implements Runnable {
        def refreshScreen;

        TimerTask(refreshScreen) {
            this.refreshScreen = refreshScreen;
        }

        public void run() {
            while ( true) {
                try {
                    refreshScreen();
                    sleep(5000)
                } catch (e) {
                    //ignore 
                }
            }
        }
    }
