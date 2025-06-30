package chapter06;

public class ArrayTest01 {

	public static void main(String[] args) {
		int[] arrInt;
		int arrInt2[]=null;
//		System.out.println(arrInt);// 에러 발생 원인 : arrInt는 지역변수로 JVM이 초기화 하지 않음. 따라서 직접 초기화 필수
		System.out.println(arrInt2);
	}

}
