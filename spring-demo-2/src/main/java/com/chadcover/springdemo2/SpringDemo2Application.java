package com.chadcover.springdemo2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringDemo2Application {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"application.properties");

		// retrieve beans from spring container
		Coach theCoach = context.getBean("myFootballCoach", Coach.class);
		System.out.println("FootballCoach's daily workout: " + theCoach.getDailyWorkout());
		System.out.println("FootballCoach's daily fortune: " + theCoach.getDailyFortune());
		System.out.println("FootballCoach's email address: " + theCoach.getEmail());
		System.out.println("FootballCoach's team: " + theCoach.getTeamName());

		Coach tennisCoach = context.getBean("myTennisCoach", Coach.class);
		System.out.println("TennisCoach's daily workout: " + tennisCoach.getDailyWorkout());
		System.out.println("TennisCoach's daily fortune: " + tennisCoach.getDailyFortune());

		Coach volleyballCoach = context.getBean("myVolleyballCoach", VolleyballCoach.class);
		System.out.println("VolleyballCoach's daily workout: " + volleyballCoach.getDailyWorkout());
		System.out.println("VolleyballCoach's daily fortune: " + volleyballCoach.getDailyFortune());

		// close the context
		context.close();

	}

}
