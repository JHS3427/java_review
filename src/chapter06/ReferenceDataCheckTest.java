package chapter06;

import java.util.Scanner;

/*
 * 기본형 데이터와 참조형 데이터의 저장구조를 정리
 */

public class ReferenceDataCheckTest {

	public static void main(String[] args) {
		// 기본형
		int a = 10;
		int b = 10;
		String str1 = "홍길동은 자바천재";//쌍 따옴표를 써서 기본형으로 저장됨.
		String str2 = "홍길동은 자바천재";
		String str3 = "홍길순은 자바천재";		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		//call by value 형태로 값을 비교.
		System.out.println("a "+ "=="+ " b "+(a==b));  
		System.out.println("str1"+ "=="+ " str2 "+(str1==str2));
		
		//참조형
		String strobj = new String("홍길동");
		String strobj2 = new String("홍길동");
		
		//call bㅛ reference라 둘이 저장 장소가 다름.
		System.out.println(System.identityHashCode(strobj)); //해쉬코드가 똑같아 보이지만 실제 값은 다르다.
		System.out.println(System.identityHashCode(strobj2)); //해쉬코드가 똑같아 보이지만 실제 값은 다르다.
		System.out.println("str1"+ "=="+ " str2 "+(strobj==strobj2));
		System.out.println("str1"+ "=="+ " str2 "+(strobj==strobj2));//stack 주소비교
		System.out.println("strobj.equals(strobj2) :"+(strobj.equals(strobj2)));// 객체가 가리키는 타겟이 같은지 확인하는 함수
		
		//
		strobj = str1;//원래는 왼쪽은 힙, 오른쪽은 스택이라 하면 안되는데 자바에서 String만 이게 된다.
		System.out.println(strobj);
		System.out.println(System.identityHashCode(strobj)); //해쉬코드가 똑같아 보이지만 실제 값은 다르다.
		
		//Scanner 객체를 이용하여 문자열 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String sdata = scan.next();
		
		System.out.println(sdata);
		System.out.println("sdata"+ "=="+ " str1 "+(sdata==str1));//false = 스캔으로 통해 받는 것은 참조형이다.
		System.out.println("sdata.equals(str1) :"+(sdata.equals(str1)));// 객체가 가리키는 타겟이 같은지 확인하는 함수
		
	}

}
