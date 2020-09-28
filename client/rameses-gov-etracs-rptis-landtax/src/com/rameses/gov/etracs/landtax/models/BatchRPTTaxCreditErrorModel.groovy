package com.rameses.gov.etracs.landtax.models;

import com.rameses.common.*;
import com.rameses.rcp.common.*;
import com.rameses.rcp.annotations.*;
import com.rameses.osiris2.common.*;
import com.rameses.osiris2.client.*;
import com.rameses.seti2.models.*;

class BatchRPTTaxCreditErrorModel extends CrudListModel  
{
    def entity;
    
    public def getCustomFilter() {
        return ["parentid = :parentid", [parentid: entity.objid]];
    }
}