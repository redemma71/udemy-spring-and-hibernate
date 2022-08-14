package com.chadcover.springdemo4;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringDemo4Application {

  public static void main(String[] args) {

    // read the spring config file
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

    // autowiring is implemented using constructor injection here
    Coach footballCoach = context.getBean("footballCoach", Coach.class);

    // call a method on the bean
    System.out.println("####################### Start FootballCoach #######################");
    System.out.println("Daily workout: " + footballCoach.getDailyWorkout());
    System.out.println("Daily fortune: " + footballCoach.getDailyFortune());
    System.out.println("Coach's email: " + footballCoach.getEmail());
    System.out.println("Coach's team: " + footballCoach.getTeam());
    System.out.println("####################### End   FootballCoach #######################\n");

    // get a bean with its default component name
    // autowiring is implemented via constructor injection here
    Coach volleyballCoach = context.getBean("volleyballCoach", Coach.class);

    // call methods on VolleyballCoach
    System.out.println("####################### Start VolleyballCoach #######################");
    System.out.println("Daily workout: " + volleyballCoach.getDailyWorkout());
    System.out.println("Daily fortune: " + volleyballCoach.getDailyFortune());
    System.out.println("####################### End   VolleyballCoach #######################\n");

    // get a bean using setter injection for autowiring
    Coach baseballCoach  = context.getBean("baseballCoach", Coach.class);

    // call methods on BaseballCoach
    System.out.println("####################### Start BaseballCoach #######################");
    System.out.println("Daily workout: " + baseballCoach.getDailyWorkout());
    System.out.println("Daily fortune: " + baseballCoach.getDailyFortune());
    System.out.println("Coach's email: " + baseballCoach.getEmail());
    System.out.println("Coach's team: " + baseballCoach.getTeam());
    System.out.println("####################### End   BaseballCoach #######################\n");


    Coach basketballCoach = context.getBean("basketballCoach", Coach.class);
    Coach basketballCoach2 = context.getBean("basketballCoach", Coach.class);

    // call methods on BasketballCoach
    System.out.println("####################### Start BasketballCoach1 #######################");
    System.out.println("Daily workout: " + basketballCoach.getDailyWorkout());
    System.out.println("Daily fortune: " + basketballCoach.getDailyFortune());
    System.out.println("####################### End BasketballCoach #######################\n");

    System.out.println("##################### Using @Scope(\"prototype\") ####################");
    System.out.println("####################### Start BasketballCoach2 #######################");
    System.out.println("Daily workout: " + basketballCoach2.getDailyWorkout());
    System.out.println("Daily fortune: " + basketballCoach2.getDailyFortune());
    System.out.println("####################### End BasketballCoach #######################\n");

    // close the context
    context.close();

  }

}
