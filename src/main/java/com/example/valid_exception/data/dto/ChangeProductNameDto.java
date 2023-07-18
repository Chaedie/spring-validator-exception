package com.example.valid_exception.data.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ChangeProductNameDto {
    private Long number;
    private String name;
}
