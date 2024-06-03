package edu.geometry;

public class Triangle extends Shape {

  // static fields/methods

  // properties
  private final double side1;
  private final double side2;
  private final double angle;

  // constructors
  public Triangle(double side1, double side2, double angle) {
    this.side1 = side1;
    this.side2 = side2;
    this.angle = Math.sin(Math.toRadians(angle));
  }

  // business methods

  @Override
  public double getArea() {
    double area = ((getSide1() * getSide2()) * getAngle()) / 2;
    return area;
  }

  // accessor methods

  public double getSide1() {
    return side1;
  }

  public double getSide2() {
    return side2;
  }

  public double getAngle() {
    return angle;
  }

  // toString() - takes superclass toString()
}
