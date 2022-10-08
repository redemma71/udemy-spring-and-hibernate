package com.chadcover.springdemo.dao;

import com.chadcover.springdemo.entity.Customer;
import com.chadcover.springdemo.utils.SortUtils;
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
    public List<Customer> getCustomers(int theSortField) {
        String theFieldName = null;
        switch (theSortField) {
            case SortUtils.FIRST_NAME:
                theFieldName = "firstName";
                break;
            case SortUtils.LAST_NAME:
                theFieldName = "lastName";
                break;
            case SortUtils.EMAIL:
                theFieldName = "email";
                break;
            default:
                theFieldName = "lastName";
        }
        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();
        // create a query
        Query<Customer> query =
                currentSession.createQuery("FROM Customer ORDER BY " + theFieldName, Customer.class);
        // execute query and get result list
        List<Customer> customers = query.getResultList();
        // return the results
        return customers;
    }

    @Override
    public void saveCustomer(Customer theCustomer) {
        Session currentSession = sessionFactory.getCurrentSession();
        // if there is an id in db, update, or save
        currentSession.saveOrUpdate(theCustomer);
    }

    @Override
    public List<Customer> searchCustomers(String theSearchName) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query query = null;

        if (theSearchName != null && theSearchName.trim().length() > 0) {
            query = currentSession.createQuery("FROM Customer where lower(firstName) like :name or lower(lastName) like :name", Customer.class);
            query.setParameter("name", "%" + theSearchName.toLowerCase() + "%");

        } else {
            query = currentSession.createQuery("FROM Customer", Customer.class);
        }
        List<Customer> customers = query.getResultList();
        return customers;
    }

}
