package edu.geometry;

public class Rectangle extends Shape {

  // static fields/methods

  // properties
  private double length;
  private double width;

  // constructors
  public Rectangle(double length, double width) {
    setLength(length);
    setWidth(width);
  }

  public Rectangle(double length, double width, String unitOfMeasurement) {
    this(length, width);
    setUnitOfMeasurement(unitOfMeasurement);
  }

  // business methods

  @Override
  public double getArea() {
    double area = getLength() * getWidth();
    return area;
  }

  // accessor methods

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  // toString() - takes superclass toString()
}
