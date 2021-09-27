package com.springsecurity.springsecurityexample.service;

import com.springsecurity.springsecurityexample.entities.Product;

import java.util.List;
import java.util.Optional;



public interface ProductService {
    Product save(Product product);

    void deleteById(Long id);

    Optional<Product> findById(Long id);

    List<Product> findAll();
}
