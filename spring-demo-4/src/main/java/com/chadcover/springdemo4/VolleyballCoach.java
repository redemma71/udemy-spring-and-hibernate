package com.chadcover.springdemo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class VolleyballCoach implements Coach {

  private FortuneService fortuneService;

  // an example of using constructor injection for autowiring
  public VolleyballCoach(FortuneService fortuneService) {
    System.out.println("####################### Inside VolleyballCoach #######################");
    this.fortuneService = fortuneService;
  }
  @Override
  public String getDailyWorkout() {
    return "Practice your spikes.";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
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
