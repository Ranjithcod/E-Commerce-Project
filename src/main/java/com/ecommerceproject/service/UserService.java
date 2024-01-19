package com.ecommerceproject.service;

import java.util.Optional;

import com.ecommerceproject.entity.User;
import com.ecommerceproject.entity.Cart;
import com.ecommerceproject.repository.CartRepository;
import com.ecommerceproject.repository.UserRepository;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CartRepository cartrepository;

	public User postData(User user) {
		return userRepository.save(user);
	}

	public Optional<User> getData(Integer id) {
		return userRepository.findById(id);
	}
	
	@Transactional
	public void saveCartWithUser(Cart cart, User user) {
	    userRepository.save(user);
	    cartrepository.save(cart);
	}

}
