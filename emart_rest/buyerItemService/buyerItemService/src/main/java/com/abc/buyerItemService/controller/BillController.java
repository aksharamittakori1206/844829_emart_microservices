package com.abc.buyerItemService.controller;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.buyerItemService.model.BillPojo;
import com.abc.buyerItemService.service.BillService;





@CrossOrigin
@RestController
/*RequestMapping annotation is used to map web requests onto specific handler classes and/or handler methods.*/
@RequestMapping("emart")
public class BillController {

	static Logger Log = Logger.getLogger(BillController.class.getClass());
	
	/*@Autowired annotation injects object dependency implicitly*/
	@Autowired
	BillService billService;
	
	/*@PostMapping annotated methods handle the HTTP POST requests matched with given URI expression.*/
	@PostMapping("bill")
	BillPojo saveBill(@RequestBody BillPojo billPojo) {

		BasicConfigurator.configure();
		Log.info("Entered End Point\'emart/bill/saveBill \' ");
		Log.info("Exited End Point\'emart/bill/saveBill \' ");

		return billService.saveBill(billPojo);
	}

}
