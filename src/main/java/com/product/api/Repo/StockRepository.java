package com.product.api.Repo;

import org.springframework.data.jpa.repository.JpaRepository;



import com.product.api.entitys.Stock;

public interface StockRepository extends JpaRepository<Stock, Integer> {
	Stock findBySkuAndUserId(String sku,String userId);
	

}
