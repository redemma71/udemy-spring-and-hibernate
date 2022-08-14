package com.chadcover.springdemo2;

public class TennisCoach implements Coach {

  private FortuneService fortuneService;
  private String teamName;
  private String email;

  public TennisCoach() { }

  public TennisCoach(FortuneService fortuneService) {
    System.out.println("Inside TennisCoach class.");
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Hit 250 balls with your backhand.";
  }

  @Override
  public String getDailyFortune() {
    return this.fortuneService.getFortune();
  }

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
