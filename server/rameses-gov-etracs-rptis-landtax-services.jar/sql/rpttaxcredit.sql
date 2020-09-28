[getCreditYearPayments]
select
	rp.receiptid,
	rp.receiptno,
	rp.receiptdate as txndate,
  	min(qtr) as startqtr,
	max(qtr) as endqtr,
	sum(rpi.amount) as cr
from rptpayment rp 
inner join rptpayment_item rpi on rp.objid = rpi.parentid 
left join cashreceipt_void cv on rp.receiptid = cv.objid 
where rp.refid = $P{rptledgerid}
and rpi.year = $P{year}
and cv.objid is null 
group by rp.receiptid, rp.receiptno, rp.receiptdate

