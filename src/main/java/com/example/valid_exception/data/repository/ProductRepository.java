package com.example.valid_exception.data.repository;


import com.example.valid_exception.data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
