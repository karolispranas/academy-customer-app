package service;

import com.academy.exception.ValidationException;

public class CustomerAdultValidator extends Validator<Integer> {

    @Override
    public void validate(Integer integer) {
        if (integer < 18) {
            throw new ValidationException("Customer must be at least 18 years old");
        }
    }
}
