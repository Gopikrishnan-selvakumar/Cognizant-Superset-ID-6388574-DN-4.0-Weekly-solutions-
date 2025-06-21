package com.di.customer.repository;

import com.di.customer.model.Customer;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {

    private static final Map<String, Customer> MOCK_DB = Map.of(
            "E049", new Customer("E049", "GOPI"),
            "E025", new Customer("E025", "ASWANTH")
    );

    @Override
    public Customer findCustomerById(String id) {
        System.out.println("Fetching from DB layer …");
        return MOCK_DB.get(id);
    }
}
