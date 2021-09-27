package com.springsecurity.springsecurityexample.repository;

import com.springsecurity.springsecurityexample.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
