package service;

import com.academy.entity.Customer;

public class CustomerValidator {

    private Validator<Customer> mandatoryCustomerValuesValidator = new MandatoryCustomerValuesValidator();
    private Validator<String> countryCodeValidator = new CountryCodeValidator();
    private Validator<Integer> customerAdultValidator = new CustomerAdultValidator();

    public void validate(Customer customer) {
        mandatoryCustomerValuesValidator.validate(customer);
        countryCodeValidator.validate(customer.getCountryCode());
        customerAdultValidator.validate(customer.getAge());
    }

}
