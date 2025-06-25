package chapter03;

import java.util.Scanner;

public class ReferenceDataType {

	public static void main(String[] args) {
		//참조 데이터 타입 정의 - 배열 , 클래스 , 인터페이스 등
		String name = new String("홍길동"); // name은 stack에 저장되고, 등호 우측은 heap에 들어감
		Scanner scan = new Scanner(System.in);
		
		//!!!! 중요 - String 클래스는 기본형으로도 사용이 가능함.
		String name2="홍길동";
		
		System.out.println(name);
		System.out.println(name2);
		System.out.println(name == name2); //false임. 앞에꺼는 주소값 뒤는 Stack에 들어간 "홍길동"이라 그럼.
		System.out.println(scan);
	}

}
