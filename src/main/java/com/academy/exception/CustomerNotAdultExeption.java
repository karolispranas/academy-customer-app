package com.academy.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.UNPROCESSABLE_ENTITY)
public class CustomerNotAdultExeption extends MandatoryValueMissingException{
    public CustomerNotAdultExeption(String message) {
        super(message);
    }
}
