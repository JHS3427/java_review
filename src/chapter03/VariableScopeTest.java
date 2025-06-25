package chapter03;

/*
 * 변수의 범위 설정에 대한 내용.
 * global(전역), local(지역, 로컬)
 */

public class VariableScopeTest {
	
	
	//여기에 선언되는 변수를 전역변수라고 함.
	static int gnumber = 10;
	
	//전역 상수 : ex) START, END
	
	static final int START = 1;
	static final int END = 0;
	
	public static void main(String[] args) {
		int number = 100; // main method의 지역변수
		String str = new String("홍길동");
		String str2; //선언 - 변수의 사용 범위는 선언할 때에 정해진다.
		{
			int num2 = 200;//얘는 위아래의 중괄호 안에서만 정의됨. 따라서 바깥에서는 못씀
			str2 = "홍길순"; //할당
			System.out.println("" + num2);
			System.out.println("" + str2);
		}
		
//		System.out.println("" + num2);//얘는 여기서는 에러 난다.
		System.out.println("전역 변수 : " + gnumber);//이렇게 쓰려면 메인 method가 static이므로 전역변수도 같은 형식이어야 한다.
		System.out.println("전역 상수 : " + START);
		System.out.println("전역 상수 : " + END);
		System.out.println("지역 변수 : " + number);
		System.out.println("참조 변수 : " + str);
		
		
	}
}
