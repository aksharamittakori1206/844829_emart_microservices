package com.abc.loginService.model;

public class ItemPojo {

	private int itemId;
	
	private String itemName;
	 
	private String itemImage;
	
	private int itemPrice;
	
	private int itemStock;
	 
	private String itemDescription;
	 
	private SubCategoryPojo subCategoryPojo;
	 
	private String itemRemarks;
	
	private SellerSignupPojo sellerPojo;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemImage() {
		return itemImage;
	}

	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getItemStock() {
		return itemStock;
	}

	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	

	public SubCategoryPojo getSubCategoryPojo() {
		return subCategoryPojo;
	}

	public void setSubCategoryPojo(SubCategoryPojo subCategoryPojo) {
		this.subCategoryPojo = subCategoryPojo;
	}

	public String getItemRemarks() {
		return itemRemarks;
	}

	public void setItemRemarks(String itemRemarks) {
		this.itemRemarks = itemRemarks;
	}

	

	public SellerSignupPojo getSellerPojo() {
		return sellerPojo;
	}

	public void setSellerPojo(SellerSignupPojo sellerPojo) {
		this.sellerPojo = sellerPojo;
	}

	
	

	

	public ItemPojo(int itemId, String itemName, String itemImage, int itemPrice, int itemStock, String itemDescription,
			SubCategoryPojo subCategoryPojo, String itemRemarks, SellerSignupPojo sellerPojo) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemImage = itemImage;
		this.itemPrice = itemPrice;
		this.itemStock = itemStock;
		this.itemDescription = itemDescription;
		this.subCategoryPojo = subCategoryPojo;
		this.itemRemarks = itemRemarks;
		this.sellerPojo = sellerPojo;
	}

	public ItemPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ItemPojo [itemId=" + itemId + ", itemName=" + itemName + ", itemImage=" + itemImage + ", itemPrice="
				+ itemPrice + ", itemStock=" + itemStock + ", itemDescription=" + itemDescription + ", subCategoryPojo="
				+ subCategoryPojo + ", itemRemarks=" + itemRemarks + ", sellerPojo=" + sellerPojo + "]";
	}

	
	
	
	
}
