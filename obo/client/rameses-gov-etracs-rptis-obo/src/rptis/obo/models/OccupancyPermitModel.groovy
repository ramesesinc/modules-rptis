import com.rameses.rcp.annotations.*;
import com.rameses.rcp.common.*;
import com.rameses.osiris2.common.*
import com.rameses.osiris2.client.*
import com.rameses.seti2.models.*;

class OccupancyPermitModel extends CrudFormModel {
    @Service(value="RptOboPluginService", connection="rpt")
    def svc;
    
    def faas = [:];
    
    public void afterOpen() {
        if (entity.faasid) {
            faas = svc.openFaas([objid: entity.faasid]);
        }
    }
           
    def viewBldgFaas() {
        def wu = entity.state == 0 ? 'faas:open' : 'faas:open:closedwf';
        def invoker = Inv.lookupOpener(wu, [entity: [objid: entity.faasid]]);
        invoker.target = "self";
        return invoker;
    }
    
    def openFaas(bldgfaas) {
        reload();
        afterOpen();
        binding?.refresh();
    }
}