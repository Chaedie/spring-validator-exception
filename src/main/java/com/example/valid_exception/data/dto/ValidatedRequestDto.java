package com.example.valid_exception.data.dto;

import com.example.valid_exception.config.annotation.Telephone;
import com.example.valid_exception.data.group.ValidationGroup1;
import com.example.valid_exception.data.group.ValidationGroup2;
import lombok.*;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ValidatedRequestDto {
    
    @NotBlank
    private String name;

    @Email
    private String email;
    
    @Telephone
    String phoneNumber;
    
    @Min(value=20)
    @Max(value=40)
    int age;

    // @Size(min=0, max=40)
    String description;

    @Positive
    int count;

    @AssertTrue
    boolean booleanCheck;
}
