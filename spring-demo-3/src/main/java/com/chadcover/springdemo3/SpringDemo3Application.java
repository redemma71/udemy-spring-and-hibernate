package com.chadcover.springdemo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringDemo3Application {

  public static void main(String[] args) {
    // SpringApplication.run(SpringDemo3Application.class, args);
    // System.out.println("yadda yadda yadda");

    // read the spring config file
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.properties");

    // get the bean that has been named
    // autowiring is implemented using constructor injection here
    Coach footballCoach = context.getBean("myFootballCoach", Coach.class);
    Coach footballCoach2 = context.getBean("myFootballCoach", Coach.class);

    // call a method on the bean
    System.out.println("####################### Start FootballCoach #######################");
    System.out.println("Daily workout: " + footballCoach.getDailyWorkout());
    System.out.println("Coach's email: " + footballCoach.getEmail());
    System.out.println("Coach's team: " + footballCoach.getTeam());
    System.out.println("####################### End   FootballCoach #######################\n");


    System.out.println("####################### Testing @Scope(\"singleton\") #######################");
    boolean footballCoachesAreTheSame = (footballCoach == footballCoach2);
    System.out.println("FootballCoaches are the same: " + footballCoachesAreTheSame + "\n");

    // get a bean with its default component name
    // autowiring is implemenged via constructor injection here
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
    System.out.println("####################### End   BaseballCoach #######################\n");

    // get a bean using field injection for autowiring
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

    System.out.println("####################### Testing @Scope(\"prototype\") #######################");
    boolean basketballCoachesAreTheSame = (basketballCoach == basketballCoach2);
    System.out.println("BasketballCoaches are the same: " + basketballCoachesAreTheSame + "\n");

    // close the context
    context.close();

  }

}
