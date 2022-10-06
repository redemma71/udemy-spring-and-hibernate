package com.chadcover.springdemo.service;

import com.chadcover.springdemo.entity.Customer;

import java.util.List;

public interface CustomerService {
    public Customer getCustomer(int id);
    public List<Customer> getCustomers();
    public void saveCustomer(Customer customer);
}
