package com.product.api.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.api.Repo.Product2Repository;
import com.product.api.Repo.SalesOrderItemRepository;
import com.product.api.Repo.SalesOrderRepository;
import com.product.api.Repo.StockRepository;
import com.product.api.entitys.Product2;
import com.product.api.entitys.SalesOrder;
import com.product.api.entitys.SalesOrderItem;
import com.product.api.entitys.Stock;

@RestController
public class MainController {
	
	@Autowired
	Product2Repository product2Repository;
	@Autowired
	SalesOrderRepository salesOrderRepository;
	@Autowired
	SalesOrderItemRepository salesOrderItemRepository;
	@Autowired
	StockRepository stockRepository;
	
	Random random=new Random();
	
	//fetch the all product2
	@GetMapping("/")
	public List<Product2> allproducts(){
		List<Product2> product2s=new ArrayList<>();
		for(Product2 product2:product2Repository.findAll()) {
			Stock stock=stockRepository.findBySkuAndUserId(product2.getSku(), product2.getUserId());
			product2.setQuantity(stock.getQuentity());
			product2s.add(product2);
		}
		return product2s;
	}
	
	//search the product2 by key and user id
	@GetMapping("/search/{key}/{userId}")
	public List<Product2> searchProduct(@PathVariable String key,@PathVariable String userId){
		System.out.println("key "+key+" userId : "+userId);
		List<Product2> product2s=new ArrayList<>();
		for(Product2 p:product2Repository.getLikeProduct(userId,key) ) {
			Stock s=stockRepository.findBySkuAndUserId(p.getSku(), p.getUserId());
			p.setQuantity(s.getQuentity());
			product2s.add(p);
		}	
		return product2s;
	}
	
	//add the product2
	@PostMapping(path="/addProduct",consumes = "application/json")
	public String addNewProduct(@RequestBody Product2 product2){
		try {
			product2.setProductRefId(random.nextInt()+"_product_2022");
			product2Repository.save(product2);
			return "Product2 is save successfully.";
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Product2 not save");
			return "Product2 not saved.";
		}	
	}
	
	//place the order
	@PostMapping("/placeOrder/{productId}")
	public String palceOrder(@RequestBody SalesOrder salesOrder ,@PathVariable String productId) {
		
		
			try {
				String invoicenumber=random.nextInt()+"_invoce_2022";
				Product2 p=product2Repository.findById(productId).get();
				if(p==null)
					return "product2 id is wrong";
				
				salesOrder.setChannelOrderId(random.nextInt()+"Y2022");
				salesOrder.setChannelId(30);
				salesOrder.setStatus("Pending");
				salesOrder.setUserId("bestdeals7710098678");
				salesOrder.setSoldPrice(p.getMrp()+"");
				salesOrder.setRemarks("unshipped");
				salesOrder.setInvoiceNumber(invoicenumber);
				salesOrder.setDate(new Date());
				
				SalesOrderItem  salesOrderItem=new SalesOrderItem();
				salesOrderItem.setSku(p.getSku());
				salesOrderItem.setQuantity(1);//fetch from product2
				salesOrderItem.setSalesOrderId(100);
				salesOrderItem.setOrderItemStatus("APPROVED");
				salesOrderItem.setSoldPrice(p.getMrp());
				salesOrderItem.setItemPrice(p.getMrp()+"");
				salesOrderItem.setItemName(p.getTitle());
				
				//to save the data in database
				salesOrderRepository.save(salesOrder);
				salesOrderItemRepository.save(salesOrderItem);
				
				return "Order are successfully placed.";
			}catch(Exception e) {
				e.printStackTrace();
				return "Order not place . something wrong....";
			}
	}
	
}
