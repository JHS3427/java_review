package chapter05;
/*
 * 중첩 if문.
 */
import java.util.Scanner;

public class IfStudy {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int math=0 , eng=0;
		System.out.println("수학 점수 입력");		
		math =  scan.nextInt();
		System.out.println("영어 점수 입력");		
		eng =  scan.nextInt();
		
		//1. 중첩 if문을 이용한 방식.
		if(math>=60)
		{
			if(eng>=60)
			{
				System.out.println("합격");
			}
		}
		else
		{
			System.out.println("탈락");
		}
		
		//2. 중첩 if문을 논리 연산자 &&을 이용해서 바꿀 수 있다.
		if(math>=60 && eng>=60)
		{
			System.out.println("합격");
		}
		else
		{
			System.out.println("탈락");		
		}
	}
}
