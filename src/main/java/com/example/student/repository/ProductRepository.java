package com.example.student.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.student.model.Product;

public interface ProductRepository extends MongoRepository<Product, Long>{

}
