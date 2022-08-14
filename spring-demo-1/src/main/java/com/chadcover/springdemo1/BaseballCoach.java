package com.chadcover.springdemo1;

public class BaseballCoach implements Coach {

  private FortuneService fortuneService;
  private String emailAddress;
  private String team;

  public BaseballCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "spend an hour on batting practice";
  }

  @Override
  public String getFortune() {
    return fortuneService.getFortune();
  }

  @Override
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  @Override
  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }
}
