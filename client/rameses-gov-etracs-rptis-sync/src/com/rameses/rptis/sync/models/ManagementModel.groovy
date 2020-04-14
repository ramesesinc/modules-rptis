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
    
    void init() {
        
    }

    void refresh() {
    	outboxListHandler.reload();
    	inboxListHandler.reload();
    	orgListHandler.reload();
    	pendingListHandler.reload();
    }

    /* outbox support */

    def getOutboxItems() {
    	def p = [_schemaname: 'syncdata'];
    	p.where = ['orgid = :orgid AND remote.state = :active',  [orgid: OsirisContext.env.ORGID, active: 'ACTIVE']];
    	p.orderBy = 'dtfiled';
    	return qrySvc.getList(p);
    }

    def selectedOutboxItem;

    def outboxListHandler = [
    	fetchList: { outboxItems },
    	onOpenItem : {item, colName -> 
    		return Inv.lookupOpener('syncdata:open', [entity: item])
    	}
    ] as BasicListModel;

    def getOutboxItemDetails() {
    	if (!selectedOutboxItem) return [];

    	def p = [_schemaname: 'syncdata_item'];
    	p.findBy = [parentid: selectedOutboxItem.objid];
    	p.orderBy = 'idx';
    	return qrySvc.getList(p);
    }

	def outboxItemListHandler = [
		getRows: {outboxItemDetails.size()},
    	fetchList: { outboxItemDetails }
    ] as BasicListModel;



     /* inactive outbox support */



    def getInactiveItems() {
    	def p = [_schemaname: 'syncdata'];
    	p.where = ['orgid = :orgid AND remote.state = :inactive',  [orgid: OsirisContext.env.ORGID, inactive: 'INACTIVE']];
    	p.orderBy = 'dtfiled';
    	return qrySvc.getList(p);
    }

    def inactiveListHandler = [
    	fetchList: { inactiveItems }
    ] as BasicListModel;


	/* inbox support */

    def getInboxItems() {
    	def p = [_schemaname: 'syncdata'];
    	p.findBy =[remote_orgid: OsirisContext.env.ORGID];
    	p.orderBy = 'dtfiled';
    	return qrySvc.getList(p);
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
    	fetchList: { pendingItems }
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