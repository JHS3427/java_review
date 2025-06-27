package chapter05;

import java.util.Scanner;

/*
 * 반복문 : do while문 - do{실행문 }while(조건식)
 *			처음 실행문은 조건식에 관계없이 무조건 한번 발동됨. 이후 조건식에 따라 돌림
 */
public class DoWhileTest {

	public static void main(String[] args) {
		// 1~10까지 정수의 합계를 출력
		// 시작과 종료값은 실행시 외부에서 입력을 통해 진행함.
//		Scanner scan = new Scanner(System.in);
//		int i, sum=0, max;
//		System.out.println("초기값 : ");		
//		i = scan.nextInt();
//		System.out.println("마지막값 : ");		
//		max = scan.nextInt();
//		while(i<=max)
//		{
//			sum += i;
//			i++;
//			System.out.println("sum = "+sum);
//		}
//		System.out.println("sum = "+sum);
//		
		//강사님 해설
		//int start =0, end = 0, i = 0 , sum = 0;
		//i = start = scan.nextInt(); -이런식으로도 작성가능
		//나머지는 이름조금 바뀌고 그대로임.
		Scanner scan = new Scanner(System.in);
		int start = 0, end=0, i=0, sum=0;
		System.out.println("start = "+start);
		i = start = scan.nextInt();
		System.out.println("end = "+end);
		end = scan.nextInt();
		
		
	}

}
