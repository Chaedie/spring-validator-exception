package com.example.valid_exception.config.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class TelephoneValidator implements ConstraintValidator<Telephone, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if (value==null) {
            return false;
        }
        return value.matches("^01([0|1|6|7|8|9])-?([0-9]{3,4})-?([0-9]{4})$");
    }
}
