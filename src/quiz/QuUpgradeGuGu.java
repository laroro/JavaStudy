package quiz;

public class QuUpgradeGuGu {

    public static void main(String[] args) {
        // 2부터 9까지의 숫자(num)에 대해 반복
        for (int num = 2; num <= 9; num++) {
            int result = num; // 각 숫자의 거듭제곱을 계산하기 위한 초기값 설정
            // 1부터 9까지의 단(dan)에 대해 반복
            for (int dan = 1; dan <= 9; dan++) {
                System.out.print(num); // 현재 숫자 출력
                // 현재 단에서 1을 제외한 횟수만큼 현재 숫자와 곱셈 기호를 출력
                for (int j = 1; j < dan; j++) {
                    System.out.print(" X " + num); // 곱셈 과정 출력
                }
                System.out.println(" = " + result); // 현재까지의 곱셈 결과 출력
                result *= num; // 다음 단계를 위해 현재 숫자를 결과에 곱함
            }
        }
    }
}