public class Rectangle extends Shape {
  /**
   * private instance variable
   * stores the length and width of the rectangle
   */
  private double length;
  private double width;

  /**
   * @param length double parameter, length
   * @param width  double parameter, width
   */
  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  @Override
  public double area() {
    return length * width;
  }

  @Override
  public double perimeter() {
    return (2 * length) + (2 * width);
  }

}
