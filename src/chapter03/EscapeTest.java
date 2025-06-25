package chapter03;
/*
 * 제어문자 실습
 */
public class EscapeTest {

	public static void main(String[] args) {
		String greet = new String("안녕하세요. \n저는 \"홍길동\"입니다.");
		String greet2 = "\t\t반갑습니다.";
		String name ="\"홍길동\"";
		
		System.out.println(greet);
		System.out.println(greet2);
		System.out.println(name);
		
	}

}
