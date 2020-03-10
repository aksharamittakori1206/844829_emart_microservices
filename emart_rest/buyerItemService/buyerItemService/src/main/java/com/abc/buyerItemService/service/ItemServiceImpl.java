package com.abc.buyerItemService.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.buyerItemService.dao.ItemDao;
import com.abc.buyerItemService.dao.entity.CategoryEntity;
import com.abc.buyerItemService.dao.entity.ItemEntity;
import com.abc.buyerItemService.dao.entity.SellerSignupEntity;
import com.abc.buyerItemService.dao.entity.SubCategoryEntity;
import com.abc.buyerItemService.model.CategoryPojo;
import com.abc.buyerItemService.model.ItemPojo;
import com.abc.buyerItemService.model.SellerSignupPojo;
import com.abc.buyerItemService.model.SubCategoryPojo;




@Service
public class ItemServiceImpl implements ItemService{
	
	static Logger LOG = Logger.getLogger(ItemServiceImpl.class.getClass());
	
	@Autowired
	ItemDao itemDao;
	
	/*getItem() stores entity to pojo and returns itemPojo */
	@Override
	public ItemPojo getItem(Integer itemId) {
		
	
		LOG.info("entered getItem()");
		
		ItemPojo itemPojo=null;
		Optional result = itemDao.findById(itemId);
		if(result.isPresent()) {
			
			ItemEntity itemEntity = (ItemEntity) result.get();
			SubCategoryEntity subCategoryEntity = itemEntity.getSubcategory();
			CategoryEntity categoryEntity = subCategoryEntity.getCategory();
			SellerSignupEntity sellerSignupEntity=itemEntity.getSellersignup();
			
			CategoryPojo categoryPojo = new CategoryPojo(categoryEntity.getCategoryId(),categoryEntity.getCategoryName(),categoryEntity.getCategoryBrief());
			SubCategoryPojo subCategoryPojo = new SubCategoryPojo(subCategoryEntity.getSubCategoryId(),
																	subCategoryEntity.getSubCategoryName(),
																	subCategoryEntity.getSubCategoryBrief(),
																	subCategoryEntity.getSubCategoryGst(),
																	categoryPojo);
			SellerSignupPojo sellerPojo=new SellerSignupPojo(sellerSignupEntity.getSellerId(),sellerSignupEntity.getSellerUsername(),sellerSignupEntity.getSellerPassword(),sellerSignupEntity.getSellerCompany(),sellerSignupEntity.getSellerBrief(),sellerSignupEntity.getSellerGst(),sellerSignupEntity.getSellerAddress(),sellerSignupEntity.getSellerEmail(),(int) sellerSignupEntity.getSellerContact(),sellerSignupEntity.getSellerWebsite());
			itemPojo = new ItemPojo(itemEntity.getItemId(),
									itemEntity.getItemName(),
									itemEntity.getItemImage(),
									itemEntity.getItemPrice(),
									itemEntity.getItemStock(),
									itemEntity.getItemRemarks(),
									itemEntity.getItemDescription(),
									subCategoryPojo,
									sellerPojo);
			
		}
		LOG.info("exited getItem()");
		return itemPojo;
	}

	/*getAllItems() stores entity to pojo and displays all the items*/
	@Override
	public List<ItemPojo> getAllItems() {
	
		LOG.info("entered getAllItems()");
		
		List<ItemPojo> allItemPojo = new ArrayList();

		Iterable<ItemEntity> allItemEntity = itemDao.findAll();
		Iterator itr = allItemEntity.iterator();
		while(itr.hasNext())
		{
			ItemEntity itemEntity = (ItemEntity) itr.next();
			SubCategoryEntity subCategoryEntity = itemEntity.getSubcategory();
			CategoryEntity categoryEntity = subCategoryEntity.getCategory();
			SellerSignupEntity sellerSignupEntity=itemEntity.getSellersignup();
			
			CategoryPojo categoryPojo = new CategoryPojo(categoryEntity.getCategoryId(),categoryEntity.getCategoryName(),categoryEntity.getCategoryBrief());
			SubCategoryPojo subCategoryPojo = new SubCategoryPojo(subCategoryEntity.getSubCategoryId(),
																	subCategoryEntity.getSubCategoryName(),
																	subCategoryEntity.getSubCategoryBrief(),
																	subCategoryEntity.getSubCategoryGst(),
																	categoryPojo);
			//
			SellerSignupPojo sellerPojo=new SellerSignupPojo(sellerSignupEntity.getSellerId(),sellerSignupEntity.getSellerUsername(),sellerSignupEntity.getSellerPassword(),sellerSignupEntity.getSellerCompany(),sellerSignupEntity.getSellerBrief(),sellerSignupEntity.getSellerGst(),sellerSignupEntity.getSellerAddress(),sellerSignupEntity.getSellerEmail(),(int) sellerSignupEntity.getSellerContact(),sellerSignupEntity.getSellerWebsite());
			 ItemPojo itemPojo = new ItemPojo(itemEntity.getItemId(),
									itemEntity.getItemName(),
									itemEntity.getItemImage(),
									itemEntity.getItemPrice(),
									itemEntity.getItemStock(),
									itemEntity.getItemRemarks(),
									itemEntity.getItemDescription(),
									subCategoryPojo,
									sellerPojo);
			
		allItemPojo.add(itemPojo);
		}
		LOG.info("exited getAllItems()");
	return allItemPojo;

}

	@Override
	public void deleteItems(Integer itemId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ItemPojo addItems(ItemPojo itemPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	
}
