package com.ecommerceproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerceproject.entity.Products;
import com.ecommerceproject.repository.ProductsRepository;

@Service
public class ProductService {

	@Autowired
	private ProductsRepository productsrepository;

	public Products postProdutsData(Products products) {

		return productsrepository.save(products);
	}

	public Optional<Products> getProductData(Integer integer) {

		return productsrepository.findById(integer);
	}

	public List<Products> getByName(Integer str) {

		return productsrepository.getByNameDetails(str);
	}

	public String deleteProductData(Integer integer) {
		// TODO Auto-generated method stub
		productsrepository.deleteById(integer);
		return "Deleted";
	}

	public Products updateData(Integer i, Products product) {
		Optional<Products> pr = productsrepository.findById(i);
		Products products = pr.get();
		products.setProductsname(product.getProductsname());
		products.setImage(product.getImage());
		products.setQuantity(product.getQuantity());
		products.setPrice(product.getPrice());
		products.setWeight(product.getWeight());
		products.setDescription(product.getDescription());
		products.setCategory(product.getCategory());
		return productsrepository.save(products);
	}

}
