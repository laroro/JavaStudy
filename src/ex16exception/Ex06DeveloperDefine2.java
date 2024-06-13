package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class AgeErrorException2 extends Exception {
  public AgeErrorException2() {
    super("나이 입력이 잘못되었어요.");
  }
}

public class Ex06DeveloperDefine2 {
  
  public static void main(String[] args) {
    System.out.print("나이를 입력하세요: ");
    try {
      int age = readAge();
      System.out.println("당신의 나이는: " + age + "입니다.");
    } catch (AgeErrorException2 e) {
      System.out.println("예외발생: " + e.getMessage());
    }
  }
  
  public static int readAge() throws AgeErrorException2 {
    Scanner sc = new Scanner(System.in);
    int inputAge = 0;
    try {
      inputAge = sc.nextInt();
    } 
    catch (InputMismatchException e) {
      throw new AgeErrorException2();
    }
    if(inputAge < 0) {
      throw new AgeErrorException2();
    }
    return inputAge;
  }
}