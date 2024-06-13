package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class AgeErrorException3 extends Exception {
  public AgeErrorException3() {
    super("나이 입력이 잘못되었어요.");
    }
}
  public class Ex06DeveloperDefineT {
	  
   public static void main(String[] args) {

      System.out.print("나이를 입력하세요: ");
      try {
        int age = readAge();
        System.out.println("당신의 나이는: " + age + "입니다.");
      }
      catch (AgeErrorException3 e) {
        System.out.println("예외발생: " + e.getMessage());
      }
   }
   
   public static int readAge() throws AgeErrorException3 {
     Scanner sc = new Scanner(System.in);
     int inputAge = 0;
      try {
        inputAge = sc.nextInt();
      }
      catch (InputMismatchException e) {
        e.printStackTrace();
        System.exit(0);
      }
 
      /*
      개발자가 직접 예외상황을 if문으로 확인한 후 예외 인스턴스를 만들어
      프로그램으로 throw한다. 그 즉시 에러가 발생하므로 '예외던지기'를
      하지않고 여기서 직접 try~catch문으로 '예외처리'한다.
       */
      try {
      if(inputAge < 0) {
        AgeErrorException3 ex = new AgeErrorException3();
        throw ex;
      }
      }
      catch (AgeErrorException3 e) {
      System.out.println(e.getMessage());
      //예외처리 후 프로그램을 즉시 종료한다
      System.exit(0);
   }
   return inputAge;
  }
  }
