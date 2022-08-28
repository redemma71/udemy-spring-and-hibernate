package com.chadcover.springdemo;

import com.chadcover.springdemo.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryPersonDemo {

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
            System.out.println("Getting all persons");
//            List<Person> people = session.createQuery("From Person").getResultList();
//            List<Person> people = session
//                                    .createQuery("FROM Person AS p WHERE p.lastName='Kramer'" +
//                                            "OR p.firstName='Jerry'")
//                                    .getResultList();
            List<Person> people = session.createQuery("FROM Person as p WHERE p.email LIKE '%bosco.com'")
                                                .getResultList();

            for (Person person: people) {
                System.out.println(person.getId() + ": " + person.getFirstName() + " " +
                    person.getLastName());
            };
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            factory.close();
        }
    }

}
