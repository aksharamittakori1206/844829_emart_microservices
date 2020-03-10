package com.abc.loginService.service;

import com.abc.loginService.model.BuyerSignupPojo;



public interface BuyerService {
  BuyerSignupPojo validateBuyer(BuyerSignupPojo buyerSignupPojo);
  BuyerSignupPojo getBuyer(Integer buyerId);


  
}
