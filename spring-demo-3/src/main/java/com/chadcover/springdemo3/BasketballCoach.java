package com.chadcover.springdemo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BasketballCoach implements Coach {

  // placing @Autowired on the field
  @Autowired
  @Qualifier("sadFortuneService")
  private FortuneService fortuneService;

  public BasketballCoach() {
    System.out.println("####################### Inside BasketballCoach #######################");
  }

  @Override
  public String getDailyWorkout() {
    return "Practice your dribbling for an hour, using both hands.";
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
