public class Square extends Shape {
  /**
   * store the length of a side of square
   */
  private double side;

  /**
   * @param side double parameter, square
   */
  public Square(double side) {
    this.side = side;
  }

  @Override
  public double area() {
    return side * side;
  }

  @Override
  public double perimeter() {
    return 4 * side;
  }

}
