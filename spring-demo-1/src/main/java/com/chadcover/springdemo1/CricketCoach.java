package com.chadcover.springdemo1;

public class CricketCoach implements Coach {

  private FortuneService fortuneService;
  private String emailAddress;
  private String team;

  public CricketCoach() {
    System.out.println("Inside the CricketCoach constructor.");
  }

  @Override
  public String getDailyWorkout() {
    return "Hit the ball with the paddle 1000 times!";
  }

  @Override
  public String getFortune() {
    return fortuneService.getFortune();
  }

  // using setter injection
  public void setFortuneService(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
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
