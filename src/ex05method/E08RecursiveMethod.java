package ex05method;

// 재귀메서드(Recursive Method)
// : 하나의 함수에서 자신을 다시 호출하여 작업을 수행하는 방식으로 문제해결하는 방법이다.
// 마치 반복문과 같은 형태로 동작한다. 순환호출이라고도 한다.

public class E08RecursiveMethod {

    static int factorial(int number) {
        int result;
        if (number == 1) {
            // 매개변수의 값이 1인 경우 1을 반환한다. 더이상 재귀호출을 하지 않는다.
            return 1;
        } else {
            // 1이 아닌 경우에는 자신의 메서드를 재귀호출함.
            result = number * factorial(number - 1);
        }
        System.out.println("계산과정: number=" + number + ", result=" + result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("재귀함수를 이용한 팩토리얼 구하기");
        System.out.println("4factorial: " + factorial(4));
        System.out.println("10factorial: " + factorial(10));
    }

}
