package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

  // properties/fields
  private double salary;
  private static final double STANDARD_DEDUCTION = 10_000.0;

  // constructors
  public SalariedEmployee() {
    super();
  }

  public SalariedEmployee(String name, LocalDate hireDate) {
    super(name, hireDate); // delegate to superclass ctor, which handles name, hireDate

    // registerIn401k()
  }

  public SalariedEmployee(String name, LocalDate hireDate, double salary) {
    this(name, hireDate); // delegate to neighboring ctor, which handles name, hireDate
    setSalary(salary); // handle salary myself, by delegating to setter.
  }

  // business methods
  @Override
  public void pay() {
    System.out.println(getName() + " is paid salary " + getSalary());
  }

  @Override // interface TaxPayer - abstract method - I MUST implement it myself
  public void payTaxes() {
    double taxes = getSalary() * TaxPayer.SALARIED_TAX_RATE;
    System.out.printf("%s paid taxes of %,.2f\n", getName(), taxes);
  }

  @Override // interface TaxPayer - default method - I OPT to override it
  public double getStandardDeduction() {
    return STANDARD_DEDUCTION;
  }

  public void takeVacation() {
    System.out.println(getName() + " is on vacation");
  }

  // accessor methods
  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  // toString
  @Override
  public String toString() {
    return super.toString() + String.format(", salary=%,.2f", getSalary());
  }
}
