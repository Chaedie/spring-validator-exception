package com.example.valid_exception.data.dto;

import com.example.valid_exception.config.annotation.Age;
import lombok.*;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ValidRequestDto {

    @NotBlank
    String name;

    @Email
    String email;

    @Pattern(regexp = "^01([0|1|6|7|8|9])-?([0-9]{3,4})-?([0-9]{4})$")
    String phoneNumber;

    @Age
    int age;

    // @Size(min=0, max=40)
    String description;

    @Positive
    int count;

    @AssertTrue
    boolean booleanCheck;

}
