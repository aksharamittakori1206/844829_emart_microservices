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
@Table(name="sub_category_table")

public class SubCategoryEntity {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

@Column(name="subcategory_id")
	 int subCategoryId;
	 
@Column(name="subcategory_name")
	 String subCategoryName;
	 
@ManyToOne
@JoinColumn(name="category_id")
CategoryEntity category;
	// int categoryId;
	
@Column(name="subcategory_brief")
	 String subCategoryBrief;
	
@Column(name="subcategory_gst")
	 int subCategoryGst;

	public int getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}



	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}

	public String getSubCategoryBrief() {
		return subCategoryBrief;
	}

	public void setSubCategoryBrief(String subCategoryBrief) {
		this.subCategoryBrief = subCategoryBrief;
	}

	public int getSubCategoryGst() {
		return subCategoryGst;
	}

	public void setSubCategoryGst(int subCategoryGst) {
		this.subCategoryGst = subCategoryGst;
	}

	
	

	public SubCategoryEntity(int subCategoryId, String subCategoryName, CategoryEntity category,
			String subCategoryBrief, int subCategoryGst) {
		super();
		this.subCategoryId = subCategoryId;
		this.subCategoryName = subCategoryName;
		this.category = category;
		this.subCategoryBrief = subCategoryBrief;
		this.subCategoryGst = subCategoryGst;
	}

	public SubCategoryEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SubCategoryEntity [subCategoryId=" + subCategoryId + ", subCategoryName=" + subCategoryName
				+ ", category=" + category + ", subCategoryBrief=" + subCategoryBrief + ", subCategoryGst="
				+ subCategoryGst + "]";
	}

	
	
	
	
}
