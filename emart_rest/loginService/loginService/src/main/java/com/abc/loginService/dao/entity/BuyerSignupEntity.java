package com.abc.loginService.dao.entity;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="buyer_signup_table")
public class BuyerSignupEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
	@Column(name="buyer_id")
	 int buyerId;
	 
	@Column(name="buyer_username")
	 String buyerUsername;
	 
	@Column(name="buyer_password")
	 String buyerPassword;
	 
	@Column(name="buyer_email")
	 String buyerEmail;
	
	@Column(name="buyer_mobile")
	 long buyerMobile;
	 
	@Column(name="buyer_date")
	 Date buyerDate;
	@OneToMany(mappedBy="buyerSignup")
	Set<BillEntity>allBills;
	public BuyerSignupEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BuyerSignupEntity(int buyerId, String buyerUsername, String buyerPassword, String buyerEmail,
			long buyerMobile, Date buyerDate, Set<BillEntity> allBills) {
		super();
		this.buyerId = buyerId;
		this.buyerUsername = buyerUsername;
		this.buyerPassword = buyerPassword;
		this.buyerEmail = buyerEmail;
		this.buyerMobile = buyerMobile;
		this.buyerDate = buyerDate;
		this.allBills = allBills;
	}
	public int getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}
	public String getBuyerUsername() {
		return buyerUsername;
	}
	public void setBuyerUsername(String buyerUsername) {
		this.buyerUsername = buyerUsername;
	}
	public String getBuyerPassword() {
		return buyerPassword;
	}
	public void setBuyerPassword(String buyerPassword) {
		this.buyerPassword = buyerPassword;
	}
	public String getBuyerEmail() {
		return buyerEmail;
	}
	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}
	public long getBuyerMobile() {
		return buyerMobile;
	}
	public void setBuyerMobile(long buyerMobile) {
		this.buyerMobile = buyerMobile;
	}
	public Date getBuyerDate() {
		return buyerDate;
	}
	public void setBuyerDate(Date buyerDate) {
		this.buyerDate = buyerDate;
	}
	public Set<BillEntity> getAllBills() {
		return allBills;
	}
	public void setAllBills(Set<BillEntity> allBills) {
		this.allBills = allBills;
	}
	@Override
	public String toString() {
		return "BuyerSignupEntity [buyerId=" + buyerId + ", buyerUsername=" + buyerUsername + ", buyerPassword="
				+ buyerPassword + ", buyerEmail=" + buyerEmail + ", buyerMobile=" + buyerMobile + ", buyerDate="
				+ buyerDate + ", allBills=" + allBills + "]";
	}

	
	

	
	
}
	