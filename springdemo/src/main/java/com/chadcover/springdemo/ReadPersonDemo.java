package com.chadcover.springdemo;

import com.chadcover.springdemo.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadPersonDemo {

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
            System.out.println("Getting a person");
            Person george = session.get(Person.class, 2);
            System.out.println("The person is: " + george.getFirstName() + " " + george.getLastName());
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            factory.close();
        }
    }

}
