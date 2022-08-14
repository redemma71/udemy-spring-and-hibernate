package com.chadcover.springdemo1;

public class FootballCoach implements Coach {

  private FortuneService fortuneService;
  private String emailAddress;
  private String team;

  public FootballCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "workout in the weight room for 1 hour";
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

  // add an init method
  public void doMyStartupStuff() {
    System.out.println("FootballCoach: inside doMyStartupStuff");
  }

  // add a destroy method
  public void doMyCleanupStuff() {
    System.out.println("FootballCoach: inside doMyCleanupStuff");
  }

}
