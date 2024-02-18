public class Shape {

  public double area() {
    return 0;
  }

  public double perimeter() {
    return 0;
  }

  @Override
  public String toString() {
    return String.format("Shape: %s\nPerimeter: %.2f\nArea: %.2f\n", this.getClass().getName(), this.perimeter(),
        this.area());
  }

}