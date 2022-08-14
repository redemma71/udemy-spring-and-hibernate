package com.chadcover.springdemo2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringDemo2BeanScopeApplication {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanScope.application.properties");

		// retrieve beans from spring container
		Coach theCoach = context.getBean("myFootballCoach", Coach.class);
		Coach betaCoach = context.getBean("myFootballCoach", Coach.class);

		System.out.println("theCoach's daily fortune: " + theCoach.getDailyFortune());
		System.out.println("theCoach bean: " + theCoach);

		System.out.println("betaCoach's daily fortune: " + betaCoach.getDailyFortune());
		System.out.println("betaCoach bean: " + betaCoach);

		boolean beansAreEqual = theCoach == betaCoach;
		System.out.println("theCoach == betaCoach: " + beansAreEqual );

		// close the context
		context.close();

	}

}
