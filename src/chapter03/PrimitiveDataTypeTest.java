package chapter03;

public class PrimitiveDataTypeTest {
	public static void main(String[] args) {
		
		//정수형 데이터 타입
		
		boolean run = true;//논리형
		byte b = 1;
		short s = 10;
		int i = 100;
		long l = 1000;
		long l2 = 1000L;	
		
		//실수형 데이터 타입		
		
		float f = 10.0f;
		double d = 100.0;
		
		//문자 리터럴 타입
		
		char c = 'a';
		char c2 = 'A';
		
		int c_asc = c;
		int c_asc2 = c2;
		
		char str = '홍';
		//char str2 = "홍"; - 쌍따옴표는 에러임. 그냥 따옴표만 쓰기
		
		
		//상수 정의 : 프로그램 시작부터 종료까지 같은 값을 가지며, 상수명은 전체 대문자로 선언.
		//프로그램 시작 : START(1), 종료 : END(0)
		final int START = 1;// - final을 안붙이먄 아래처럼 start를 바꾸려는 시도가 있어도 유지한다.
		final int END = 0;// - final을 안붙이먄 아래처럼 START를 바꾸려는 시도가 있어도 유지한다.
		
		System.out.println("boolean : " + run);
		System.out.println("byte : " + b);
		System.out.println("short : " + s);
		System.out.println("int : " + i);
		System.out.println("long : " + l);
		System.out.println("long : " + l2);
		System.out.println("float : " + f);
		System.out.println("double : " + d);
		System.out.println("char : " + c);
		System.out.println("char : " + c2);
		System.out.println("char ascii : " + c_asc); //97
		System.out.println("char ascii : " + c_asc2); //65		
		System.out.println("START : " + START); //65		
		System.out.println("END : " + END); //65		
		
	}
}
