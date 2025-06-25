package chapter03;
//import java.lang.String; - lang에 들어있는건 임포트 안해도 잘들어간다.
public class Variable {
	public static void main(String[] args) {
		// 기본 자료형 변수 정의
		int age = 10;
		double aged = 10.0;
		boolean flag = true; //true(1), false(0)
		char name = '홍';
		char name2 = '길';
		char name3 = '동';
		// 참조 자료형 변수 정의
		String sname = "홍길동"; //참조형이지만 기본형처럼 값을 넣을 수 있다. - 이렇게 쓰면 Stack에 저장
		String sname2 = new String("홍길동"); //참조형은 이런 형식으로 값을 부여해야함. - 이렇게 쓰면 heap에 저장.
		// **String 클래스는 기본형과 참조형으로 모두 사용 가능.
		System.out.println(age);
		System.out.println(aged);
		System.out.println(flag);
		System.out.println(name);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(sname);
		System.out.println(sname2);
	}
}
