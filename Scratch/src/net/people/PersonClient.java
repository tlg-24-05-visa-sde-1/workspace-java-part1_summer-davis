package net.people;

import java.time.LocalDate;

class PersonClient {

  public static void main(String[] args) {
    Person p1 = new Person("Summer", LocalDate.of(1995, 9, 15));

    // print: <name> is <age> years old.
    System.out.printf("\n%s is %s years old.\n", p1.getName(), p1.age());

    System.out.println(p1); // toString() auto called
    System.out.println();

    PersonRecord p2 = new PersonRecord("Elise", LocalDate.of(1998, 1, 20));
    System.out.printf("\n%s is %s years old.\n", p2.name(), p2.age());

    System.out.println(p2);
  }
}
