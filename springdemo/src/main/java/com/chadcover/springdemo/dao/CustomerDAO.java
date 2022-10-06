package com.chadcover.springdemo.dao;

import java.util.List;

import com.chadcover.springdemo.entity.Customer;

public interface CustomerDAO {
    public Customer getCustomer(int id);
    public List<Customer> getCustomers();
    public void saveCustomer(Customer customer);
}
