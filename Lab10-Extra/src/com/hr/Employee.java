package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;
import com.hr.WorkException;

public class Employee {
  // INSTANCE VARIABLES
  private final String name;

  // CONSTRUCTORS
  public Employee(String name) {
    this.name = name;
  }

  // BUSINESS METHODS

  /*
   * OPTION 4: try-catch and throw a different exception at the client.
   * NOTE: we will "wrap" the DestinationUnreachableException into a
   * new WorkException.
   */
  public void goToWork() throws WorkException {

    Car car = new Car("ABC123", "Toyota", "RAV4");

    try {
      car.start();
      car.moveTo("West Seattle");
    } catch (DestinationUnreachableException e) {
      // insert this exception into a new WorkException and throw that
      throw new WorkException("Unable to get to work", e); // e is the 'cause'
    } finally {
      car.stop();
    }
  }

  /*
   * OPTION 3: try-catch, "react in some way", and then re-throw it back at the client.
   */
  /*  public void goToWork() throws DestinationUnreachableException {

    Car car = new Car("ABC123", "Toyota", "RAV4");

    try {
      car.start();
      car.moveTo("West Seattle");
    } catch (DestinationUnreachableException e) {
      System.out.println("Emailing Lisa Herbold to complain");
      throw e;
    } finally {
      car.stop();
    }
  }*/

  /*
   * OPTION 2: "punt" i.e., DON'T catch the exception at all, just "ignore" it.
   * NOTE: we use a try-finally, to guarantee that car.stop() is always called, BUT
   * we're still punting because there's no catch.
   */
  /*  public void goToWork() throws DestinationUnreachableException {

    Car car = new Car("ABC123", "Toyota", "RAV4");

    try {
      car.start();
      car.moveTo("West Seattle");
    } finally {
      car.stop();
    }
  }*/

  /*
   * OPTION 1: try-catch and "handle" it in some way, so the exception stops here.
   * NOTE that we put the call to car.stop() in a finally block to guarantee that it's called.
   */
  /*  public void goToWork() {

    Car car = new Car("ABC123", "Toyota", "RAV4");

    try {
      car.start();
      car.moveTo("West Seattle");
    } catch (DestinationUnreachableException e) {
      System.out.println(e.getMessage()); // just the reason string
    } finally {
      car.stop();
    }
  }*/

  // ACCESSOR METHODS
  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + ": name=" + getName();
  }
}
