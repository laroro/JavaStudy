package ex09package.study.area;

public class Circle {
  double red;
  final double PI;

  public Circle(double red) {
    this.red = red;
    PI = 3.14159;
  }
  public double getArea() {
    return PI * red * red;
  }
}
