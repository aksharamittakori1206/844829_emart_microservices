package com.abc.loginService.controller;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.loginService.model.BuyerSignupPojo;
import com.abc.loginService.service.BuyerService;


@CrossOrigin
@RestController
//@RequestMapping annotation is used to map web requests.
@RequestMapping("emart")

public class BuyerController {
	static Logger LOG = Logger.getLogger(BuyerController.class.getClass());
	//@Autowired is used to inject the object dependency implicitly.
  @Autowired
BuyerService buyerService;
//@GetMapping annotation handles the HTTP GET requests(to get the bill).
  @GetMapping("validate")
//@validateBuyer is used to check the username and password
  BuyerSignupPojo validateBuyer(@RequestHeader("Authorization") String data) {
	  BasicConfigurator.configure();
		LOG.info("Entered end point \'emart/validate \' ");
		LOG.info("Exited end point \'emart/validate \' ");
	  	  String token[] = data.split(":");
		  BuyerSignupPojo buyerSignupPojo = new BuyerSignupPojo();
  		  buyerSignupPojo.setBuyerUsername(token[0]);
  		  buyerSignupPojo.setBuyerPassword(token[1]);
		  return buyerService.validateBuyer(buyerSignupPojo);
	  
  }
//@GetMapping annotation handles the HTTP GET requests(to get the bill).
  @GetMapping("buyer/{buyerId}")
//getBuyer is used to get the buyerId details from the database  
  BuyerSignupPojo getBuyer(@PathVariable ("buyerId") Integer buyerId) {
  LOG.info("Entered end point \'emart/buyer/{buyerId} \' ");

  LOG.info("Exited end point \'emart/buyer/{buyerId}\' ");
  return buyerService.getBuyer(buyerId);
  }

  }
