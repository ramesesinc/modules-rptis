import com.rameses.rcp.annotations.*;
import com.rameses.rcp.common.*;
import com.rameses.osiris2.common.*
import com.rameses.osiris2.client.*

class BuildingFaasCreateModel {
    @Caller
    def caller;

    @Service("RptOboService")
    def svc;

    @FormTitle
    String title = "Occupancy Building FAAS";
    
    def occupancy;
    def entity;
    
    void init() {
        entity = svc.init(caller.selectedItem);
        occupancy = entity.occupancy;
    }
    
    def submit() {
        def bldgfaas = svc.submit(entity);
        occupancy.state = "PROCESSING";
        def invoker = Inv.lookupOpener('faas:open', [entity:bldgfaas]);
        invoker.target = "self";
        return invoker;
    }

    def cancel() {
        return "_close";
    }
}