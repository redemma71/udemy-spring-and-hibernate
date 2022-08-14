package com.chadcover.springdemo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class FootballCoach implements Coach {

  private FortuneService fortuneService;

  @Value("${footballCoach.email}")
  private String email;

  @Value("${footballCoach.team}")
  private String team;

  public FootballCoach(FortuneService fortuneService) {
    System.out.println("####################### Inside FootballCoach #######################");
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Practice your long hikes.";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
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
