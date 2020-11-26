import com.rameses.rcp.annotations.*;
import com.rameses.rcp.common.*;
import com.rameses.osiris2.common.*
import com.rameses.osiris2.client.*

class BuildingFaasCreateModel {
    @Caller
    def caller;

    @Service(value="RptOboPluginService", connection="rpt")
    def svc;

    @FormTitle
    String title = "Occupancy Building FAAS";
    
    def entity;
    def rpus;
    
    void init() {
        entity = entity ? entity : caller.selectedItem;
        updateTaxpayer();
        rpus = svc.getRpus([bldgappid: entity.bldgappid]);
    }

    // def open() {
    //     def wu = entity.state == 0 ? 'faas:open' : 'faas:open:closedwf';
    //     return Inv.lookupOpener(wu, [entity: [objid: entity.faasid]]);
    // }
    
    def submit() {
        if (MsgBox.confirm("Submit and create building FAAS?")) {
            def bldgfaas = svc.createFaas(entity);
            entity.state = 1;
            entity.faasid = bldgfaas.objid;
            def invoker = Inv.lookupOpener('faas:open', [entity: bldgfaas]);
            invoker.target = "self";
            return invoker;
        }
    }

    def viewLandFaas() {
        return Inv.lookupOpener('faas:open:closedwf', [entity: [objid: entity.landfaas.refid]]);
    }
    
    def viewBuildingFaas() {
        def wu = entity.state == 0 ? 'faas:open' : 'faas:open:closedwf';
        def invoker = Inv.lookupOpener(wu, [entity: [objid: entity.faasid]]);
        invoker.target = "self";
        return invoker;
    }

    void updateTaxpayer() {
        def applicant = entity.applicant;
        if (applicant.profileid) {
            entity.taxpayer = [
                objid: applicant.profileid,
                name: applicant.name,
                addresstext: applicant.address.text
            ]
        }
    }
}