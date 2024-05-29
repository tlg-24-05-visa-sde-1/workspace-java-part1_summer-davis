/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import java.time.LocalDate;

/** Application main-class. */
class HRClient {

  public static void main(String[] args) {
    // create Department object
    Department dept = new Department("Sales", "Seattle");
    System.out.println(dept); // toString() auto called

    // add Employees to it
    dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 2500.0));
    dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 75.0, 20.0));
    dept.addEmployee(new SalariedEmployee("Christian", LocalDate.of(1994, 12, 26), 100_000));
    dept.addEmployee(new HourlyEmployee("Elise", LocalDate.of(1998, 1, 20), 25.50, 30));

    // list its Employees
    System.out.println("\nList employees:");
    dept.listEmployees();

    // make its Employees work
    System.out.println("\nMake employees work:");
    dept.workEmployees();

    // pay its Employees
    System.out.println("\nPay employees:");
    dept.payEmployees();

    // send SalariedEmployees on vacation
    System.out.println("\nSend SalariedEmployees on vacation:");
    dept.holidayBreak();
  }
}
