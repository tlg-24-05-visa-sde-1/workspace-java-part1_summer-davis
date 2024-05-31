package edu.geometry;

public class Circle extends Shape {

  // static fields/methods

  // properties
  private final double radius;

  // constructors
  public Circle(double radius) {
    this.radius = radius;
  }

  public Circle(double radius, String unitOfMeasurement) {
    this(radius);
    setUnitOfMeasurement(unitOfMeasurement);
  }

  // business methods

  @Override
  public double getArea() {
    double area = Math.PI * (getRadius() * getRadius());
    return area;
  }

  // accessor methods

  public double getRadius() {
    return radius;
  }

  // toString() - takes superclass toString()

}
