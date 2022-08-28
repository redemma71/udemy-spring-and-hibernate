package com.chadcover.springdemo;

import com.chadcover.springdemo.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class UpdatePersonDemo {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .buildSessionFactory();

        // create Session
        Session session = factory.getCurrentSession();

        // get a person
        try {
            session.beginTransaction();
            System.out.println("Updating a person");
            int personId = 3;
            Person jerry = session.get(Person.class, 3);
            jerry.setEmail("jerry@bosco.com");
            System.out.println("Jerry's email: " + jerry.getEmail());
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            factory.close();
        }
    }

}
