package com.abc.buyerItemService.model;



public class ItemPojo {

	private int itemId;
	
	private String itemName;
	 
	private String itemImage;
	
	private int itemPrice;
	
	private int itemStock;
	 
	private String itemDescription;
	 
	private String itemRemarks;
	
	private SubCategoryPojo subcategory;
	private SellerSignupPojo sellersignup;
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
	public String getItemRemarks() {
		return itemRemarks;
	}
	public void setItemRemarks(String itemRemarks) {
		this.itemRemarks = itemRemarks;
	}
	public SubCategoryPojo getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(SubCategoryPojo subcategory) {
		this.subcategory = subcategory;
	}
	public SellerSignupPojo getSellersignup() {
		return sellersignup;
	}
	public void setSellersignup(SellerSignupPojo sellersignup) {
		this.sellersignup = sellersignup;
	}
	public ItemPojo(int itemId, String itemName, String itemImage, int itemPrice, int itemStock, String itemDescription,
			String itemRemarks, SubCategoryPojo subcategory, SellerSignupPojo sellersignup) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemImage = itemImage;
		this.itemPrice = itemPrice;
		this.itemStock = itemStock;
		this.itemDescription = itemDescription;
		this.itemRemarks = itemRemarks;
		this.subcategory = subcategory;
		this.sellersignup = sellersignup;
	}
	public ItemPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ItemPojo [itemId=" + itemId + ", itemName=" + itemName + ", itemImage=" + itemImage + ", itemPrice="
				+ itemPrice + ", itemStock=" + itemStock + ", itemDescription=" + itemDescription + ", itemRemarks="
				+ itemRemarks + ", subcategory=" + subcategory + ", sellersignup=" + sellersignup + "]";
	}

	

}