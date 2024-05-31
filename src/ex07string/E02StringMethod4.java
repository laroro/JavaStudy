package ex07string;
import java.util.Scanner;

public class E02StringMethod4 {
	/*
	시나리오1] 주민등록번호를 이용하여 성별을 판단하는
	프로그램을 charAt()을 이용해서 작성하시오.
	190419-3000000 => 남자
	190419-4000000 => 여자
	*/
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("주민등록번호를 입력하세요:");
      String idNumber = scanner.nextLine();

      printGender(idNumber);
  }

  public static void printGender(String idNumber) {
      char genderCode = idNumber.charAt(7);

      if (genderCode == '3') {
          System.out.println("남자");
      } else if (genderCode == '4') {
          System.out.println("여자");
      } else {
          System.out.println("유효하지 않은 주민등록번호입니다.");
      }
  }
}