package com.di.customer.service;

import com.di.customer.model.Customer;
import com.di.customer.repository.CustomerRepository;

public class CustomerService {

    private final CustomerRepository repository;   //

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public Customer getCustomer(String id) {
        return repository.findCustomerById(id);
    }
}
