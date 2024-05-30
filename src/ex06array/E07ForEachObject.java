package ex06array;

public class E07ForEachObject {

  //크기가 3인 인스턴스형 배열 생성
  public static void main(String[] args) {
    String[] strArr = new String[] {
      "자바는재미있다", "자바는유용하다", "그러나어렵다"
    };

    //크기만큼 알아서 반복해서 출력
    for(String e: strArr) {
      System.out.println(e);
    }
  }   
}
