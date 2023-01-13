package com.product.api.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.api.entitys.Stores;

public interface StoresRepository extends JpaRepository<Stores, Integer> {

}
