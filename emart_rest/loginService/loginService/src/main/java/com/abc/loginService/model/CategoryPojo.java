package com.abc.loginService.model;

public class CategoryPojo { 
	
	private int categoryId;
	 
	private String categoryName;
	 
	private String categoryBrief;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryBrief() {
		return categoryBrief;
	}

	public void setCategoryBrief(String categoryBrief) {
		this.categoryBrief = categoryBrief;
	}

	public CategoryPojo(int categoryId, String categoryName, String categoryBrief) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryBrief = categoryBrief;
	}

	public CategoryPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CategoryPojo [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryBrief="
				+ categoryBrief + "]";
	}
	 
	

}
