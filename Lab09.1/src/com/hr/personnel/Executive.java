package com.hr.personnel;

import java.time.LocalDate;

public class Executive extends SalariedEmployee {

  public static final double STANDARD_DEDUCTION = 100_000;

  public Executive(String name, LocalDate hireDate, double salary) {
    super(name, hireDate, salary);
  }

  @Override
  public void work() {
    System.out.println(getName() + " enjoying a nice round of golf");
  }

  @Override
  public double getStandardDeduction() {
    return STANDARD_DEDUCTION;
  };

  // OPT-IN to override fileReturn() to do it differently
  @Override  // interface TaxPayer
  public void fileReturn() {
    System.out.println("Return filed electronically");
  }


}
