package com.chadcover.springdemo;

import com.chadcover.springdemo.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreatePersonDemo {

    public static void main(String[] args) {

        // create Session Factory
        SessionFactory factory = new Configuration()
                                        .configure("hibernate.cfg.xml")
                                        .addAnnotatedClass(Person.class)
                                        .buildSessionFactory();

        // create Session
        Session session = factory.getCurrentSession();

        try {
            // use session object to save a java object
            // 1. create a person object
            System.out.println("Creating a new Person object");
            Person art = new Person("Arthur", "Vandelay", "art@architects-rock.com");

            // 2. start a transaction
            session.beginTransaction();

            // 3. save the person object
            System.out.println("Saving the Person object");
            session.save(art);

            // 4. commit object
            session.getTransaction().commit();
            System.out.println("Done");

        } catch (Exception e ) {
            e.printStackTrace();
        } finally {
            factory.close();
        }
    }
}
