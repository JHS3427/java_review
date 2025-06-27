package chapter05;

import java.util.Scanner;

/*
 * 반복문 : while문 - while(조건식){실행문 - 조건식이 true일 때만 실행.};
 * 			종료되는 시점을 정확하게 알고 있는 경우 사용됨.
 */
public class WhileTest {

	public static void main(String[] args) {
		// 1~10까지 정수의 합계를 출력
		// 시작과 종료값은 실행시 외부에서 입력을 통해 진행함.
		Scanner scan = new Scanner(System.in);
		int i, sum=0, max;
		System.out.println("초기값 : ");		
		i = scan.nextInt();
		System.out.println("마지막값 : ");		
		max = scan.nextInt();
		while(i<=max)
		{
			sum += i;
			i++;
			System.out.println("sum = "+sum);
		}
		System.out.println("sum = "+sum);
		
		//강사님 해설
		//int start =0, end = 0, i = 0 , sum = 0;
		//i = start = scan.nextInt(); -이런식으로도 작성가능
		//나머지는 이름조금 바뀌고 그대로임.
		
	}

}
