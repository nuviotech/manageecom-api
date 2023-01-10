package com.product.api.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.api.entitys.Images;

public interface ImageRepository extends JpaRepository<Images, Integer> {

}
