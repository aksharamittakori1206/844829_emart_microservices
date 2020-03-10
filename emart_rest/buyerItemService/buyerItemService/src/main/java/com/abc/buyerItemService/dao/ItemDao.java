package com.abc.buyerItemService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.buyerItemService.dao.entity.ItemEntity;


/*@Repository is a mechanism for encapsulating storage and retrieval*/
@Repository
public interface ItemDao extends JpaRepository<ItemEntity, Integer> {

}
