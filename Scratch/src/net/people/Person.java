package net.people;

import java.time.LocalDate;
import java.time.Period;

/*
 * Immutable class. More accurately, this is a class definition written
 * in such a way that instances of it, once created, cannot have their properties changed.
 * There are simply no public methods available to do so.
 */
class Person {
  private final String name;
  private final LocalDate birthDate;

  public Person(String name, LocalDate birthDate) {
    this.name = name;
    this.birthDate = birthDate;
  }

  /*
   * This method returns the person's age in whole years.
   *
   * This is called a "derived" property, i.e., its value can be "calculated" or derived
   * from the existing fields that we have.
   */
  public int age() {
    Period lifespan = Period.between(birthDate, LocalDate.now());
    return lifespan.getYears();
  }

  public String getName() {
    return name;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public String toString() {
    return String.format("Name: %s\nBirth Date: %s", getName(), getBirthDate());
  }
}
