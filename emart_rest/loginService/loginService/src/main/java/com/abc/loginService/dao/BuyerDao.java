package com.abc.loginService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.loginService.dao.entity.BuyerSignupEntity;



@Repository
public interface BuyerDao extends JpaRepository<BuyerSignupEntity,Integer> {
BuyerSignupEntity findByBuyerUsernameAndBuyerPassword(String username,String password);
}
