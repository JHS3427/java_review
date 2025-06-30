package chapter06;

public class ArrayTest03 {

	public static void main(String[] args) {
		//1에서 5까지의 데이터를 저장 후 순서대로 출력 - 1.배열을 배우기 전
		int[] numbers = new int [15]; // 배열의 전체 크기 : 변수명.length
			
		for(int i=0; i<numbers.length;i++)
		{
			numbers[i] = i+1; //numbers[0] = 1; 데이터 저장하는 곳
			System.out.println(numbers[i]); // 데이터를 출력하는 곳
		}
		
	}

}
