package chapter06;

import java.util.Scanner;

/*
 * 사람 한명의/여러명의 국영수 점수를 받아서 총점과 평균을 출력한다.
 */
public class SelfScoreTest {

	public static void main(String[] args) {
		// 1. 사람 한명의 국영수 점수를 받아서 총점과 평균을 낸다.
		Scanner scan = new Scanner(System.in);
		String name;
		//String[] subjectList = new String[3];
		String[] subjectList = {"국어","수학","과학","체육"};
		int[] scoreList = new int[subjectList.length+2];
		
		System.out.println("사람 이름을 입력하시오 : ");
		name = scan.next();
		int tot=0, avg=0;
		for(int i=0; i<subjectList.length;i++)
		{
			System.out.println(subjectList[i] +" 점수를 입력하시오 : ");
			scoreList[i] = scan.nextInt();
			tot += scoreList[i];
		}
		scoreList[subjectList.length] = tot;
		scoreList[subjectList.length + 1] = tot/subjectList.length;
		
		for(int number : scoreList)
		{
			System.out.println(number + "\t");
		}
		//2차원 배열을 써서 여러 사람의 점수를 받는다. - 개발중
		
		String[] multiName= new String[3];
		String[] subjectValue = {"국어","영어","수학","과학"};
		int[][] multiScore = new int [multiName.length][subjectValue.length+2];
		int multiTot=0;
		int multiAvg=0;
		
		//다수의 이름 받기		
		for(int i = 0; i<multiName.length;i++)
		{
			multiName[i] = scan.next();
		}
		
		//각 사람별 과목 점수 받기
		for(int i=0; i<multiName.length;i++)
		{
			System.out.println(multiName[i] + " 의 점수를 입력하세요.");
			for(int j=0; j<subjectValue.length; j++)
			{
				System.out.println(subjectValue[j] + " 점수 :");
				multiScore[i][j] = scan.nextInt();
			}
		}
		for(int i=0; i<multiScore.length;i++)
		{
			multiTot=0;
			multiAvg=0;
			for(int j=0; j<subjectValue.length; j++)
			{
				multiTot += multiScore[i][j];
			}
			multiScore[i][multiScore[i].length-2] = multiTot;
			multiAvg = multiTot/multiName.length;
			multiScore[i][multiScore[i].length-1] = multiAvg;
		}
		for(int i=0; i<multiName.length;i++)
		{
			System.out.println(multiName[i] + " 의 점수");
//			if(subjectValue.length>=multiName[i].length)
			for(int j=0; j<subjectValue.length; j++)
			{
				System.out.print(subjectValue[j] + " : " + multiScore[i][j] + "   ");
			}
			System.out.println();
		}
	}

}
