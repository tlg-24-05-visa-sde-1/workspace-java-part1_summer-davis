/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import java.time.LocalDate;

/**
 * The Employee class is fairly simple, serving as a superclass to illustrate inheritance.
 *
 * <p>Properties: String name LocalDate hireDate
 *
 * <p>Methods (excluding get/set methods): void work() simulates work by printing a message to show
 * it was called. String toString() self-explanatory.
 */
public abstract class Employee {
  // fields
  private String name;
  private LocalDate hireDate;

  // constructors
  public Employee() {
    super();
  }

  public Employee(String name, LocalDate hireDate) {
    setName(name);
    setHireDate(hireDate);
  }

  // business methods

  // "all employees work" -> they have this behavior in common, so work() must go here
  // AND they all do it the same way, they work "hard", so we code it here, too.
  public void work() {
    System.out.println(getName() + " working hard since " + getHireDate());
  }

  // We need a way to say "all employees get paid", i.e., we NEED a pay() method here.
  // BUT we can't implement here, all we have is name and hireDate
  // SO we say THAT "all employees get paid", but we don't say HOW.
  public abstract void pay();

  // accessor methods
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getHireDate() {
    return hireDate;
  }

  public void setHireDate(LocalDate hireDate) {
    this.hireDate = hireDate;
  }

  @Override
  public String toString() {
    return String.format(
        "%s: name=%s, hireDate=%s", getClass().getSimpleName(), getName(), getHireDate());
  }
}
