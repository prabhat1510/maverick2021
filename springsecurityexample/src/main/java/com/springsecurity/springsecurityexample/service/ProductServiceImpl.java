package com.springsecurity.springsecurityexample.service;

import java.util.List;
import java.util.Optional;

import com.springsecurity.springsecurityexample.entities.Product;
import com.springsecurity.springsecurityexample.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

    @Service
    public class ProductServiceImpl implements ProductService {

        @Autowired
        private ProductRepository productRepository;

        @Override
        public Product save(Product product) {
            return productRepository.save(product);
        }

        @Override
        public void deleteById(Long id) {
            productRepository.deleteById(id);
        }

        @Override
        public Optional<Product> findById(Long id) {
            return productRepository.findById(id);
        }

        @Override
        public List<Product> findAll() {
            return productRepository.findAll();
        }

}
