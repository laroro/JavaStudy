package ex04controlstatement;

public class QuPyramid03 {

    public static void main(String[] args) {

        /*
         * 다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오.
         * 실행결과]
         *         *
         *        ***
         *       *****
         *      *******
         *     *********
         */

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2 - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}