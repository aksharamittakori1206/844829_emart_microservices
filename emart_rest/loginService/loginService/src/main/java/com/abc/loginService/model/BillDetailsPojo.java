package com.abc.loginService.model;

public class BillDetailsPojo { 
	
	private int billDetailsId;
	
	private BillPojo billPojo;
	
	private ItemPojo itemPojo;

	public int getBillDetailsId() {
		return billDetailsId;
	}

	public void setBillDetailsId(int billDetailsId) {
		this.billDetailsId = billDetailsId;
	}

	


	public BillPojo getBillPojo() {
		return billPojo;
	}

	public void setBillPojo(BillPojo billPojo) {
		this.billPojo = billPojo;
	}

	public ItemPojo getItemPojo() {
		return itemPojo;
	}

	public void setItemPojo(ItemPojo itemPojo) {
		this.itemPojo = itemPojo;
	}

	
	
	public BillDetailsPojo(int billDetailsId, BillPojo billPojo, ItemPojo itemPojo) {
		super();
		this.billDetailsId = billDetailsId;
		this.billPojo = billPojo;
		this.itemPojo = itemPojo;
	}

	public BillDetailsPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BillDetailsPojo [billDetailsId=" + billDetailsId + ", itemPojo=" + itemPojo
				+ "]";
	}

	
	
}
