package com.abc.buyerItemService.controller;

import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.abc.buyerItemService.model.ItemPojo;
import com.abc.buyerItemService.service.ItemService;



			
@RestController
@CrossOrigin

public class ItemController {
	
	static Logger Log = Logger.getLogger(ItemController.class.getClass());
	
	/* @Autowired annotation injects object dependency implicitly */
	@Autowired
	ItemService itemService;
	
	/*@GetMapping annotated methods handle the HTTP GET requests matched with given URI expression.*/
	@GetMapping("/item/all")
	List<ItemPojo> getAllItems(){
		BasicConfigurator.configure();
		Log.info("Entered End Point\'item/all \' ");
		Log.info("Exited End Point\'item/all \' ");
		return itemService.getAllItems();
	}
	
	@GetMapping("/item/{itemId}")
	ItemPojo getItem(@PathVariable("itemId") Integer itemId) {
		//BasicConfigurator.configure();
		Log.info("Entered End Point\'item/{itemId} \' ");
		Log.info("Exited End Point\'item/{itemId} \' ");
		return itemService.getItem(itemId);
	}
	
}
