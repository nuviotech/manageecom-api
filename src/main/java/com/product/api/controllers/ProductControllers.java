package com.product.api.controllers;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.Hashmap;

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

@RestController
public class ProductControllers {
	@Autowired
	Product2Repository productRepository;
	@Autowired
	ImageManager imageManager;
	@Autowired
	UserRepository userRepository;
	
	//jdbcTemplate
	@Autowired
	JdbcTemplate jdbcTemplate;
	
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
		try {
			Pageable pageble = PageRequest.of((start/limit)-1, limit);
			List<Product2> ptrs=new ArrayList<>();
			Page<Product2> page=productRepository.findAll(pageble);
			for(Product2 p:page) {
				p.setImages(imageManager.setTheImages(p));
				ptrs.add(p);
			}
			return ptrs.toString();
		}catch(Exception e) {
			System.out.println("ProductByPage (ERROR) : "+e.getMessage());
			e.printStackTrace();
			return "";
		}
	}
	
	//get product2 count
	//delete
	@GetMapping("products/count")
	public int getProductCount() {
		return productRepository.findAll().size();
	}
	
	//get the product2 by id
	//delete
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
	//delete
	@PostMapping("productsByIds")
	public String getProductsByIds(@RequestBody String idStr) {
		System.out.println("jhdfjsdhfj");
		String ids[]=idStr.split(idStr);
		List<Product2> product2s=new ArrayList<>();
		for(String id:ids) {
			System.out.println("id : "+id);
			if(id.length()>0) {
				System.out.println(id.length()+" length");
				Product2 singleProduct=productRepository.findById(id).get();
				singleProduct.setImages(imageManager.setTheImages(singleProduct));
				product2s.add(singleProduct);
			}
		}
		return product2s.toString();
	}
	
	@PostMapping("/getProducts")

	public List<Map<String, Object>> getProducts(@RequestParam String sellerId) {
		System.out.println("get products");
		
		List<Map<String, Object> ptrs = jdbcTemplate.queryforList("select * from product2 where USER_ID=?", new String[]{sellerId});
		
		return ptrs;
	}
	
	@PostMapping("/getProductsByCategory/{slug}")
	public List<Product2> getProductsByCategory(@RequestBody String str,@PathVariable String slug) {
		String array[]=str.split("&");
		List<Product2> ptr=new ArrayList<>();
		try {
			User user=userRepository.findById(array[0]).get();
			for (Product2 p:user.getPtrs()) {
				if(p.getSlug().equalsIgnoreCase(slug)) {
					ptr.add(p);
				}
			}	
			return ptr;
		}catch(Exception e) {
			System.out.println("getproductByCategorys (ERROR) : "+e.getMessage());
			return ptr;
		}
	}
	
	@PostMapping("/getProductsByBrand/{slug}")
	public List<Product2> getProductsByBrand(@RequestBody String str,@PathVariable String slug) {
		List<Product2> ptr=new ArrayList<>();
		try {
		String array[]=str.split("&");
		User user=userRepository.findById(array[0]).get();
		
		for (Product2 p:user.getPtrs()) {
			if(p.getBrand().equalsIgnoreCase(slug)) {
				ptr.add(p);
			}
		}	
		return ptr;
		}catch(Exception e) {
			System.out.println("getProductByBrand (ERROR) : "+e.getMessage());
			e.printStackTrace();
			return ptr;
		}
	}
	
}
