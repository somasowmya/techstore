package com.abc.techstore.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.abc.techstore.entity.Product;



public interface ProductRepository extends JpaRepository<Product,Integer> {

	public Optional<Product> findByProductName(String productName);

	@Query("select p from Product p where p.productPrice >= 50000")
	public List<Product> findAllPremiumnProducts();	

}