[getBarangays]
select 
	x.objid,
	x.barangay, 
	sum(x.forpostingcount) as forpostingcount,
	sum(x.errorcount) as errorcount,
	sum(x.postedcount) as postedcount
from (

	select 
		b.objid, 
		b.name as barangay, 
		sum(case when br.state <> 'ERROR' then 1 else 0 end ) as forpostingcount, 
		sum(case when br.state = 'ERROR' then 1 else 0 end ) as errorcount, 
		0 as postedcount
	from batch_rpttaxcredit_ledger br
	inner join rptledger rl on rl.objid = br.objid
	inner join barangay b on b.objid = rl.barangayid
	where br.parentid = $P{objid}
	group by b.objid, b.name

	union all 

	select 
		b.objid, 
		b.name as barangay, 
		0 as forpostingcount, 
		0 as errorcount,
		count(*) as postedcount
	from batch_rpttaxcredit_ledger_posted br
	inner join rptledger rl on rl.objid = br.objid
	inner join barangay b on b.objid = rl.barangayid
	where br.parentid = $P{objid}
	group by b.objid, b.name
) x 
where x.barangay is not null
group by x.objid, x.barangay
order by x.barangay


[insertLedgersForCredits]
insert into batch_rpttaxcredit_ledger (
	objid, parentid, state, barangayid
)
select 
	rl.objid,
	$P{objid} as parentid,
	'FORPROCESS' as state,
	rl.barangayid
from rptledger rl
where rl.state = 'APPROVED'
and rl.totalav > 0
and rl.taxable = 1


[findAmountFromLedgerItem]
select sum(amount) as amount
from rptledger_item 
where parentid = $P{rptledgerid}
and year = $P{year}

[findAmountFromPaymentItem]
select sum(rpi.amount + rpi.interest - rpi.discount) as amount
from rptpayment rp
inner join rptpayment_item rpi on rpi.parentid = rp.objid 
left join cashreceipt_void cv on rp.receiptid = cv.receiptid 
where rp.refid = $P{rptledgerid}
and year = $P{year}
and cv.objid is null 

