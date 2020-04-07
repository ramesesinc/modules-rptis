/* 255-03020 */

alter table syncdata_item add async int default 0
;
alter table syncdata_item add dependedaction varchar(100)
;

create index ix_state on syncdata(state)
;
create index ix_state on syncdata_item(state)
;

create table syncdata_offline_org (
	orgid varchar(50) not null,
	expirydate datetime not null,
	primary key(orgid)
)
;




/*=======================================
*
*  QRRPA: Mixed-Use Support
*
=======================================*/

drop view if exists vw_rpu_assessment
;

create view vw_rpu_assessment as 
select 
	r.objid,
	r.rputype,
	dpc.objid as dominantclass_objid,
	dpc.code as dominantclass_code,
	dpc.name as dominantclass_name,
	dpc.orderno as dominantclass_orderno,
	ra.areasqm,
	ra.areaha,
	ra.marketvalue,
	ra.assesslevel,
	ra.assessedvalue,
	ra.taxable,
	au.code as actualuse_code, 
	au.name  as actualuse_name,
	auc.objid as actualuse_objid,
	auc.code as actualuse_classcode,
	auc.name as actualuse_classname,
	auc.orderno as actualuse_orderno
from rpu r 
inner join propertyclassification dpc on r.classification_objid = dpc.objid
inner join rpu_assessment ra on r.objid = ra.rpuid
inner join landassesslevel au on ra.actualuse_objid = au.objid 
left join propertyclassification auc on au.classification_objid = auc.objid

union 

select 
	r.objid,
	r.rputype,
	dpc.objid as dominantclass_objid,
	dpc.code as dominantclass_code,
	dpc.name as dominantclass_name,
	dpc.orderno as dominantclass_orderno,
	ra.areasqm,
	ra.areaha,
	ra.marketvalue,
	ra.assesslevel,
	ra.assessedvalue,
	ra.taxable,
	au.code as actualuse_code, 
	au.name  as actualuse_name,
	auc.objid as actualuse_objid,
	auc.code as actualuse_classcode,
	auc.name as actualuse_classname,
	auc.orderno as actualuse_orderno
from rpu r 
inner join propertyclassification dpc on r.classification_objid = dpc.objid
inner join rpu_assessment ra on r.objid = ra.rpuid
inner join bldgassesslevel au on ra.actualuse_objid = au.objid 
left join propertyclassification auc on au.classification_objid = auc.objid

union 

select 
	r.objid,
	r.rputype,
	dpc.objid as dominantclass_objid,
	dpc.code as dominantclass_code,
	dpc.name as dominantclass_name,
	dpc.orderno as dominantclass_orderno,
	ra.areasqm,
	ra.areaha,
	ra.marketvalue,
	ra.assesslevel,
	ra.assessedvalue,
	ra.taxable,
	au.code as actualuse_code, 
	au.name  as actualuse_name,
	auc.objid as actualuse_objid,
	auc.code as actualuse_classcode,
	auc.name as actualuse_classname,
	auc.orderno as actualuse_orderno
from rpu r 
inner join propertyclassification dpc on r.classification_objid = dpc.objid
inner join rpu_assessment ra on r.objid = ra.rpuid
inner join machassesslevel au on ra.actualuse_objid = au.objid 
left join propertyclassification auc on au.classification_objid = auc.objid

union 

select 
	r.objid,
	r.rputype,
	dpc.objid as dominantclass_objid,
	dpc.code as dominantclass_code,
	dpc.name as dominantclass_name,
	dpc.orderno as dominantclass_orderno,
	ra.areasqm,
	ra.areaha,
	ra.marketvalue,
	ra.assesslevel,
	ra.assessedvalue,
	ra.taxable,
	au.code as actualuse_code, 
	au.name  as actualuse_name,
	auc.objid as actualuse_objid,
	auc.code as actualuse_classcode,
	auc.name as actualuse_classname,
	auc.orderno as actualuse_orderno
from rpu r 
inner join propertyclassification dpc on r.classification_objid = dpc.objid
inner join rpu_assessment ra on r.objid = ra.rpuid
inner join planttreeassesslevel au on ra.actualuse_objid = au.objid 
left join propertyclassification auc on au.classification_objid = auc.objid

union 

select 
	r.objid,
	r.rputype,
	dpc.objid as dominantclass_objid,
	dpc.code as dominantclass_code,
	dpc.name as dominantclass_name,
	dpc.orderno as dominantclass_orderno,
	ra.areasqm,
	ra.areaha,
	ra.marketvalue,
	ra.assesslevel,
	ra.assessedvalue,
	ra.taxable,
	au.code as actualuse_code, 
	au.name  as actualuse_name,
	auc.objid as actualuse_objid,
	auc.code as actualuse_classcode,
	auc.name as actualuse_classname,
	auc.orderno as actualuse_orderno
from rpu r 
inner join propertyclassification dpc on r.classification_objid = dpc.objid
inner join rpu_assessment ra on r.objid = ra.rpuid
inner join miscassesslevel au on ra.actualuse_objid = au.objid 
left join propertyclassification auc on au.classification_objid = auc.objid
;
