package com.magic.client;

import com.magic.Core;
import com.magic.Wand;

/*
 * Main-class to create a few instances of Wand and give them a test drive.
 */
class WandClient {

  public static void main(String[] args) {
    // Create a Wand object and use ctor 4
    Wand wand1 = new Wand("Harry Potter", Core.PHOENIX_FEATHER, "Holly", 3, 11.0);

    // Create a second Wand object and use ctor 5
    Wand wand2 = new Wand("Ronald Weasley", Core.UNICORN_HAIR, "Willow", 10, 14.0, true);

    // Create a third Wand object and use ctor 1
    Wand wand3 = new Wand();

    // Call business methods

    // Wand 1 description
    System.out.println();
    System.out.println(wand1);

    // Testing Harry Potter's wand
    wand1.swish();
    wand1.flick();
    wand1.polish();

    // Wand 2 description
    System.out.println();
    System.out.println(wand2);

    // Testing Ronald Weasley's wand
    wand2.swish();
    wand2.mend();
    wand2.swish();
    wand2.flick();
    wand2.polish();

    // Show that Ron's wand is no longer broken
    System.out.println(wand2);

    // Wand 3 description
    System.out.println();
    System.out.println(wand3);

    // Testing null wand
    wand3.swish();
    wand3.flick();
    wand3.polish();

    // Wand Details
    System.out.println();
    System.out.println(wand1);
    System.out.println(wand2);
    System.out.println(wand3);
  }
}
