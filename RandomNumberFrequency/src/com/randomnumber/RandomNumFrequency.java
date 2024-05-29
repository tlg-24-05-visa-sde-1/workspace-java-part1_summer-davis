package com.randomnumber;

public class RandomNumFrequency {

  public static int randomInt(int min, int max) {
    int result = 0;

    double rand = Math.random();
    double scaled = (rand * (max - min + 1)) + min;
    result = (int) scaled;

    return result;
  }
}
