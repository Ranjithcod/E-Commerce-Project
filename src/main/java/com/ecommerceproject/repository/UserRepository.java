package com.ecommerceproject.repository;

import com.ecommerceproject.entity.User;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.ecommerceproject.entity.Products;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	//Products save(Products products);
	

}
