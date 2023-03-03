package com.product.api.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.api.entitys.User;

public interface UserRepository extends JpaRepository<User, String> {
	
}
