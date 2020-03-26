/* 255-03020 */

alter table syncdata_item add async int
go 
alter table syncdata_item add dependedaction varchar(100)
go


create index ix_state on syncdata(state)
go
create index ix_state on syncdata_item(state)
go


create table syncdata_offline_org (
	orgid varchar(50) not null,
	expirydate datetime not null,
	primary key(orgid)
)
go


