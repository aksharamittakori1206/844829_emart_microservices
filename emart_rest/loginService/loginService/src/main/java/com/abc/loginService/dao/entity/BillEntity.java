package com.abc.loginService.dao.entity;

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
	 BuyerSignupEntity buyerSignup;
	
	@Column(name="bill_type")
	 String billType;
	 
	@Column(name="bill_date")
	 Date billDate;
	
	@Column(name="bill_remarks")
	 String billRemarks;
	 
	@Column(name="bill_amount")
	 int billAmount;
	
	@OneToMany(mappedBy = "bill")
	Set<BillDetailsEntity> allBillDetails;

	public BillEntity(int billId, BuyerSignupEntity buyerSignup, String billType, Date billDate, String billRemarks,
			int billAmount, Set<BillDetailsEntity> allBillDetails) {
		super();
		this.billId = billId;
		this.buyerSignup = buyerSignup;
		this.billType = billType;
		this.billDate = billDate;
		this.billRemarks = billRemarks;
		this.billAmount = billAmount;
		this.allBillDetails = allBillDetails;
	}

	public BillEntity() {
		super();
		// TODO Auto-generated constructor stub
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

	public BuyerSignupEntity getBuyerSignup() {
		return buyerSignup;
	}

	public void setBuyerSignup(BuyerSignupEntity buyerSignup) {
		this.buyerSignup = buyerSignup;
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

	public Set<BillDetailsEntity> getAllBillDetails() {
		return allBillDetails;
	}

	public void setAllBillDetails(Set<BillDetailsEntity> allBillDetails) {
		this.allBillDetails = allBillDetails;
	}

}
