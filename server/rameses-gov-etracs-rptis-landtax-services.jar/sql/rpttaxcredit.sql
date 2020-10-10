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


[findTaxDueFromLedgerItem]
select 
	x.taxdue, 
	x.av, 
	(x.taxdue / x.av * 100) as rateoflevy
from (
	select 
		sum(amount) as taxdue, 
		min(av) as av
	from rptledger_item 
	where parentid = $P{rptledgerid}
	and year = $P{year}
)x


[findTaxDueFromPaymentItem]
select 
	x.taxdue, 
	x.av, 
	(x.taxdue / x.av * 100) as rateoflevy
from (
	select 
		sum(rpi.amount) as taxdue, 
		min(rlf.assessedvalue) as av
	from rptpayment rp
	inner join rptpayment_item rpi on rpi.parentid = rp.objid 
	inner join rptledgerfaas rlf on rpi.rptledgerfaasid = rlf.objid 
	left join cashreceipt_void cv on rp.receiptid = cv.receiptid 
	where rp.refid = $P{rptledgerid}
	and year = $P{year}
	and cv.objid is null 
)x

