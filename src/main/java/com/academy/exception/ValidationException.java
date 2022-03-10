package com.academy.exception;

public class ValidationException extends MandatoryValueMissingException {
    public ValidationException(String message) {
        super(message);
    }
}
