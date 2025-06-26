package chapter04;

/*
 * 비교연산자 : >, >= ,< ,<= ,==, !=
 * 비교 연산자의 결과는 boolean 타입(T/F)으로 리턴되어 제어문(if, while)의 조건식에 주로 사용.
 */
public class OpComparisonTest {

	public static void main(String[] args) {
		int number1 = 5;
		int number2 = 2;
		boolean result = number1 == number2;
		
		System.out.println("number 1 > number2 : " + (number1> number2)); //true
		System.out.println("number 1 >= number2 : " + (number1>= number2)); //true
		System.out.println("number 1 < number2 : " + (number1< number2)); //false
		System.out.println("number 1 <= number2 : " + (number1<= number2)); //false
		System.out.println("number 1 == number2 : " + (number1== number2)); //false
		System.out.println("number 1 != number2 : " + (number1!= number2)); //true
		
		System.out.println("result => " + result);
	}

}
