package com.product.api.Repo;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.product.api.entitys.Product2;

public interface Product2Repository extends JpaRepository<Product2, String> {
	@Query("select e from Product2 e where e.userId=:userId and (e.title like %:key% or e.brand like %:key%)")
	List<Product2> getLikeProduct(@Param("userId") String userId,@Param("key") String key);
	
	//to get the all product2 by pagination
	//Page<Product2> ProductByPagination(Pageable pageable);
	
	//to get the product2 by there sub category (slug)
	List<Product2> findBySlug(String slug);
	List<Product2> findByBrand(String brand);
	
	public List<Product2> findByUserId(String email);
	
}
