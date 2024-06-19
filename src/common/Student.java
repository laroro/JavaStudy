package common;

public class Student extends Person {
  private String stNumber;

  public Student(String name, int age, String stNumber) {
    super(name, age);
    this.stNumber = stNumber;
  }

  @Override
  public String toString() {
    return super.toString() + ", 학번:" + stNumber;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Student) {
      Student compareStudent = (Student) obj;
      System.out.println("오버라이딩 한 equals() 호출됨:" + this.getName());
      if (this.getName().equals(compareStudent.getName())) {
        return true;
      }
    }
    return false;
  }
}
