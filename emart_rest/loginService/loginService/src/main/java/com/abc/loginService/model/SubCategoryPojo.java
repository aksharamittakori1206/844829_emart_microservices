package com.abc.loginService.model;

public class SubCategoryPojo {

	private int subCategoryId;
	 
	private String subCategoryName;
	 
	//private int categoryId;
	private CategoryPojo categoryPojo;
	private String subCategoryBrief;
	
	private int subCategoryGst;

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

	
	public CategoryPojo getCategoryPojo() {
		return categoryPojo;
	}

	public void setCategoryPojo(CategoryPojo categoryPojo) {
		this.categoryPojo = categoryPojo;
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

	

	

	public SubCategoryPojo(int subCategoryId, String subCategoryName, CategoryPojo categoryPojo,
			String subCategoryBrief, int subCategoryGst) {
		super();
		this.subCategoryId = subCategoryId;
		this.subCategoryName = subCategoryName;
		this.categoryPojo = categoryPojo;
		this.subCategoryBrief = subCategoryBrief;
		this.subCategoryGst = subCategoryGst;
	}

	public SubCategoryPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SubCategoryPojo [subCategoryId=" + subCategoryId + ", subCategoryName=" + subCategoryName
				+ ", categoryPojo=" + categoryPojo + ", subCategoryBrief=" + subCategoryBrief + ", subCategoryGst="
				+ subCategoryGst + "]";
	}

	
	
	 
}
