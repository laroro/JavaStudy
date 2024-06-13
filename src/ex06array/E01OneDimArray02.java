package ex06array;

import java.util.Random;

public class E01OneDimArray02 {

    public static void main(String[] args) {

        // 난수생성방법1
        // : Math클래스의 random() 메서드는 0~1사이의 실수를 랜덤하게 반환한다.
        // 정수형태의 난수가 필요하다면 10이나 100과 같은 정수를 곱한 후 필요한 데이터를 만든다
        double rndNumber = Math.random();
        System.out.println("생성된 난수[실수]: " + rndNumber);
        // 정수와 실수를 연산하면 실수가 반환되므로 int로 강제형변환한다.
        int intNumber = (int) (Math.random() * 100);
        System.out.println("생성된 난수[정수]: " + intNumber);

        // 난수생성방법2
        // : Random클래스를 이용한다. 사용법은 Scanner와 동일하다.
        // 정수형 난수를 생성할 때는 nextInt() 메서드를 사용한다.

        Random random = new Random();
        System.out.println("생성된 난수: " + random.nextInt());
        System.out.println("=====================================");

        // 로또번호처럼 1~45사이의 난수 생성하는 방법
        // 1. 0.xxxx형태의 난수를 정수로 변경하기 위해 100을 곱한다.
        // 2. 45로 나눈 나머지를 구한다. 이때 결과는 0~44가 된다.
        // 3. 0은 구간에 포함되지 않으므로 결과에 1을 더한다.
        // 4.정수의 결과가 필요하므로 int로 강제형 변환한다.

        System.out.println("1~45사이의 난수 생성: " + ((int) ((Math.random() * 100) % 45) + 1));
        System.out.println("=====================================");

        // 크기가 6인 배열을 생성해서 난수로 저장한 후 출력한다.
        // 중복된 난수가 생성될 수 있고 정렬 또한 되지 않는다. (이 부분은 컬렉션에서 다룬다.)

        System.out.println("크기가 6인 배열에 난수 입력");
        // 크기가 6인 배열 선언
        int[] lottoNum = new int[6];
        // 난수 생성 후 배열에 순서대로 입력
        for (int i = 0; i < lottoNum.length; i++) {
            lottoNum[i] = (int) ((Math.random() * 100) % 45) + 1;
        }
        // 순서대로 출력
        for (int i = 0; i < lottoNum.length; i++) {
            System.out.printf("%d ", lottoNum[i]);
        }
    }

}
