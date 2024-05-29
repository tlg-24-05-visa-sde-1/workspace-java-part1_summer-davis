package org.math;

import static org.math.Calculator.*;

class CalculatorClient {

  public static void main(String[] args) {

    double sum = add(1.5, 4.5);
    System.out.println("sum is: " + sum);

    System.out.println("difference is: " + subtract(1, 4));

    boolean result = isEven(9);
    System.out.println("result is: " + result);

    System.out.println();

    int winner = randomInt(5, 20); // calls the "min-max" version
    System.out.println("The winner is: " + winner);

    double average = average(3, 5, 10, 13);
    System.out.printf("The average is: %s", average);
  }
}
