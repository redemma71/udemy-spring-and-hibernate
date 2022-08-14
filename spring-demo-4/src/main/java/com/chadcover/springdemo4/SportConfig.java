package com.chadcover.springdemo4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:coaches.properties")
public class SportConfig {

  @Bean
  public FortuneService happyFortuneService() {
    return new HappyFortuneService();
  }

  @Bean
  public FortuneService sadFortuneService() {
    return new SadFortuneService();
  }
  
  @Bean
  public Coach footballCoach() {
    return new FootballCoach(sadFortuneService());
  }

  @Bean
  public Coach volleyballCoach() {
    return new VolleyballCoach(happyFortuneService());
  }

  @Bean
  public Coach baseballCoach() {
    return new BaseballCoach();
  }

  @Bean
  public Coach basketballCoach() {
    return new BasketballCoach();
  }

}
