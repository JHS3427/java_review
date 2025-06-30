package chapter06;

import java.util.Scanner;

/*
 * 학생 한명의 국영수 점수를 입력받아 출력하는 로직 
 */
public class ScoreTestVer1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = null;
		int[] scoreList = new int[5];
		String[] subjectList = {"국어","영어","수학"};
		//1. 데이터 입력
		System.out.println("학생 이름 입력 : " );
		name = scan.next();
		int tot = 0;
		int avg = 0;
		for(int i=0; i<scoreList.length;i++)
		{
			if(i<scoreList.length-2) {
				System.out.println(subjectList[i]+"점수 입력 : " );
				scoreList[i] = scan.nextInt();
				tot += scoreList[i];
				avg = tot/3;
				//scoreList[1] = scan.nextInt();
				//scoreList[2] = scan.nextInt();
			}
			else
			{
				scoreList[scoreList.length-2] = tot;
				scoreList[scoreList.length-1] = avg = tot/subjectList.length;
				//break;
				i = scoreList.length;//브레이크 안쓰고 포문 탈출하는 방법.
			}
		}
		//2. 데이터 출력 : 학생명   국어 	영어	수학
		System.out.println("학생명/국어/영어/수학/자바/총점/평균");
		System.out.print(name + "\t");
		
		for(int score : scoreList)
		{
			System.out.print(score + "\t");
		}
		
		
		
	}

}
