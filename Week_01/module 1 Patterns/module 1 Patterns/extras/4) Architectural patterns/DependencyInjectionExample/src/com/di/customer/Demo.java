package com.di.customer;

import com.di.customer.repository.*;
import com.di.customer.service.CustomerService;

public class Demo {
    public static void main(String[] args) {

        CustomerRepository repo = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repo);

        System.out.println("Looking up E049 …");
        var customer = service.getCustomer("E049");
        System.out.println("Result -> " + customer);

        System.out.println("Looking up unknown …");
        System.out.println("Result -> " + service.getCustomer("C999"));
    }
}
