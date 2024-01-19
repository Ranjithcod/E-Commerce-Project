package com.ecommerceproject.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerceproject.entity.Cart;
import com.ecommerceproject.repository.CartRepository;

@Service
public class CartService {

	@Autowired
	private CartRepository cartrepository;

	public Cart postData(Cart cart) {

		return cartrepository.save(cart);
	}

	public Optional<Cart> geCartData(Integer integer) {

		return cartrepository.findById(integer);
	}

	public Cart updataCartData(Integer integer, Cart cart) {

		Optional<Cart> car = cartrepository.findById(integer);
		Cart ca = car.get();
		ca.setCustomer(cart.getCustomer());
		ca.setProducts(cart.getProducts());
		return cartrepository.save(ca);
	}

}
