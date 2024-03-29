package com.academy.repository;

import com.academy.entity.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface CustomerRepository {

    List<Customer> findAll();
    void insert(Customer customer);
    void deleteById(String customerId);

}
