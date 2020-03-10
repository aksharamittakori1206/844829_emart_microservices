package com.abc.buyerItemService.dao.entity;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="bill_table")
public class BillEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
	@Column(name="bill_id")
	 int billId;
	
	@ManyToOne
	@JoinColumn(name="buyer_id")
	 BuyerSignupEntity buyersignup;
	
	@Column(name="bill_type")
	 String billType;
	 
	@Column(name="bill_date")
	 Date billDate;
	
	@Column(name="bill_remarks")
	 String billRemarks;
	 
	@Column(name="bill_amount")
	 int billAmount;
	
	@OneToMany(mappedBy = "bill")
	Set<BillDetails> allBillDetails;

	public BillEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BillEntity(int billId, BuyerSignupEntity buyersignup, String billType, Date billDate, String billRemarks,
			int billAmount, Set<BillDetails> allBillDetails) {
		super();
		this.billId = billId;
		this.buyersignup = buyersignup;
		this.billType = billType;
		this.billDate = billDate;
		this.billRemarks = billRemarks;
		this.billAmount = billAmount;
		this.allBillDetails = allBillDetails;
	}

	@Override
	public String toString() {
		return "BillEntity [billId=" + billId + ",  billType=" + billType
				+ ", billDate=" + billDate + ", billRemarks=" + billRemarks + ", billAmount=" + billAmount
				+ ", allBillDetails=" + allBillDetails + "]";
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public BuyerSignupEntity getBuyersignup() {
		return buyersignup;
	}

	public void setBuyersignup(BuyerSignupEntity buyersignup) {
		this.buyersignup = buyersignup;
	}

	public String getBillType() {
		return billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public String getBillRemarks() {
		return billRemarks;
	}

	public void setBillRemarks(String billRemarks) {
		this.billRemarks = billRemarks;
	}

	public int getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}

	public Set<BillDetails> getAllBillDetails() {
		return allBillDetails;
	}

	public void setAllBillDetails(Set<BillDetails> allBillDetails) {
		this.allBillDetails = allBillDetails;
	}
	

	
}
