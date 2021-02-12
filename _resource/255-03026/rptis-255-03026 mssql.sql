
INSERT INTO sys_var ([name], [value], [description], [datatype], [category]) 
VALUES ('fileserver_download_task_active', '0', 'Activate / Deactivate download task', 'boolean', 'SYSTEM')
go



CREATE TABLE rpt_syncdata_completed (
  [objid] varchar(255) NOT NULL,
  [idx] int DEFAULT NULL,
  [action] varchar(100) DEFAULT NULL,
  [refno] varchar(50) DEFAULT NULL,
  [refid] varchar(50) DEFAULT NULL,
  [reftype] varchar(50) DEFAULT NULL,
  [parent_orgid] varchar(50) DEFAULT NULL,
  [sender_name] varchar(255) DEFAULT NULL,
  [sender_title] varchar(255) DEFAULT NULL,
  [dtcreated] datetime DEFAULT NULL,
  PRIMARY KEY (objid)
)
go 

CREATE INDEX ix_refno ON rpt_syncdata_completed (refno)
go
CREATE INDEX ix_refid ON rpt_syncdata_completed (refid)
go
CREATE INDEX ix_parent_orgid ON rpt_syncdata_completed (parent_orgid)
go