package chapter06;

import java.util.Scanner;

/*
 * 더조은 고교 1학년 1반 학생들의 성적 관리 프로그램
 * - 학생 : 홍길동 / 이순신 / 김유신 / 강감찬 / 홍길순.
 * - 과목 : 국어 / 영어 / 수학 3과목의 점수를 입력
 * - 입력받은 과목의 총점과 평균을 구함.
 * - 학생명, 과목별 점수, 총점, 평균은 각각 1차원 배열로 생성하여 관리.
 * - 입출력을 위해서 각 배열의 주소를 통일시칸다.
 * 
 * - 프로그래밍 방식 중 일부 : 1)구조적(Structured) 방식 - 순차적으로 내려오고 제어문으로 다시 위로 올라가는식
 * 					    / 2)객체지향적(Object Oriented) 방식 - 
 */
public class ScoreTestVer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****************************");
		System.out.println(" 더조은 고등학교 성적 관리 프로그램 ");
		System.out.println("****************************");
		
		//step1 - 배열 선언
		//String[] nameList = {"홍길동","이순신","김유신","강감찬","홍길순"};
		Scanner scan = new Scanner(System.in);
		System.out.print("크기입력 : ");
		final int MAX_SIZE = scan.nextInt(); //한번 넣고 바꾸면 안되서 final로 함.
		
		
		String[] nameList = new String[MAX_SIZE];
		int[] korList = new int[MAX_SIZE];
		int[] engList = new int[MAX_SIZE];
		int[] mathList = new int[MAX_SIZE];
		int[] totList = new int[MAX_SIZE];
		int[] avgList = new int[MAX_SIZE];
		
		//step2 - 데이터 입력 - 실행시 외부에서 입력.
		for(int i=0;i<nameList.length;i++)
		{
			System.out.println("학생명> ");
			nameList[i] = scan.next();
			
			System.out.println("국어 > ");
			korList[i] = scan.nextInt();
			
			System.out.println("영어 > ");
			engList[i] = scan.nextInt();
			
			System.out.println("수학> ");
			mathList[i] = scan.nextInt();
			
			//System.out.println("총점> ");
			totList[i] = korList[i] + engList[i] + mathList[i];
			//System.out.println("평균> ");
			avgList[i] = totList[i]/3;
			
			System.out.println("계속 진행 하시겠습니까?(계속 : 아무키나 누르세요, 종료 :n) ?");
			if(scan.next().equals("n"))//[scan.next == "n"]하면 scan.next가 위치 정보를 뱉기 때문에 이렇게 쓰면 안된다.
			{
				i = nameList.length;
			}
		}
		
		//Step3 - 데이터 출력
		
		for(int i=0;i<nameList.length;i++)
		{ // 이름이 null이 아닌 경우에만 해당 내용을 출력
			if(nameList[i]!=null)
			{
				System.out.print(nameList[i] + "\t");
				System.out.print(korList[i] + "\t");
				System.out.print(engList[i] + "\t");
				System.out.print(mathList[i] + "\t");
				System.out.print(totList[i] + "\t");
				System.out.print(avgList[i] + "\n");
			}
		}
		System.out.println();
		
		//Step4 : 데이터 조회
		//조회할 학생 이름을 입력 받는다.
		//nameList에서 입력한 학생명을 검색. --> 학생의 nameList 주소를 변수에 저장한다.(이 때 변수는 for 블록 바깥에 저장)
		// equals 쓰기. 둘다 배열이라 ==쓰면 주소 위치 비교를 해서 답이 안나올거다.
		boolean searchFlag=true;
		while(searchFlag)
		{
			System.out.println("학생명 검색 : ");
			String searchName = scan.next();
			int searchIdx=-1;
			int count=0;
			for(String name : nameList)
			{
				if(name!=null)
				{
					if(name.equals(searchName))
					{
						searchIdx=count;
					}
				count++;
				}
			}
			System.out.println("검색결과 주소 : "+ searchIdx);
			
			//Step5 : 데이터 출력		
	
			System.out.print(nameList[searchIdx] + "\t");
			System.out.print(korList[searchIdx] + "\t");
			System.out.print(engList[searchIdx] + "\t");
			System.out.print(mathList[searchIdx] + "\t");
			System.out.print(totList[searchIdx] + "\t");
			System.out.print(avgList[searchIdx] + "\n");
			
			System.out.println("계속 검색? 계속하려면 n빼고 아무거나, 아니면 n ");
			if(scan.next().equals("n"))
			{
				searchFlag = false;
			}
		}//while - searchFlag : step4, step5 반복
		System.out.println("프로그램 종료");
	}//main method

}//class
