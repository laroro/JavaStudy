package ex03operator;

public class E04LogicOperator {

	public static void main(String[] args) {

		// 논리연산자
		// - &&(논리And) : 양쪽 모두 true일 때 true를 반환하고, 나머지는 false를 반환한다.
		// - ||(논리Or) : 둘 중 하나만 true이면 true를 반환하고, 양쪽 모두 false일 때 false를 반환한다.
		// - !(논리Not) : true는 false로, false는 true로 변경한다.
		int num1 = 10, num2 = 20;
		// flase
		boolean result1 = (num1 == 100 && num2 == 20);
		// true
		boolean result2 = (num1 <= 12 || num2 >= 30);

		System.out.println("result1의 결과:" + result1);
		System.out.println("result2의 결과:" + result2);

		if (!(num1 == num2)) {
			System.out.println("num1과 num2는 다르다.");
		} else {
			System.out.println("num1과 num2는 같다.");
		}
	}

}
