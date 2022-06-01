package com.example.product.service;

import java.util.List;

import com.example.product.model.Product;

public interface ProductService {
	Product createProduct(Product product);

	Product updateProduct(Product product);

	List<Product> getAllProduct();

	Product getProductById(long productId);
	
	Product getProductByName(String productName);

	void deleteProduct(long id);
}
