package chapter04;
/*
 * 증감 연산자 : ++ , -- (앞에 두면 전위 뒤에 두면 후위
 * 
 */
public class OpIncrementTest {

	public static void main(String[] args) {
		int number= 10;
		System.out.println(++number) ; //11
		System.out.println(number++) ; //11 - 후위 연산이라 출력때는 11로 나오지만, 메모리에는 12가 들어있다.
		System.out.println(number) ; //12
		
		System.out.println(--number) ; //11
		System.out.println(number--) ; //11
		System.out.println(number) ;
	}

}
