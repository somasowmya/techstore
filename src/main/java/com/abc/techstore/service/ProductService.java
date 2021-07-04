package com.abc.techstore.service;

import com.abc.techstore.entity.Product;
import com.abc.techstore.exception.ProductNotAvailableException;

public interface ProductService {
	public void saveProduct(Product product) throws ProductNotAvailableException;
}