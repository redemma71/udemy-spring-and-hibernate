package com.chadcover.springdemo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HappyFortuneService implements FortuneService {

  public String getFortune() {
    List<String> fortunes = new ArrayList<String>();
    fortunes.add("Today is your lucky day!");
    fortunes.add("All is well with the world!");
    fortunes.add("Always look on the bright side of life!");
    fortunes.add("It's always darkest before the dawn!");
    int myFortune = new Random().nextInt(fortunes.size());
    return fortunes.get(myFortune);
  }

}
