package com.example.valid_exception.data.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductResponseDto {
    private Long number;
    private String name;
    private int price;
    private int stock;
}
