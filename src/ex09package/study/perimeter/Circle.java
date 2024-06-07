package ex09package.study.perimeter;

//원의 둘레 계산을 위한 클래스
public class Circle {
  //멤버 변수
	double red;
	final double PI;

  //생성자 : 멤버상수를 초기화 하고있음
  public Circle(double red) {
    this.red = red;
    PI = 3.14159;
  }

  //멤버메서드 : 원의 넓이를 계산
  public double getPerimeter() {
    return 2 * PI * red;
  }
}
