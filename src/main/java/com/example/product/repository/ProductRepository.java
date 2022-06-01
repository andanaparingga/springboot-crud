package com.example.product.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.product.model.Product;

public interface ProductRepository extends MongoRepository<Product, Long>{
	Optional<Product> findByName(String productName);
}
