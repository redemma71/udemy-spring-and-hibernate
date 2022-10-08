package com.chadcover.springdemo.service;

import com.chadcover.springdemo.entity.Customer;

import java.util.List;

public interface CustomerService {
    public void deleteCustomer(int id);
    public Customer getCustomer(int id);
    public List<Customer> getCustomers(int theSortField);
    public void saveCustomer(Customer customer);
    public List<Customer> searchCustomers(String searchName);
}
