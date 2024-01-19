package com.ecommerceproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerceproject.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

}
