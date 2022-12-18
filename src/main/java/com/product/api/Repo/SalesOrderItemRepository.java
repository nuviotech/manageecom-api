package com.product.api.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.api.entitys.SalesOrderItem;

public interface SalesOrderItemRepository extends JpaRepository<SalesOrderItem, Integer> {

}
