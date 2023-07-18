package com.example.valid_exception.data.dao;


import com.example.jpaprac.data.entity.Product;

public interface ProductDAO {
    Product inisertProduct(Product product);
    
    Product selectProduct(Long number);
    
    Product updateProductName(Long number, String name) throws Exception;

    void deleteProduct(Long number) throws Exception;
    
}
