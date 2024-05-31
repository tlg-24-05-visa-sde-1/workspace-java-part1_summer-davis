package edu.geometry;

public abstract class Shape {

  // static fields/methods

  // properties
  private String unitOfMeasurement = "in";

  // constructors
  public Shape() {
    super(); // automatically calls Object
  }

  public Shape(String unitOfMeasurement) {
    setUnitOfMeasurement(unitOfMeasurement);
  }

  // business methods
  public abstract double getArea();

  // accessor methods
  public String getUnitOfMeasurement() {
    return unitOfMeasurement;
  }

  public void setUnitOfMeasurement(String unitOfMeasurement) {
    this.unitOfMeasurement = unitOfMeasurement;
  }

  // toString()
  public String toString() {
    return String.format(
        "%s area: %.2f %s", getClass().getSimpleName(), getArea(), getUnitOfMeasurement());
  }
}
