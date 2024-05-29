package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

/*
 * Main-class to create a few instances of Television and give them a test drive.
 */
class TelevisionClient {

  public static void main(String[] args) {
    System.out.println(Television.getInstanceCount() + " instances have been created");
    System.out.println();

    // create a Television object and set its properties
    Television tv1 = new Television();
    tv1.setBrand("Samsung");
    tv1.setVolume(Television.MIN_VOLUME);
    tv1.setDisplay(DisplayType.LCD);

    // create a second instance of Television using the brand-volume ctor
    Television tv2 = new Television("Sony", Television.MAX_VOLUME, DisplayType.PLASMA);

    // create a third instance using the brand-only ctor
    Television tv3 = new Television("LG");

    // call business methods on them
    tv1.turnOn();
    tv2.turnOn();
    tv3.turnOn();
    System.out.println();

    tv1.turnOff();
    tv2.turnOff();
    tv3.turnOff();
    System.out.println();

    System.out.println(tv1);
    System.out.println();
    System.out.println(tv2);
    System.out.println();
    System.out.println(tv3);

    System.out.println();
    System.out.println(Television.getInstanceCount() + " instances have been created");
  }
}
