package com.chadcover.springdemo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VolleyballCoach implements Coach {

  private FortuneService fortuneService;

  // an example of using constructor injection for autowiring
  /* the syntax for @Qualifier with Constructor injection is a bit different;
     it becomes part of the signature, not an annotation above the Constructor,
     as with setter & field injection.
   */
  @Autowired
  public VolleyballCoach(@Qualifier("sadFortuneService") FortuneService fortuneService) {
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
