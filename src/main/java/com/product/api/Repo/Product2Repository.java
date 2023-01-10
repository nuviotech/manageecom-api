package com.product.api.Repo;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.product.api.entitys.Product;

public interface Product2Repository extends JpaRepository<Product, String> {
	@Query("select e from Product e where e.userId=:userId and (e.title like %:key% or e.brand like %:key%)")
	List<Product> getLikeProduct(@Param("userId") String userId,@Param("key") String key);
	
	//to get the all product by pagination
	//Page<Product> ProductByPagination(Pageable pageable);
	
	//to get the product by there sub category (slug)
	List<Product> findBySlug(String slug);
	List<Product> findByBrand(String brand);
	
}
