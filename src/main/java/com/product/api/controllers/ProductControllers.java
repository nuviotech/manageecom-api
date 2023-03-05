package com.product.api.controllers;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.api.Repo.Product2Repository;
import com.product.api.Repo.UserRepository;
import com.product.api.entitys.Images;
import com.product.api.entitys.Product2;
import com.product.api.entitys.User;
import com.product.api.service.ImageManager;

@CrossOrigin(origins = {"http://localhost:3000/","https://nuvio.in/","https://manageecom.com:8081/","https://manageecom.com:8083/","https://manageecom.com:8084/"}, maxAge = 3600)
@RestController
public class ProductControllers {
	@Autowired
	Product2Repository productRepository;
	@Autowired
	ImageManager imageManager;
	@Autowired
	UserRepository userRepository;
	
	//get all product2s
	//delete
	@GetMapping("products")
	public String getAllProducts(@RequestParam("_limit") int limit){
		System.out.println("Name : "+limit);
		Pageable pageble = PageRequest.of(0, limit);
		List<Product2> ptrs=new ArrayList<>();
		Page<Product2> page=productRepository.findAll(pageble);
		for(Product2 p:page) {
			p.setImages(imageManager.setTheImages(p));
			ptrs.add(p);	
		}
		return ptrs.toString();
	}
	
	
	@GetMapping("productsByPage")
	public String getProductsByPage(@RequestParam("_limit") int limit,@RequestParam("_start") int start){
		Pageable pageble = PageRequest.of((start/limit)-1, limit);
		List<Product2> ptrs=new ArrayList<>();
		Page<Product2> page=productRepository.findAll(pageble);
		for(Product2 p:page) {
			p.setImages(imageManager.setTheImages(p));
			ptrs.add(p);
		}
		return ptrs.toString();
	}
	
	//get product2 count
	//delete
	@GetMapping("products/count")
	public int getProductCount() {
		return productRepository.findAll().size();
	}
	
	//get the product2 by id
	@GetMapping("products/{productId}")
	public String getProductById(@PathVariable int productId) {
		Product2 product2=productRepository.getById(productId+"");
		product2.setImages(imageManager.setTheImages(product2));
		return product2.toString();
	}
	
	//get the product2s by categorywise (slug)
	//delete
	@GetMapping("product-categories")
	public String getProductBySlug(@RequestParam("slug") String slug) {
		List<Product2> ptrs=new ArrayList<>();
		for(Product2 p:productRepository.findBySlug(slug)) {
			p.setImages(imageManager.setTheImages(p));
			ptrs.add(p);
		}
		return ptrs.toString();
	}
	
	//get the product2 by brand name
	//delete
	@GetMapping("brands")
	public String getProductByBrand(@RequestParam ("slug") String slug) {
		List<Product2> ptrs=new ArrayList<>();
		for(Product2 p : productRepository.findByBrand(slug)) {
			p.setImages(imageManager.setTheImages(p));
			ptrs.add(p);
		}
		String str="["+ptrs.toString()+"]";
		return str;
	}
	
	//get multiple product2s by ids
	@GetMapping("productsByIds")
	public String getProductsByIds(@RequestParam("id_in") List<String> ids) {
		List<Product2> product2s=new ArrayList<>();
		for(String id:ids) {
			Product2 singleProduct=productRepository.findById(id).get();
			singleProduct.setImages(imageManager.setTheImages(singleProduct));
			product2s.add(singleProduct);
		}
		return product2s.toString();
	}
	
	@PostMapping("/getProducts")
	public List<Product2> getProducts(@RequestBody String str) {
		String array[]=str.split("&");
		User user=userRepository.findById(array[0]).get();
		List<Product2> ptrs=new ArrayList<>();

		for(Product2 p:user.getPtrs()) {
			p.setImages(imageManager.setTheImages(p));
			ptrs.add(p);	
		}
		return ptrs;
		//return user.getPtrs() ;
	}
	
	@PostMapping("/getProductsByCategory/{slug}")
	public List<Product2> getProductsByCategory(@RequestBody String str,@PathVariable String slug) {
		String array[]=str.split("&");
		User user=userRepository.findById(array[0]).get();
		List<Product2> ptr=new ArrayList<>();
		for (Product2 p:user.getPtrs()) {
			if(p.getSlug().equalsIgnoreCase(slug)) {
				ptr.add(p);
			}
		}	
		return ptr;
	}
	
	@PostMapping("/getProductsByBrand/{slug}")
	public List<Product2> getProductsByBrand(@RequestBody String str,@PathVariable String slug) {
		String array[]=str.split("&");
		User user=userRepository.findById(array[0]).get();
		List<Product2> ptr=new ArrayList<>();
		for (Product2 p:user.getPtrs()) {
			if(p.getBrand().equalsIgnoreCase(slug)) {
				ptr.add(p);
			}
		}	
		return ptr;
	}
	
	
}
