package com.abc.buyerItemService.model;




public class BillDetailsPojo { 
	
	private int billDetailsId;
	BillPojo bill;
	ItemPojo item;
	public BillDetailsPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BillDetailsPojo(int billDetailsId, BillPojo bill, ItemPojo item) {
		super();
		this.billDetailsId = billDetailsId;
		this.bill = bill;
		this.item = item;
	}
	@Override
	public String toString() {
		return "BillDetailsPojo [billDetailsId=" + billDetailsId + ", item=" + item + "]";
	}
	public int getBillDetailsId() {
		return billDetailsId;
	}
	public void setBillDetailsId(int billDetailsId) {
		this.billDetailsId = billDetailsId;
	}
	public BillPojo getBill() {
		return bill;
	}
	public void setBill(BillPojo bill) {
		this.bill = bill;
	}
	public ItemPojo getItem() {
		return item;
	}
	public void setItem(ItemPojo item) {
		this.item = item;
	}
	

}
