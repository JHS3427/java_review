package chapter05;

import java.util.Scanner;

public class ForOverlabTest {

	public static void main(String[] args) {
		//입력받아서 구구단을 한번에 출력해보자.
		Scanner scan = new Scanner(System.in);
		int start=0, end=0;
		boolean flag=true;
		while(flag)
		{
			System.out.println("시작하고 싶으신 단을 입력하세요 : ");
			start = scan.nextInt();
			System.out.println("끝낼 단을 입력하세요 : ");
			end = scan.nextInt();
			if(start != 0 || end != 0)
			{
				for(int i = 1; i<=9;i++)
				{
					for(int j = start; j<=end;j++)
					{
						System.out.print(j + " * " + i +" = " + (j*i)+"\t");
					}
					System.out.println();
				}//i가 선언된 바깥 for문
			}
			else
			{
				// while 블록을 빠져나간 후 종료를 원함
				flag=false;
			}
			System.out.println("프로그램을 종료하고 싶다면 시작단과 끝단에 0을 입력하세요");
		}//while문
		//System.out.println("프로그램을 종료");
		//System.exit(0);
	}//main method

}
