package com.product.api.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.api.entitys.SalesOrder;

public interface SalesOrderRepository extends JpaRepository<SalesOrder, String>{
	public List<SalesOrder> findByInvoiceNumber(String invoice);

}
