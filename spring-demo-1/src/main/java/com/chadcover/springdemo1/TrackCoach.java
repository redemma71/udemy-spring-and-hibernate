package com.chadcover.springdemo1;

public class TrackCoach implements Coach {

  private FortuneService fortuneService;
  private String emailAddress;
  private String team;

  public TrackCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "hit 250 balls with your backhand";
  }

  @Override
  public String getFortune() {
    return fortuneService.getFortune();
  }

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
