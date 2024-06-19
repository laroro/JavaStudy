package bankingt;

import java.util.Scanner;

public class BankingSystemMain {
	
	//Account 인스턴스를 저장할 수 있는 배열만듬
	public static Account accArr[] = new Account[50];
	
	//인덱스로 사용할 변수생성
	public static int accCnt = 0;
	
	public static void showMenu() {
		    System.out.println("######## 메뉴를 입력하세요 ########");
		    System.out.println("1.계좌개설>");
		    System.out.println("2.입금>");
		    System.out.println("3.출금>");
		    System.out.println("4.전체계좌정보출력>");
		    System.out.println("5.종료>");
		    System.out.println("메뉴선택>>>");
	}
	 
	 // 계좌개설을 위한 함수
	 public static void makeAccount() {
		 System.out.println("==makeAccount()호출됨==");
		 Scanner scanner = new Scanner(System.in);
		 
		 //정보 입력 받기
		 System.out.print("계좌번호:"); 
		 String accNum = scanner.nextLine();
		 
		 System.out.print("고객이름:");
		 String name = scanner.nextLine();
		 
		 System.out.print("잔고:");
		 int balance = scanner.nextInt();
		 
		 //입력받은 정보를 통해 인스턴스 생성
		 Account account = new Account(accNum, name, balance);
		 
		 //만든걸 인스턴스 배열에 추가
		 accArr[accCnt++] = account;
		 
		 
	 }
	 
	 
	// 입    금
	 public static void depositMoney() { 
		 System.out.println("==depositMoney()호출됨==");
	 }    
	 
	 // 출    금
	 public static void withdrawMoney() {
		 System.out.println("==withdrawMoney()호출됨==");
	 }
	 
	 //전체계좌정보출력
	 public static void showAccInfo() {
		 System.out.println("==showAccInfo()호출됨==");
		 for(int i=0 ; i<accCnt ; i++) {
			 accArr[i].showAccount();
		 }
	 }
	 
	 
	 
	 public static void main(String[] args) {
		 
		 //메인부분은 실행을위해 스캐너가 있어야함
		 Scanner scanner = new Scanner(System.in);
		 
		 
		 //반복실행 와일문으로
		 while(true) {	 
			 
			 //메뉴를 보여줌
			 showMenu();
			 
			 //아래 스위치문을 숫자로 입력받음
			 int choice = scanner.nextInt();
			 
			 switch(choice) {
			 
			 //ICustomDefine에 만들어놓은걸 자동완성으로 갖다씀  
			 case ICustomDefine.MAKE:
				 System.out.println("계좌개설 ");
				 makeAccount();
				 break; // 브레이크써줘야 실행후 처음으로 안돌아감
			 case ICustomDefine.DEPOSIT:
				 System.out.println("입금");
				 depositMoney();
				 break;
			 case ICustomDefine.WITHDRAW:
				 System.out.println("출금");
				 withdrawMoney();
				 break;
			 case ICustomDefine.INQUIRE:
				 System.out.println("전체계좌정보");
				 showAccInfo(); 
				 break;
			 case ICustomDefine.EXIT:
				 System.out.println("종료");
				 return;
				
			 }
		}
	}
}
