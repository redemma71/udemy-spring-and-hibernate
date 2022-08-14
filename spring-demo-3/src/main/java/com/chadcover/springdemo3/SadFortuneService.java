package com.chadcover.springdemo3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {
  List<String> sadFortunes = new ArrayList<String>(
      Arrays.asList("Today will be a horrible, terrible, no good, very bad day!",
          "Buckle up! It's going to be a bumpy ride today.",
          "What's the point of even trying?")
  );

  @Override
  public String getFortune() {
    Random rand = new Random();
    sadFortunes.add("Maybe things will get better today; probably not!");
    return sadFortunes.get(rand.nextInt(sadFortunes.size()));
  }
}
