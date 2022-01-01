package com.example.demo.dao;

import com.example.demo.dto.Customer;

import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Repository
public class CustomerDAO {

    public Customer createCustomer(Customer customer) {

        return new Customer();
    }

    public Customer getCustomerByName(String name) {
        return new Customer();
    }
}
