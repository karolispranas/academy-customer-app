package service;

import com.academy.entity.Customer;
import com.academy.repository.CustomerRepository;
import com.academy.repository.MemoryCustomerRepository;

import java.util.List;


public class CustomerService {
    private CustomerRepository repository = new MemoryCustomerRepository();
    private CustomerValidator customerValidator = new CustomerValidator();

    public List<Customer> findAll() {
        return repository.findAll();
    }


    public void insert(Customer customer) {
        customerValidator.validate(customer);

        customer = formatCustomer(customer);

        repository.insert(customer);
    }

    private Customer formatCustomer(Customer customer) {
        String firstName = capitalizeFirstLetter(customer.getFirstName());
        String lastName = capitalizeFirstLetter(customer.getLastName());
        String personalNumber = formatPersonalNumber(customer.getPersonalNumber());
        Customer.Builder customerBuilder = new Customer.Builder(
                firstName,
                lastName,
                personalNumber
        );

        customerBuilder
                .withAge(customer.getAge())
                .withCity(customer.getCity())
                .withCountryCode(customer.getCountryCode())
                .withMiddleName(customer.getMiddleName());

        return customerBuilder.build();
    }


    public void deleteById(String customerId) {
        repository.deleteById(customerId);
    }

    private String capitalizeFirstLetter(String string) {
        if (string.isEmpty()) {
            return string;
        }
        return string.substring(0, 1).toUpperCase() +
                string.substring(1);
    }

    private String formatPersonalNumber(String personalNumber) {
        if (personalNumber == null || personalNumber.length() <= 4) {
            return personalNumber;
        }
        return String.format("%s-%s", personalNumber.substring(0, 4), personalNumber.substring(4));
    }


}
