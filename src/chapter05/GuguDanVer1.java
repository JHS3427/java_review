package chapter05;

import java.util.Scanner;

/*
 * 중첩반복문 : 구구단 만들기
 */
public class GuguDanVer1 {

	public static void main(String[] args) {
		// 구구단 2단 출력
		Scanner scan = new Scanner(System.in);
		int standard = 0;
		
		while(true)
		{
			System.out.println("원하시는 단수를 입력하세요.(종료시 0 입력)");		
			standard = scan.nextInt();
			if(standard!=0) // 구구단 변수값이 0이 아닌 경우
			{
				System.out.println(standard + "단 출력 시작.");
				System.out.println("----------------");
				for(int i = 1; i<=9 ; i++)
				{
					System.out.println(standard+ " * "+i+" = "+(i*standard));
				}
			}//if문
			else // 구구단 변수값이 0인 경우
			{
				System.out.println("프로그램을 종료함.");				
				System.exit(0);
			}//else문
			
		}//while
		
	}//main

}//class
