package com.abc.loginService.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
//@Table is used to map with the bill_details_table in database.
@Table(name="bill_details_table")
public class BillDetailsEntity {
    //@Id is used because the billDetailsId is primary key.
	@Id
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//@Column is used to map the column of billDetailsId
	@Column(name="bill_details_id")
    int billDetailsId;
	//@ManyToOne is used to tell the bill_id is Foreign key.
	@ManyToOne
	//
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

	public BillDetailsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BillDetailsEntity(int billDetailsId, BillEntity bill, ItemEntity item) {
		super();
		this.billDetailsId = billDetailsId;
		this.bill = bill;
		this.item = item;
	}

	@Override
	public String toString() {
		return "BillDetailsEntity [billDetailsId=" + billDetailsId + ",  item=" + item + "]";
	}

	

}
