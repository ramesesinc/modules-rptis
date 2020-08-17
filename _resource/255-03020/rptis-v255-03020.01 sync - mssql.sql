
drop table syncdata_offline_org
go


CREATE TABLE syncdata_org (
  orgid varchar(50) NOT NULL,
  state varchar(50) NOT NULL,
  errorcount int,
  PRIMARY KEY (orgid)
) 
go

create index ix_state on syncdata_org(state)
;

insert into syncdata_org (
  orgid, 
  state, 
  errorcount
)
select 
  objid,
  'ACTIVE',
  0
from sys_org
where orgclass = 'province'
;


drop table syncdata_forprocess
go 

CREATE TABLE syncdata_forprocess (
  objid varchar(50) NOT NULL,
  PRIMARY KEY (objid)
) 
go




