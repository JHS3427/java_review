package chapter04;
/*
 * 사칙 연산자 : 더하기ㅡ 빼기. 곱하기, 나누기, 모듈러 연산자 
 */
public class OpArithmeticTest {

	public static void main(String[] args) {
		int number1 = 5;
		int number2 = 2;
		//문자열 다음에 더하기가 오게되면 무조건 접합 연산자가 된다.
		System.out.println("number1 + number2 = "+number1 + number2); //이렇게 하면 5와 2가 문자열 취급 받아서 52가 뜬다
		System.out.println("number1 + number2 = "+(number1 + number2));// 그래서 이렇게 묶어서 먼저 계산 시키고 그걸 받아다가 출력하는데에 써야한다.
		System.out.println("number1 - number2 = "+(number1 - number2));
		System.out.println("number1 * number2 = "+(number1 * number2));
		System.out.println("number1 / number2 = "+(number1 / number2));
		System.out.println("number1 % number2 = "+(number1 % number2));

	}

}
