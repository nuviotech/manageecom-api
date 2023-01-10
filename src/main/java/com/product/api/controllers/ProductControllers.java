package com.product.api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.api.Repo.Product2Repository;
import com.product.api.entitys.Product;

@CrossOrigin(origins = "http://localhost:3000/", maxAge = 3600)
@RestController
public class ProductControllers {
	@Autowired
	Product2Repository productRepository;
	
	//get all products
	@GetMapping("products")
	public String getAllProducts(@RequestParam("_limit") int limit){
		System.out.println("Name : "+limit);
		Pageable pageble = PageRequest.of(0, limit);
		List<Product> ptrs=new ArrayList<>();
		Page<Product> page=productRepository.findAll(pageble);
		for(Product p:page) {
			ptrs.add(p);
		}
		return ptrs.toString();
	}
	
	@GetMapping("productsByPage")
	public String getProductsByPage(@RequestParam("_limit") int limit,@RequestParam("_start") int start){
		//System.out.println("Name : "+limit+" start : "+start+" -> page : "+((start/limit)-1));
		Pageable pageble = PageRequest.of((start/limit)-1, limit);
		List<Product> ptrs=new ArrayList<>();
		Page<Product> page=productRepository.findAll(pageble);
		for(Product p:page) {
			ptrs.add(p);
		}
		return ptrs.toString();
	}
	
	//get product count
	@GetMapping("products/count")
	public int getProductCount() {
		return productRepository.findAll().size();
	}
	
	//get the product by id
	@GetMapping("/products/{productId}")
	public String getProductById(@PathVariable int productId) {
		Product product=productRepository.getById(productId+"");
		return product.toString();
	}
	
	//get the products by categorywise (slug)
	@GetMapping("/product-categories")
	public String getProductBySlug(@RequestParam("slug") String slug) {
		List<Product> ptrs=productRepository.findBySlug(slug);
		return ptrs.toString();
	}
	
	//get the product by brand name
	@GetMapping("/brands")
	public String getProductByBrand(@RequestParam ("slug") String slug) {
		List<Product> products=productRepository.findByBrand(slug);
		String str="["+products.toString()+"]";
		return str;
	}
}
