package com.chadcover.springdemo.dao;

import java.util.List;

import com.chadcover.springdemo.entity.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDAO {
    public List<Customer> getCustomers();
}
