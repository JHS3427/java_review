package chapter06;

public class ArrayTest02 {

	public static void main(String[] args) {
		// names 문자열 변수 선언 및 생성
		String names2[];
		String names[] = new String[3];
		names2= new String[5];
		
		int[] scores = new int[10];
		scores[0] = 100;
		scores[1] = 2100;
		scores[2] = 300;
		
		int scores2[] = new int[3];
		
		String scores3[] = {"홍길동","홍길순"};
		int scores4[] = {10,20};
		names[0] = "홍길동";
		//names = "이순신"; 에러 - 이미 위치정보가 들어가있어서.
		System.out.println(scores3);
		System.out.println(scores3[0]);
		System.out.println(names[0]);
		System.out.println(scores[0]);
		System.out.println(scores2[1]);
		System.out.println(scores[2]);
		//names 두번째 공간에 "이순신" 저장		
		names[1] = "이순신";

		System.out.println(names[1]);
	}

}
