package com.product.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.api.Repo.Product2Repository;
import com.product.api.entitys.Product2;
/**
 * @author Rohit Kawade
 * 
 * **/
@CrossOrigin(origins = "*")
@RestController
public class StockController {
	@Autowired
	Product2Repository product2Repository;
	
	@PostMapping("/increaseStockQuantity")
	private Product2 increaseStockQuantity(@RequestParam("quan") int quatity,@RequestParam("pid") int productId) {
		Product2 product=product2Repository.findById(productId+"").get();
		
	//	product.getStock().getQuantity();
		System.out.println(quatity+" | "+product.getTitle());
		return product;//if done
	}
	
}
