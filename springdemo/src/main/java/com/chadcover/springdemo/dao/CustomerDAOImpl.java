package com.chadcover.springdemo.dao;

import com.chadcover.springdemo.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void deleteCustomer(int id) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query query = currentSession.createQuery("DELETE FROM Customer WHERE id=:customerId");
        query.setParameter("customerId", id);
        query.executeUpdate();
    }

    @Override
    public Customer getCustomer(int id) {
        Session currentSession = sessionFactory.getCurrentSession();
        Customer customer = currentSession.get(Customer.class, id);
        return customer;
    }

    @Override
    public List<Customer> getCustomers() {
        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();
        // create a query
        Query<Customer> query =
                currentSession.createQuery("FROM Customer ORDER BY lastName", Customer.class);
        // execute query and get result list
        List<Customer> customers = query.getResultList();
        // return the results
        return customers;
    }

    @Override
    public void saveCustomer(Customer customer) {
        Session currentSession = sessionFactory.getCurrentSession();
        // if there is an id in db, update, or save
        currentSession.saveOrUpdate(customer);
    }

    @Override
    public List<Customer> searchCustomers(String searchName) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query query = null;

        if (searchName != null && searchName.trim().length() > 0) {
            query = currentSession.createQuery("FROM Customer where lower(firstName) like :name or lower(lastName) like :name", Customer.class);
            query.setParameter("name", "%" + searchName.toLowerCase() + "%");

        } else {
            query = currentSession.createQuery("FROM Customer", Customer.class);
        }
        List<Customer> customers = query.getResultList();
        return customers;
    }

}
