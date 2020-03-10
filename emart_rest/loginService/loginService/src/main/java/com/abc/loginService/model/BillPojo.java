package com.abc.loginService.model;

import java.util.*;

//import com.abc.l.dao.entity.BillDetailsEntity;

public class BillPojo {
	
	private int billId;
	
	private String billType;
	 
	private Date billDate;
	
	private String billRemarks;
	 
	private int billAmount;
	
	BuyerSignupPojo buyerPojo;
	
	Set<BillDetailsPojo> allBillDetails;

	public BillPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BillPojo(int billId, String billType, Date billDate, String billRemarks, int billAmount,
			BuyerSignupPojo buyerPojo, Set<BillDetailsPojo> allBillDetailsPojo) {
		super();
		this.billId = billId;
		this.billType = billType;
		this.billDate = billDate;
		this.billRemarks = billRemarks;
		this.billAmount = billAmount;
		this.buyerPojo = buyerPojo;
		this.allBillDetails = allBillDetailsPojo;
	}

	@Override
	public String toString() {
		return "BillPojo [billId=" + billId + ", billType=" + billType + ", billDate=" + billDate + ", billRemarks="
				+ billRemarks + ", billAmount=" + billAmount + ", buyerPojo=" + buyerPojo + ", allBillDetails="
				+ allBillDetails + "]";
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
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

	public BuyerSignupPojo getBuyerPojo() {
		return buyerPojo;
	}

	public void setBuyerPojo(BuyerSignupPojo buyerPojo) {
		this.buyerPojo = buyerPojo;
	}

	public Set<BillDetailsPojo> getAllBillDetails() {
		return allBillDetails;
	}

	public void setAllBillDetails(Set<BillDetailsPojo> allBillDetails) {
		this.allBillDetails = allBillDetails;
	}

	
	
	
	
 
}
