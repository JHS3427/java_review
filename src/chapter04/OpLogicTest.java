package chapter04;
/*
 * 논리 연산자 : &&(AND), ||(OR), !(NOT)
 * &&,|| 연산자는 앞의 식의 결과에 따라 Shortcut으로 진행됨.
 */
public class OpLogicTest {

	public static void main(String[] args) {
		int a =10;
		int b = 5;
		
		//&&(AND) 연산 - 두 개의 결과가 모두 true인 경우에만 실행 결과가 true이다.
		//&& 연산자의 경우 앞이 false인 경우 shortcut이 가능하다. 어차피 false니까.
		System.out.println((a>b)&&(a==10)); //true.
		System.out.println((a>b)&&(b==10)); //false.
		System.out.println((a<b)&&(a==10)); //false.
		System.out.println((a<b)&&(b==10)); //false.
		
		//||(OR) 연산 - 두 개의 항의 결과 중 하나라도 true인 경우 실행 결과가 true다.
		//|| 연산자의 경우 앞이 true인 경우 shortcut이 가능하다. 어차피 true.0니까.
		System.out.println((a>b)||(a==10)); //true.
		System.out.println((a>b)||(b==10)); //true.
		System.out.println((a<b)||(a==10)); //true.
		System.out.println((a<b)||(b==10)); //false.
		
		//!(NOT) 연산 - 결과를 반대의 boolean 값으로 변경한다.
		System.out.println(!(!(a>b)||!(a==10))); //true.
		//System.out.println(!a); a는 int 형식이므로 NOT연산자가 적용되지 않는다.
		
	}

}
