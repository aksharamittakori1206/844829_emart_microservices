package com.abc.loginService.service;

import java.util.HashSet;

import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.loginService.dao.BuyerDao;
import com.abc.loginService.dao.entity.BillDetailsEntity;
import com.abc.loginService.dao.entity.BillEntity;
import com.abc.loginService.dao.entity.BuyerSignupEntity;
import com.abc.loginService.dao.entity.CategoryEntity;
import com.abc.loginService.dao.entity.ItemEntity;
import com.abc.loginService.dao.entity.SellerSignupEntity;
import com.abc.loginService.dao.entity.SubCategoryEntity;
import com.abc.loginService.model.BillDetailsPojo;
import com.abc.loginService.model.BillPojo;
import com.abc.loginService.model.BuyerSignupPojo;
import com.abc.loginService.model.CategoryPojo;
import com.abc.loginService.model.ItemPojo;
import com.abc.loginService.model.SellerSignupPojo;
import com.abc.loginService.model.SubCategoryPojo;




@Service
public class BuyerServiceImpl implements BuyerService{
	static Logger LOG = Logger.getLogger(BuyerServiceImpl.class.getClass());

	@Autowired
	BuyerDao buyerDao;
	
	@Override
	public BuyerSignupPojo validateBuyer(BuyerSignupPojo buyerSignupPojo) {
		LOG.info("Enter validateBuyer()");
		System.out.println("username:" + buyerSignupPojo.getBuyerUsername());
		System.out.println("password:" + buyerSignupPojo.getBuyerPassword());
		BuyerSignupEntity buyerSignupEntity = buyerDao.findByBuyerUsernameAndBuyerPassword(buyerSignupPojo.getBuyerUsername(), buyerSignupPojo.getBuyerPassword());
		System.out.println(buyerSignupEntity);
				
		if(buyerSignupEntity!=null) {
		Set<BillEntity> allBillsEntity = buyerSignupEntity.getAllBills();
				
		Set<BillPojo> allBillPojo = new HashSet<BillPojo>();
		
		
		for(BillEntity billEntity : allBillsEntity) {
			Set<BillDetailsEntity> allBillDetailsEntity = billEntity.getAllBillDetails();
			Set<BillDetailsPojo> allBillDetailsPojo = new HashSet<BillDetailsPojo>();
			for(BillDetailsEntity billDetailsEntity : allBillDetailsEntity) {
				
				ItemEntity itemEntity = billDetailsEntity.getItem();
				SubCategoryEntity subCategoryEntity = itemEntity.getSubcategory();
				CategoryEntity categoryEntity = subCategoryEntity.getCategory();
				SellerSignupEntity sellerSignupEntity = itemEntity.getSeller(); 
				
				SellerSignupPojo sellerSignupPojo = new SellerSignupPojo(sellerSignupEntity.getSellerId(), 
													   sellerSignupEntity.getSellerUsername(), 
													   sellerSignupEntity.getSellerPassword(),
													   sellerSignupEntity.getSellerCompany(), 
													   sellerSignupEntity.getSellerBrief(), 
													   sellerSignupEntity.getSellerGst(),
													   sellerSignupEntity.getSellerAddress(), 
													   sellerSignupEntity.getSellerEmail(), 
													   sellerSignupEntity.getSellerContact(),
													   sellerSignupEntity.getSellerWebsite());	
				
				CategoryPojo categoryPojo = new CategoryPojo(categoryEntity.getCategoryId(), categoryEntity.getCategoryName(), categoryEntity.getCategoryBrief());
				SubCategoryPojo subCategoryPojo = new SubCategoryPojo(subCategoryEntity.getSubCategoryId(),
													  subCategoryEntity.getSubCategoryName(),
													  categoryPojo,
													  subCategoryEntity.getSubCategoryBrief(), 
													  subCategoryEntity.getSubCategoryGst()); 
													  
				ItemPojo itemPojo = new ItemPojo(itemEntity.getItemId(),
										itemEntity.getItemName(),
										itemEntity.getItemImage(),
										itemEntity.getItemPrice(),
										itemEntity.getItemStock(),
										itemEntity.getItemDescription(),
										subCategoryPojo,
										itemEntity.getItemRemarks(),
										sellerSignupPojo);
										
						
				BillDetailsPojo billDetailsPojo = new BillDetailsPojo(billDetailsEntity.getBillDetailsId(), null, itemPojo);
				allBillDetailsPojo.add(billDetailsPojo);
			}
			BillPojo billPojo = new BillPojo(billEntity.getBillId(),
												billEntity.getBillType(),
												billEntity.getBillDate(),
												billEntity.getBillRemarks(),
												billEntity.getBillAmount(),
												null,
												allBillDetailsPojo);
											 
			allBillPojo.add(billPojo);
		}
		buyerSignupPojo= new BuyerSignupPojo(buyerSignupEntity.getBuyerId(),
				                  buyerSignupEntity.getBuyerUsername(),
								  buyerSignupEntity.getBuyerPassword(),
								  buyerSignupEntity.getBuyerEmail(),
								  buyerSignupEntity.getBuyerMobile(),
								  buyerSignupEntity.getBuyerDate(),
								  allBillPojo);
								  
		}
		LOG.info("Exit validateBuyer()");
		return buyerSignupPojo;
	}


