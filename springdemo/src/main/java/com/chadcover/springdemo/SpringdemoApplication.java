package com.chadcover.springdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.bytecode.spi.InstrumentedClassLoader;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {

		// create Session Factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class)
				.buildSessionFactory();

		// create Session
		Session session = factory.getCurrentSession();

		try {
			// use session object to save a java object
			// Creating instructor objects
//			System.out.println("Creating Instructor");

//			Instructor instructor = new Instructor("Chad","Cover","chaddcover@gmail.com");
//			InstructorDetail instructorDetail = new InstructorDetail("http://youtube.com/BeemoreApiary", "hacking");

//			Instructor instructor2 = new Instructor("Arthur", "Vandelay", "art@architectsrock.com");
//			InstructorDetail instructorDetail2 = new InstructorDetail("http://youtube.com/seinfeld", "kvetching");

//			Instructor instructor3 = new Instructor("Moe", "Howard", "moe@stooges.com");
//			InstructorDetail instructorDetail3 = new InstructorDetail("http://youtube.com/three_stooges", "acting");

//			instructor.setInstructorDetail(instructorDetail);
//			instructor2.setInstructorDetail(instructorDetail2);
//			instructor3.setInstructorDetail(instructorDetail3);

			// 2. start a transaction
			session.beginTransaction();

			// 3a. save object to db
//			session.save(instructor3);

			// 3b. getting an instructor and associated courses
			// Instructor instructor = session.get(Instructor.class, 2);
			Course course = session.get(Course.class, 10);
			// System.out.println("yadda yadda yadda, Instructor: " + instructor);
			// System.out.println("yadda yadda yadda, Courses: " + instructor.getCourses());
			System.out.println("booya Course: " + course);


///////////////////////////////////////////////////////////////////////////
			// 4a. Deleting an instructor
//			Instructor instructorToBeDeleted = session.get(Instructor.class, 3);
//			System.out.println("*****************Deleting******************");
////
//			if (instructorToBeDeleted != null ) {
//				session.delete(instructorToBeDeleted);
//				System.out.println("Deleted " + instructorToBeDeleted);
//			}

///////////////////////////////////////////////////////////////////////////
			// 4b. Demonstrating bi-directional behavior (cascade=CascadeType.ALL)
			// getting an instructor by instructor detail
//			InstructorDetail instructorDetail = session.get(InstructorDetail.class, 5);
//			InstructorDetail instructorDetail = session.get(InstructorDetail.class, 42); // there is no #42, so use try/catch to handle errors
//			System.out.println("Found: " + instructorDetail);
//			session.delete(instructorDetail);


///////////////////////////////////////////////////////////////////////////
			// 4c. Demonstrating unidirectional behavior (cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,CascadeType.REFRESH})
			// Deleting an instructor_id but not instructor
//			InstructorDetail instructorDetailToBeDeleted = session.get(InstructorDetail.class, 5);
//			if (instructorDetailToBeDeleted != null ) {
//				session.delete(instructorDetailToBeDeleted);
//				System.out.println("Associated instructor: " + instructorDetailToBeDeleted.getInstructor());
//	            instructorDetailToBeDeleted.getInstructor().setInstructorDetail(null);
//				System.out.println("Deleted " + instructorDetailToBeDeleted);
//			}

///////////////////////////////////////////////////////////////////////////
//			// 5. Deleting a course
//			Course courseToBeDeleted = session.get(Course.class, 12);
//			System.out.println("Deleting course: "  + courseToBeDeleted);
//			session.delete(courseToBeDeleted);

			// 6a. commit object
			session.getTransaction().commit();

			// 6b. close session
			session.close();

//			Session session2 = factory.getCurrentSession();
//			Instructor instructor2 = session2.get(Instructor.class, 2);
//			System.out.println("Courses: " + instructor2.getCourses());
//			System.out.println("Done");

		} catch (Exception e ) {
			System.out.println("*****************Error encountered********************");
			e.printStackTrace();
		} finally {
			factory.close();
		}


	}

}
