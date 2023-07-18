package com.example.valid_exception.service;


import com.example.jpaprac.data.dto.ProductDto;
import com.example.jpaprac.data.dto.ProductResponseDto;

public interface ProductService {
    ProductResponseDto getProduct(Long number);

    ProductResponseDto saveProduct(ProductDto productDto);

    ProductResponseDto changeProductName(Long number, String name) throws Exception;

    void deleteProduct(Long number) throws Exception;
}
