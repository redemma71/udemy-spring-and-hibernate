package com.chadcover.springdemo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

  private FortuneService fortuneService;

  // an example of using setter injection for autowiring
  public BaseballCoach() {
    System.out.println("####################### Inside BaseballCoach #######################");
  }

  // @Autowired
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
    return null;
  }

  @Override
  public String getTeam() {
    return null;
  }
}
