package com.di.customer.repository;

import com.di.customer.model.Customer;

public interface CustomerRepository {
    Customer findCustomerById(String id);
}
