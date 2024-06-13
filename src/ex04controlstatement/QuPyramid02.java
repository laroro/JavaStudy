package ex04controlstatement;

public class QuPyramid02 {

    public static void main(String[] args) {

        // 다음과 같은 모양을 출력하는 프로그램을 do~while문으로 작성하시오.
        // 실행결과]
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *

        int i = 5;
        do {
            int j = 1;
            do {
                System.out.print("* ");
                j++;
            } while (j <= i);
            System.out.println();
            i--;
        } while (i >= 1);

    }

}
