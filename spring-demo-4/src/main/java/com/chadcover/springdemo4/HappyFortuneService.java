package com.chadcover.springdemo4;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

  @Override
  public String getFortune() {
    return "Today is going to be a good day!";
  }
}
