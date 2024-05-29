package com.magic.client;

import com.magic.Core;
import com.magic.Wand;

import java.util.Arrays;

class WandClientArgs {

  public static void main(String[] args) {
    // check for required arguments (3)
    if (args.length < 3) {
      String usage = "\nUsage: java WandClientArgs <core> <wood> <length>";
      String example = "Example: java WandClientArgs unicorn_hair holly 12.5";
      String note =
          "\nNotes:\n1. available cores are "
              + Arrays.toString(Core.values())
              + "\n2. cores must be entered using underscores as demonstrated in the example above";
      System.out.println(usage);
      System.out.println(example);
      System.out.println(note);
      return; // early return from main(), application exits
    }

    // you may now proceed, because you have the required arguments
    // let's show we got them
    System.out.printf("\nYou provided %s arguments\n", args.length);

    // STEP 1: Convert from string into proper types
    Core core = Core.valueOf(args[0].toUpperCase());
    String wood = args[1];
    Double length = Double.parseDouble(args[2]);

    // STEP 2: Create a Wand object from the values (using ctor 3)
    Wand wand = new Wand(core, wood, length);

    // STEP 3: Congratulate them on their order, print the resulting wand
    System.out.printf("\nCongratulations! Ollivander will get started on your order.\n%s", wand);
  }
}
