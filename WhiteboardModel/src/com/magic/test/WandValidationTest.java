package com.magic.test;

// BVT for Wand flexibility
// 0, 1   and   13, 14

import com.magic.Wand;

class WandValidationTest {

  public static void main(String[] args) {
    Wand wand = new Wand();

    // FLEXIBILITY TESTING

    // valid, 1
    System.out.println("\nSHOULD BE 1");
    wand.setFlexibility(1);
    System.out.println("flexibility: " + wand.getFlexibility());

    // valid, 13
    System.out.println("\nSHOULD BE 13");
    wand.setFlexibility(13);
    System.out.println("flexibility: " + wand.getFlexibility());

    // invalid, 0
    System.out.println("\nSHOULD BE INVALID / REMAIN 13");
    wand.setFlexibility(0);
    System.out.println("\nflexibility: " + wand.getFlexibility());

    // invalid, 14
    System.out.println("\nSHOULD BE INVALID / REMAIN 13");
    wand.setFlexibility(14);
    System.out.println("\nflexibility: " + wand.getFlexibility());
  }
}
