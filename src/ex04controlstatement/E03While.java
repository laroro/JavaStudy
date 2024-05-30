package ex04controlstatement;

// while문
// : 반복의 횟수가 명확하지 않은 경우 주로 사용하는 반복문으로
// 반복을 위한 초기값, 조건식, 증감식을 따로 작성하는 형태로 구성된다.
// 형식]
// 반복을 위한 변수의 초기값;
// while(조건식) {
//    실행문;
//    증감식; <= 반복문 탈출을 위한 증감식이 필요함.
// }
public class E03While {

    public static void main(String[] args) {
        // 시나리오 1~10꺼지의 합을 구하는 프로그램을 while문으로 작성하시오.

        // 반복을 위한 변수i를 생성 후 1로 초기화
        int i = 1;
        // 반복을 위한 조건 : i가 10이하일 때 반복
        while (i <= 10) {
            // 변수의 증가값을 단순히 출력
            System.out.println("변수i = " + i);
            // 반복문 탈출을 위한 증가식
            i++;
        }

        // 누적합을 계산하기 위한 변수생성
        int sum = 0;
        // 반복의 초기값은 1로 설정
        int j = 1;
        // 반복의 조건
        while (j <= 10) {
            // 복합대입연산자를 통해 증가하는 j의 값을 sum에 누적해서 더함
            sum += j; // => sum = sum + j;
            // 반복문 탈출을 위한 증가식
            j++;
        }
        System.out.println("1~10까지의 합sum= " + sum);

        // 시나리오] 1부터 100까지의 정수 중 3의 배수이거나 4의 배수인 정수의 합을 구하는 프로그램을
        // while문을 이용하여 작성하시오.
        int total = 0;
        int k = 1;
        // k가 100이하일 때 반복
        while (k <= 100) {
            // 3또는 4의 배수이므로 논리OR연산자를 사용
            if ((k % 3 == 0) || (k % 4 == 0)) {
                total += k;
                // 조건에 맞는 k를 확인하기 위한 출력
                System.out.println("k = " + k);
            }
            k++;
        }
        System.out.println("3또는 4의 배수의 합: " + total);

        // 시나리오] 구구단을 출력하는 프로그램을 while문으로 작성하시오.
        int dan = 2;
        while (dan <= 9) {
            int su = 1;
            while (su <= 9) {
                System.out.printf("%-2d*%-2d=%2d", dan, su, (dan * su));
                System.out.print(" ");
                su++;
            }
            System.out.println();
            dan++;
        }
        System.out.println("\n==================================\n");

        // 시나리오] 아래와 같은 모양을 출력하는 while문을 작성하시오.
        // 출력결과
        // 1 0 0 0
        // 0 1 0 0
        // 0 0 1 0
        // 0 0 0 1

        // 행으로 4번 반복하기 위한 변수
        int x = 1;
        while (x <= 4) {
            // 열로 4번 반복하기 위한 변수
            int y = 1;
            while (y <= 4) {
                // 행과 열의 번호가 동일할 때 1을 출력한다.
                if (x == y) {
                    System.out.print("1 ");
                } else {
                    // 번호가 다르다면 0을 출력한다.
                    System.out.print("0 ");
                }
                y++;
            }
            // 하나의 행이 출력되면 다음 행을 출력하기 위해 줄바꿈
            System.out.println();
            x++;
        }
    }
}