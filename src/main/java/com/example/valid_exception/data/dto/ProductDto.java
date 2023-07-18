package com.example.valid_exception.data.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductDto {
    
    private String name;
    private int price;
    private int stock;
}
