package service;

import com.academy.entity.CountryCode;

public class CountryCodeValidator extends Validator<String> {


    @Override
    public void validate(String s) {
        if (s != null && !s.isEmpty()) {
            try {
                CountryCode.valueOf(s);
            } catch (IllegalArgumentException e) {
                throw new com.academy.exception.ValidationException("Country code provided is not valid");
            }
        }
    }
}
