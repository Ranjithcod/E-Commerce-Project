package com.ecommerceproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ecommerceproject.entity.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer>{
	
	
	
	@Query(value = "SELECT b.id, b.productsname, b.image, b.quantity, b.price, b.weight, b.description, a.category_id, a.categoryname " +
	        "FROM Products b " +
	        "LEFT JOIN Category a ON b.category_id = a.category_id " +
	        "WHERE b.price = :price", nativeQuery = true)
	public List<Products> getByNameDetails(@Param("price") Integer price);



	
}
