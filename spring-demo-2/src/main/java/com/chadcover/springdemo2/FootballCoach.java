package com.chadcover.springdemo2;

public class FootballCoach implements Coach {

  private FortuneService fortuneService;
  private String email;
  private String teamName;

  public FootballCoach() { }

  public FootballCoach(FortuneService fortuneService) {
    System.out.println("Inside FootballCoach class.");
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Spend an hour in the weight room.";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }

  @Override
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }
}
