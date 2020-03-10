  package com.abc.buyerItemService.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="bill_details_table")
public class BillDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="bill_details_id")
	int billDetailsId;
	
	@ManyToOne
	@JoinColumn(name="bill_id")
	 BillEntity bill;
	
	@ManyToOne
	@JoinColumn(name="item_id")
	 ItemEntity item;

	public int getBillDetailsId() {
		return billDetailsId;
	}

	public void setBillDetailsId(int billDetailsId) {
		this.billDetailsId = billDetailsId;
	}

	

	

	public BillEntity getBill() {
		return bill;
	}

	public void setBill(BillEntity bill) {
		this.bill = bill;
	}

	public ItemEntity getItem() {
		return item;
	}

	public void setItem(ItemEntity item) {
		this.item = item;
	}

	

	public BillDetails(int billDetailsId, BillEntity bill, ItemEntity item) {
		super();
		this.billDetailsId = billDetailsId;
		this.bill = bill;
		this.item = item;
	}

	public BillDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BillDetails [billDetailsId=" + billDetailsId + ",  item=" + item + "]";
	}

	
}
