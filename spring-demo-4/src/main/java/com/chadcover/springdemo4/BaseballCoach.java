package com.chadcover.springdemo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class BaseballCoach implements Coach {

  private FortuneService fortuneService;

  @Value("${baseballCoach.email}")
  private String email;

  @Value("${baseballCoach.team}")
  private String team;

  // an example of using setter injection for autowiring
  public BaseballCoach() {
    System.out.println("####################### Inside BaseballCoach #######################");
  }

  public void setFortuneService(FortuneService fortuneService) {
    System.out.println("####################### Autowiring BaseballCoach via Setter Injection #######################");
    this.fortuneService = fortuneService;
  }

  // placing @Autowired on ANY METHOD will succeed in getting Spring to do dependency injection
  @Autowired
  @Qualifier("happyFortuneService")
  public void yaddaYaddaYaddaMethod(FortuneService fortuneService) {
    System.out.println("####################### Autowiring BaseballCoach via Random Method Injection: Method named yaddaYaddaYaddaMethod() #######################");
    this.fortuneService = fortuneService;
  }
  @Override
  public String getDailyWorkout() {
    return "Spend an hour in the batting cage.";
  }

  @Override
  public String getDailyFortune() {
    return this.fortuneService.getFortune();
  }

  @Override
  public String getEmail() {
    return this.email;
  }

  @Override
  public String getTeam() {
    return this.team;
  }
}
