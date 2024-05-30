package ex05method;

/*
Method(메소드, 함수)
: 객체지향 프로그래밍에서 행동 혹은 동작을 의미한다.
즉 어떤 하나의 업무를 처리하기 위한 모듈(부속품)이라 정의할 수 있다.
- 메소드는 반드시 class안에 정의해야 한다.
- 메소드 안에 다른 메소드를 정의할 수 없다.(에러발생)
- 반환타입이 없는 메소드는 void를 반드시 정의한다.
- 메서드명은 변수명과 동일한 규칙을 따른다.(첫글자 소문자, 카멜표기법)

Java 에서의 Naming Rule(이름 규칙)
-클래스명 : GoodMoring
  => 대문자로 시작하는 CamelCase

-메서드 혹은 변수명 : goodmorning() ,goodMorning 
  => 소문자로 시작하는 CamelCase

-상수명 : GOOD_MORNING
  => 전체를 대문자로 표현하고, 단 연결된 단어는 언더바로 표현
-패키지명 : good.morning
  => 전체를 소문자로 표현하고, 연결된 단어가 있을 때는 .(닷)으로 표현
 */

 /*
메서드형태1] 매개변수도 없고, 반환값도 없는 메서드
  : 둘 다 없는 형태의 메서드로 주로 메뉴를 출력하거나 하는
  단순 출력 기능 정도로 사용된다.
*/
public class E02MethodType01 {

  static void menuPrint() {
    System.out.println("==메뉴를 선택하세요==");
    System.out.println("1.열기, 2.계속하기, 3.종료");
    System.out.println("====================");
  }
  static void returnError() {
    int returnValue = 10;
    System.out.println("[return문 이전]");

    /*
    이와 같이 메서드 중간에 return을 쓰게 되면 함수가 종료되므로 그 아래에
    있는 코드는 실행되지 않는 쓰레기 코드가 된다.
    따라서 return은 반드시 조건문과 같이 사용해야 한다.
    단 메서드의 마지막 라인에 기술한다면 조건문이 없어도 상관없다.
    */
    // return;

    //이와같이 return문이 중간에 있으려면 조건부로 사용해야 한다.
    if(returnValue % 2 == 0) {
      System.out.println(returnValue + "는 짝수");
      //메서드에서 return은 종료를 의미한다.
      return;
    }

    System.out.println(returnValue + "는 홀수");
    System.out.println("[return문 이후]");
  }
  public static void main(String[] args) {
    menuPrint();
    returnError();
  }
}
