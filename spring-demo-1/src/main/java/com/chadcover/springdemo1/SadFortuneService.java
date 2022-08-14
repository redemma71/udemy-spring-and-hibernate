package com.chadcover.springdemo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SadFortuneService implements FortuneService {

  public String getFortune() {

    List<String> fortunes = new ArrayList<String>();
    fortunes.add("Today is a horrible, terrible, no-good, very bad day!");
    fortunes.add("Just wait; it gets worse!");
    fortunes.add("Wait until you're my age!");
    fortunes.add("Turn that smile upside down, dumpling!");
    int myFortune = new Random().nextInt(fortunes.size());
    return fortunes.get(myFortune);

  }

}
