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
@Table(name="item_table")
public class ItemEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="item_id")
	 Integer itemId;
	
	@Column(name="item_name")
	 String itemName;
	
	@Column(name="item_image")
	 String itemImage;
	
	@Column(name="item_price")
	 int itemPrice;
	 
	@Column(name="item_stock")
	 int itemStock;
	
	@Column(name="item_description")
	 String itemDescription;
	
	@ManyToOne
	@JoinColumn(name="subcategory_id")
	 SubCategoryEntity subcategory;
	
	@Column(name="item_remarks")
	 String itemRemarks;
	
	@ManyToOne
	@JoinColumn(name="seller_id")
	 SellerSignupEntity sellersignup;

	public ItemEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ItemEntity(Integer itemId, String itemName, String itemImage, int itemPrice, int itemStock,
			String itemDescription, SubCategoryEntity subcategory, String itemRemarks,
			SellerSignupEntity sellersignup) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemImage = itemImage;
		this.itemPrice = itemPrice;
		this.itemStock = itemStock;
		this.itemDescription = itemDescription;
		this.subcategory = subcategory;
		this.itemRemarks = itemRemarks;
		this.sellersignup = sellersignup;
	}

	@Override
	public String toString() {
		return "ItemEntity [itemId=" + itemId + ", itemName=" + itemName + ", itemImage=" + itemImage + ", itemPrice="
				+ itemPrice + ", itemStock=" + itemStock + ", itemDescription=" + itemDescription + ", subcategory="
				+ subcategory + ", itemRemarks=" + itemRemarks + ", sellersignup=" + sellersignup + "]";
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
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

	public SubCategoryEntity getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(SubCategoryEntity subcategory) {
		this.subcategory = subcategory;
	}

	public String getItemRemarks() {
		return itemRemarks;
	}

	public void setItemRemarks(String itemRemarks) {
		this.itemRemarks = itemRemarks;
	}

	public SellerSignupEntity getSellersignup() {
		return sellersignup;
	}

	public void setSellersignup(SellerSignupEntity sellersignup) {
		this.sellersignup = sellersignup;
	}

	
	
	
}
