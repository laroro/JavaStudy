package ex15usefulclass;

import java.lang.*;
/*
Java의 규칙: java.lang 패키지 하위의 모든 클래스는 자동으로 import된다.
또한 정의하는 모든 클래스는 Object를 상속받게 되어있다.
따라서 java.lang 패키지의 모든 클래스는 별도의 선언없이 사용할 수 있고
object에서 제공하는 메서드는 오버라이딩이 ㄱ능하다. 
 */

//  extends 역시 생략가능
public class E03MathClass {

    public static void main(String[] args) {
        /*
         * Math 클래스
         * - 수학과 관련된 일련의 작업들을 처리하는 메서드가 정의되어있다.
         * - 메서드는 static으로 선언되어 았어 인스터스 생성 없이 호출할 수 있다..
         */
        System.out.println("원주율: " + Math.PI);

        // 정수형 실수값 판단
        float f = -3.14f;
        double d = -100.9;
        int num = 10;

        /*
         * 절대값: 양수로 변환하는 작업을 수행한다. 따라서 음수인 경우 양수로 변환된다.
         */
        System.out.println("### 절대값 ###");
        System.out.println("Math.abs: " + Math.abs(f));
        System.out.println("Math.abs: " + Math.abs(d));
        System.out.println("Math.abs: " + Math.abs(num));

        System.out.println("### 올림 ###");
        System.out.println("Math.ceil: " + Math.ceil(3.4));
        System.out.println("Math.ceil: " + Math.ceil(-3.4));
        System.out.println("Math.ceil: " + Math.ceil(3.9));

        System.out.println("### 내림 ###");
        System.out.println("Math.floor: " + Math.floor(3.4));
        System.out.println("Math.floor: " + Math.floor(-3.4));
        System.out.println("Math.floor: " + Math.floor(3.9));
        /*
         * round의 경우 가장 가까운 정수쪽으로 올림/버림을 결정한다.
         * x.5 이상이면 올림처리, 미만이면 버림처리한다.
         * 따라서 3.4xxxx라면 버림처리를 한다.
         */
        System.out.println("### 반올림 ###");
        System.out.println("Math.round: " + Math.round(3.49999));
        System.out.println("Math.round: " + Math.round(3.54444));
        System.out.println("Math.round: " + Math.round(-1.4));
        System.out.println("Math.round: " + Math.round(-1.5));
        System.out.println("Math.round: " + Math.round(-3.51));

        /*
         * 0~1사이의 실수값을 랜덤하게 변환한다. 따라서 정수값을 만들고 싶다면
         * 특정한 값을 곱한 후 소수저을 처리하면 된다.
         */
        System.out.println("### 최대/최소 ###");
        System.out.println("Math.max: " + Math.max(100, 99));
        System.out.println("Math.min: " + Math.min(100, 99));

        /*
         * 난수생성: Math.random()은 0~1사이의 실수값을 반환한다.
         */
        System.out.println("### 난수 ###");
        System.out.println((int) (Math.random() * 45) + 1);

        /*
         * 거듭제곱: Math.pow(a, b)는 a의 b승을 계산한다.
         */
        System.out.println("### 거듭제곱 ###");
        System.out.println("2의 10승: " + Math.pow(2, 10));
    }

}
