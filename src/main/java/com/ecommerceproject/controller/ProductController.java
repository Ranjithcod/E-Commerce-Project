package com.ecommerceproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerceproject.entity.Products;
import com.ecommerceproject.service.ProductService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productservice;

	@PostMapping("/postProductsDetails")
	public Products postMethodName(@RequestBody @Valid Products products) {

		return productservice.postProdutsData(products);
	}

	// this is working
	// get by id and return products and category details
	@GetMapping("/getProductsDetails/{id}")
	public Optional<Products> getMethodName(@PathVariable("id") Integer integer) {
		return productservice.getProductData(integer);
	}

	// this is working
	// get by price and return products and category details

	@GetMapping("/getDetails/{price}")
	public List<Products> getProductsPriceName(@PathVariable("price") Integer str) {
		return productservice.getByName(str);
	}

	@PutMapping("/updateDetails/{id}")
	public Products putMethodName(@PathVariable("id") Integer i, @RequestBody Products product) {

		return productservice.updateData(i, product);
	}

	@DeleteMapping("/deleteProducts/{id}")
	public String deleteData(@PathVariable("id") Integer integer) {
		return productservice.deleteProductData(integer);
	}

}
