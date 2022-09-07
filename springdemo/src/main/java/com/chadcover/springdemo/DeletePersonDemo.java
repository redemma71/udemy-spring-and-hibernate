package com.chadcover.springdemo;

import com.chadcover.springdemo.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class DeletePersonDemo {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .buildSessionFactory();

        // create Session
        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            System.out.println("Deleting a person");
           session.createQuery("DELETE FROM Person where id=8")
                           .executeUpdate();
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            factory.close();
        }
    }

}
