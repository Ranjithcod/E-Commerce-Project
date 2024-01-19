package com.ecommerceproject.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerceproject.entity.Cart;
import com.ecommerceproject.entity.User;
import com.ecommerceproject.service.CartService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	private CartService cartservice;

	@PostMapping("/cartPost")
	public Cart postMethod(@RequestBody Cart cart) {

		return cartservice.postData(cart);
	}
	

	@GetMapping("/addCart/{id}")
	public Optional<Cart> getMethod(@PathVariable("id") Integer integer) {
		return cartservice.geCartData(integer);
	}

	@PutMapping("updataData/{id}")
	public Cart putMethodName(@PathVariable("id") Integer integer, @RequestBody Cart cart) {

		return cartservice.updataCartData(integer, cart);
	}

}