	@Override
	public BuyerSignupPojo getBuyer(Integer buyerId) {
		LOG.info("Enter getBuyer()");
		BuyerSignupPojo buyerSignupPojo=new BuyerSignupPojo();
		BuyerSignupEntity buyerSignupEntity = buyerDao.findById(buyerId).get();
		//System.out.println(buyerSignupEntity);
				
		if(buyerSignupEntity!=null) {
		Set<BillEntity> allBillsEntity = buyerSignupEntity.getAllBills();
				
		Set<BillPojo> allBillPojo = new HashSet<BillPojo>();
		
		
		for(BillEntity billEntity : allBillsEntity) {
			Set<BillDetailsEntity> allBillDetailsEntity = billEntity.getAllBillDetails();
			Set<BillDetailsPojo> allBillDetailsPojo = new HashSet<BillDetailsPojo>();
			for(BillDetailsEntity billDetailsEntity : allBillDetailsEntity) {
				
				ItemEntity itemEntity = billDetailsEntity.getItem();
				SubCategoryEntity subCategoryEntity = itemEntity.getSubcategory();
				CategoryEntity categoryEntity = subCategoryEntity.getCategory();
				SellerSignupEntity sellerSignupEntity = itemEntity.getSeller(); 
				
				SellerSignupPojo sellerSignupPojo = new SellerSignupPojo(sellerSignupEntity.getSellerId(), 
													   sellerSignupEntity.getSellerUsername(), 
													   sellerSignupEntity.getSellerPassword(),
													   sellerSignupEntity.getSellerCompany(), 
													   sellerSignupEntity.getSellerBrief(), 
													   sellerSignupEntity.getSellerGst(),
													   sellerSignupEntity.getSellerAddress(), 
													   sellerSignupEntity.getSellerEmail(), 
													   sellerSignupEntity.getSellerContact(),
													   sellerSignupEntity.getSellerWebsite());	
				
				CategoryPojo categoryPojo = new CategoryPojo(categoryEntity.getCategoryId(), categoryEntity.getCategoryName(), categoryEntity.getCategoryBrief());
				SubCategoryPojo subCategoryPojo = new SubCategoryPojo(subCategoryEntity.getSubCategoryId(),
													  subCategoryEntity.getSubCategoryName(),
													  categoryPojo,
													  subCategoryEntity.getSubCategoryBrief(), 
													  subCategoryEntity.getSubCategoryGst()); 
													  
				ItemPojo itemPojo = new ItemPojo(itemEntity.getItemId(),
										itemEntity.getItemName(),
										itemEntity.getItemImage(),
										itemEntity.getItemPrice(),
										itemEntity.getItemStock(),
										itemEntity.getItemDescription(),
										subCategoryPojo,
										itemEntity.getItemRemarks(),
										sellerSignupPojo);
										
						
				BillDetailsPojo billDetailsPojo = new BillDetailsPojo(billDetailsEntity.getBillDetailsId(), null, itemPojo);
				allBillDetailsPojo.add(billDetailsPojo);
			}
			BillPojo billPojo = new BillPojo(billEntity.getBillId(),
												billEntity.getBillType(),
												billEntity.getBillDate(),
												billEntity.getBillRemarks(),
												billEntity.getBillAmount(),
												null,
												allBillDetailsPojo);
											 
			allBillPojo.add(billPojo);
		}
		buyerSignupPojo= new BuyerSignupPojo(buyerSignupEntity.getBuyerId(),
				                  buyerSignupEntity.getBuyerUsername(),
								  buyerSignupEntity.getBuyerPassword(),
								  buyerSignupEntity.getBuyerEmail(),
								  buyerSignupEntity.getBuyerMobile(),
								  buyerSignupEntity.getBuyerDate(),
								  allBillPojo);
								  
		}
		LOG.info("Exit getBuyer()");
		return buyerSignupPojo;
	}


}
