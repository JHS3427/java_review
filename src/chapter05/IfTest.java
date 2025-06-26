package chapter05;

import java.util.Scanner;

/*
 * 단일 If문 : 조건의 결과가 true인 경우에만 실행함.
 * if~else " 조건의 결과가 true/false 경우에 각각 실행함
 * 예시) if(조건문){실행문;} else {시행문}
 * if ~ else if .... elseㅁ 구문 : 여러개의 조건을 체크하여 실행함. 모든 조건에 만족하지 않는 경우 else 가 실행된다.
 * 형식) if(조건식1){[조건식1이 true)인 경우 실행}> else if(조건식2){조건식2가 true ㅐㅑ
 *s 
 * 
 */
public class IfTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수 > ");
		int score = scan.nextInt();
		
		System.out.println("-- 시험 시작 --");
		//학점출력 95점이상A+ // 85점 이상 85++//85이상/60점 (F)
		//합격 여부 출력.(60점 이상인 경우 합격. 합격인 경우에만 출력)
		if(score>=95)
		{
			System.out.println("-- 합격 A+ --");
		}
		else if (score>=90)
		{
			System.out.println("-- 학점 A --");
		}
		else if( score>=85)
		{
			System.out.println("-- 학점 B+ --");
		}
		else if(score>=80)
		{
			System.out.println("-- 합격 B --");
		}
		else if (score>=75)
		{
			System.out.println("-- 학점 C+ --");
		}
		else if( score>=70)
		{
			System.out.println("-- 학점 C --");
		}
		else if (score>=65)
		{
			System.out.println("-- 학점 D+ --");
		}
		else if( score>=60)
		{
			System.out.println("-- 학점 D --");
		}
		else
		{
			System.out.println("-- 학점 F --");
		}		
		
		//각 if문의 실행문이 한줄인 경우에는 {} 블록을 생략하고 작성이 가능하다.
		//
		
	}

}
