package bankingt;

public class Account {
	// 계좌번호(String) 이름(String) 잔액(int)
	public String accNumber;
	public String name;
	public int balance;
	
	
	public Account() {}
	//생성자         오른쪽버튼 >소스> using field
	public Account(String accNumber, String name, int balance) {
		this.accNumber = accNumber;
		this.name = name;
		this.balance = balance;
	}
	
	//정보출력용 메서드
	public void showAccount() {
		System.out.println("계좌번호:" + this.accNumber);
		System.out.println("고객이름:" + this.name);
		System.out.println("잔고:" + this.balance);
	}
	
}
