package service;

import com.academy.exception.MandatoryValueMissingException;

public class InvalidCountryCodeExeption extends MandatoryValueMissingException {
    public InvalidCountryCodeExeption(String message) {
        super("Country code is not valid" + message);
    }
}
