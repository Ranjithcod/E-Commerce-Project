package com.ecommerceproject.controller;

import java.util.Optional;

import com.ecommerceproject.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerceproject.service.UserService;

import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/ECommerceProject")
public class UserController {

	@Autowired
	private UserService userservice;
	
	@PostMapping("/postUserDetails")
	public User postMethod(@RequestBody  @Valid  User user) {
		
		
		return userservice.postData(user);
	}
	
	
	@GetMapping("/getUserDetails/{id}")
	public Optional<User> getMethodName(@PathParam("id") Integer integer) {
		return userservice.getData(integer);
	}
	
	
	
}
