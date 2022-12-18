package com.product.api.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.product.api.entitys.Product2;

public interface Product2Repository extends JpaRepository<Product2, String> {
	@Query("select e from Product2 e where e.title like %:key% or e.brand like %:key%")
	List<Product2> getLikeProductTitleorBrand(@Param("key") String key);
	
}
