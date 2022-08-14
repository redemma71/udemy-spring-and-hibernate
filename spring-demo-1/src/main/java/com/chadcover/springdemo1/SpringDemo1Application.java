package com.chadcover.springdemo1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringDemo1Application {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"application.properties");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());
		System.out.println("theCoach memory location: " + theCoach);

//		Coach anotherCoach = context.getBean("myCoach", Coach.class);
//		System.out.println(anotherCoach.getDailyWorkout());
//		System.out.println(anotherCoach.getFortune());
//		System.out.println("anotherCoach memory location: " + anotherCoach);
//
//		boolean result = (theCoach == anotherCoach);
//		System.out.println("Printing to the same object: " + result);

		// these work with application.01.properties
		// call methods on the beans
		/*
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		// Coach cricketCoach = context.getBean("myCricketCoach", Coach.class);
		// Coach baseballCoach = context.getBean("myBaseballCoach", Coach.class);
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getFortune());
		System.out.println(cricketCoach.getEmailAddress());
		System.out.println(cricketCoach.getTeam());
		System.out.println(baseballCoach.getDailyWorkout());
		System.out.println(baseballCoach.getFortune());
		System.out.println(baseballCoach.getEmailAddress());
		System.out.println(baseballCoach.getTeam());
		*/


		// close the context
		context.close();

		//////////////
		// from app1
		/////////////
		// Coach trackCoach = new TrackCoach();
		// System.out.println(trackCoach.getDailyWorkout());
		// Coach baseballCoach = new BaseballCoach();
		// System.out.println(baseballCoach.getDailyWorkout());
		// Coach footballCoash = new FootballCoach();
		// System.out.println(footballCoash.getDailyWorkout());




	}

}
