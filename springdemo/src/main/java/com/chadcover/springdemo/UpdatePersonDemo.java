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
            int personId = 1;
            Person george = session.get(Person.class, personId);
            // george.setDateOfBirth(DateUtils.parseDate("09/23/1959"));
            // update is not persisted until you apply commit()
            session.getTransaction().commit();
            System.out.println(george.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            factory.close();
        }
    }

}