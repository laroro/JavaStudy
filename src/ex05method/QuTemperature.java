package ex05method;

import java.util.Scanner;

public class QuTemperature {

    public static void main(String[] args) {

        /*
         * 문제3) 섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와 화씨를 입력받아서 섭씨로 변환하여 리턴하는
         * 함수를 만들어라. 공식은 아래와 같습니다
         * 메소드명 : celsiusToFahrenheit() , fahrenheitToCelsius()
         * 공식]
         * 화씨 = 1.8 * 섭씨 + 32
         * 섭씨 = (화씨 - 32) / 1.8
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("섭씨를 입력하세요 : ");
        double celsius = scanner.nextDouble();
        System.out.println("섭씨 " + celsius + "도 -> 화씨 : " + celsiusToFahrenheit(celsius));

        System.out.print("화씨를 입력하세요 : ");
        double fahrenheit = scanner.nextDouble();
        System.out.println("화씨 " + fahrenheit + "도 -> 섭씨 : " + fahrenheitToCelsius(fahrenheit));

    }

    static double celsiusToFahrenheit(double celsius) {
        return 1.8 * celsius + 32;
    }

    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }
}
