package com.abc.buyerItemService.service;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abc.buyerItemService.dao.BillDao;
import com.abc.buyerItemService.dao.BillDetailsDao;
import com.abc.buyerItemService.dao.entity.BillDetails;
import com.abc.buyerItemService.dao.entity.BillEntity;
import com.abc.buyerItemService.dao.entity.BuyerSignupEntity;
import com.abc.buyerItemService.dao.entity.CategoryEntity;
import com.abc.buyerItemService.dao.entity.ItemEntity;
import com.abc.buyerItemService.dao.entity.SellerSignupEntity;
import com.abc.buyerItemService.dao.entity.SubCategoryEntity;
import com.abc.buyerItemService.model.BillDetailsPojo;
import com.abc.buyerItemService.model.BillPojo;
import com.abc.buyerItemService.model.BuyerSignupPojo;
import com.abc.buyerItemService.model.CategoryPojo;
import com.abc.buyerItemService.model.ItemPojo;
import com.abc.buyerItemService.model.SellerSignupPojo;
import com.abc.buyerItemService.model.SubCategoryPojo;


@Service
public class BillServiceImpl implements BillService {
	
	static Logger Log = Logger.getLogger(BillServiceImpl.class.getClass());
	
	
	/*@Autowired annotation injects object dependency implicitly*/
	@Autowired
	BillDao billDao;
	
	@Autowired
	BillDetailsDao billDetailsDao;
	
	@Override
	@Transactional
	/*saveBill() stores pojo into entity and returns billPojo */
	public BillPojo saveBill(BillPojo billPojo) {
		
		Log.info("entered saveBill()");
		
		BuyerSignupPojo buyerPojo=billPojo.getBuyer();
		BuyerSignupEntity buyerEntity = new BuyerSignupEntity(buyerPojo.getBuyerId(),
																buyerPojo.getBuyerUsername(),
																buyerPojo.getBuyerPassword(),
																buyerPojo.getBuyerEmail(),
																buyerPojo.getBuyerMobile(),
																buyerPojo.getBuyerDate(),
																null);
		
		BillEntity billEntity = new BillEntity();
		billEntity.setBillId(0);
		billEntity.setBillAmount(billPojo.getBillAmount());
		billEntity.setBillRemarks(billPojo.getBillRemarks());
		billEntity.setBillType(billPojo.getBillType());
		billEntity.setBillDate(billPojo.getBillDate());
		billEntity.setBuyersignup(buyerEntity);
		
		billEntity = billDao.saveAndFlush(billEntity);
		billPojo.setBillId(billEntity.getBillId());
		
		BillEntity setBillEntity = billDao.findById(billEntity.getBillId()).get();
		
		Set<BillDetails> allBillDetails = new HashSet<BillDetails>();
		Set<BillDetailsPojo> allBillDetailsPojo = billPojo.getAllBillDetails();
		
		for(BillDetailsPojo  billDetailsPojo : allBillDetailsPojo) {
			ItemPojo itemPojo = billDetailsPojo.getItem();
			SubCategoryPojo subCategoryPojo = itemPojo.getSubcategory();
			SellerSignupPojo sellerPojo = itemPojo.getSellersignup();
			CategoryPojo categoryPojo = subCategoryPojo.getCategory();
			
			SellerSignupEntity sellerEntity = new SellerSignupEntity(sellerPojo.getSellerId(),
																sellerPojo.getSellerUsername(),
																sellerPojo.getSellerPassword(),
																sellerPojo.getSellerCompany(),
																sellerPojo.getSellerBrief(),
																sellerPojo.getSellerGst(),
																sellerPojo.getSellerAddress(),
																sellerPojo.getSellerEmail(),
																sellerPojo.getSellerContact(),
																sellerPojo.getSellerWebsite());
			CategoryEntity categoryEntity = new CategoryEntity(categoryPojo.getCategoryId(),
															   categoryPojo.getCategoryName(),
															   categoryPojo.getCategoryBrief());
			SubCategoryEntity subCategoryEntity = new SubCategoryEntity(subCategoryPojo.getSubCategoryId(),
																	subCategoryPojo.getSubCategoryName(),
																	categoryEntity,
																	subCategoryPojo.getSubCategoryBrief(),
																	subCategoryPojo.getSubCategoryGst());
			ItemEntity itemEntity = new ItemEntity(itemPojo.getItemId(),
					itemPojo.getItemName(),
					itemPojo.getItemImage(),
					itemPojo.getItemPrice(),
					itemPojo.getItemStock(),
					itemPojo.getItemDescription(),
					subCategoryEntity,
					itemPojo.getItemRemarks(),
					sellerEntity);
			
			BillDetails billDetailsEntity = new BillDetails(billDetailsPojo.getBillDetailsId(),
					setBillEntity,
					itemEntity);
			
			billDetailsDao.save(billDetailsEntity);
																
		}
		Log.info("exited saveBill()");
		return billPojo;
		}

	
}

