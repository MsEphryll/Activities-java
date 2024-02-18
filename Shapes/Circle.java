class Circle extends Shape {
  /**
   * private instance variable
   * stores the radius of the circle
   */
  private double radius;

  /**
   * @param radius double parameter, radius
   */
  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.PI * radius * radius;
  }

  @Override
  public double perimeter() {
    return 2 * Math.PI * radius;
  }
}
