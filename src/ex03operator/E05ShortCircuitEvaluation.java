package ex03operator;

public class E05ShortCircuitEvaluation {

	public static void main(String[] args) {

		// SCE(Short Circuit Evaluation)
		// 하나의 조건검사만으로 결과를 알 수 있는 경우 Java 컴파일러는 뒤의 조건을 수행하지 않고 건너뛴다.
		// 이 경우 변수의 값이 변경되는 코드가 있다면 실행되지 않으므로 주의해야 한다.

		int num1 = 0, num2 = 0;
		boolean result;

		// 논리And의 경우 둘중 하나만 fasle이면 false를 반환한다.
		// 첫번째 조건이 false이므로 두번째 조건은 수행하지 않는다.
		result = (num1 += 10) < 0 && (num2 += 10) > 0;
		System.out.println("result = " + result);
		// num2는 초기값인 0이 그대로 유지된다.
		System.out.println("num1 = " + num1 + ", num2 = " + num2);

		// 논리Or의 경우 둘중 하나만 true이면 true를 반환하므로
		// 첫번째 조건이 true이므로 두번째 조건은 수행하지 않는다.
		result = (num1 += 10) > 0 || (num2 += 10) > 0;
		System.out.println("result = " + result);
		// num2는 여기서도 증가하지 않는다. 따라서 num2가 프로그램의 실행결과에
		// 영향을 미칠 수 있다면 주의해야 한다.
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
	}

}
