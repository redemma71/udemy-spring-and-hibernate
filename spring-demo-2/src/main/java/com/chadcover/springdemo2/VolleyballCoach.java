package com.chadcover.springdemo2;

public class VolleyballCoach implements Coach {

  private FortuneService fortuneService;
  private String email;
  private String teamName;

  // use a no-args constructor for setter injection
  public VolleyballCoach() {
    System.out.println("Inside VolleyballCoach class.");
  }

  @Override
  public String getDailyWorkout() {
    return "Practice your spiking for half an hour.";
  }

  @Override
  public String getDailyFortune() {
    return this.fortuneService.getFortune();
  }

  // using setter injection
  public void setFortuneService(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  // these methods are not declared in Coach.class

  @Override
  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  @Override
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
