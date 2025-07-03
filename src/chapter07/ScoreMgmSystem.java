package chapter07;

import java.util.Scanner;

public class ScoreMgmSystem {
//Field
	String admin;
	Student student;
	Student[] sList = new Student[10];
	Scanner scan = new Scanner(System.in);
	int studentIdx=0;
	//constructor
	public ScoreMgmSystem() {
		
	}
	//method
	public void insert() {//3명 입력받는거 해보기
		boolean input=true;
		while(input)
		{
			System.out.println("등록");
			student = new Student();
			System.out.println("이름 등록");
			student.name = scan.next();
			System.out.println("국어점수 등록");
			student.kor = scan.nextInt();
			System.out.println("영어점수 등록");
			student.eng = scan.nextInt();
			System.out.println("수학점수 등록");
			student.math = scan.nextInt();
			System.out.println("등록 완료. \n 그만두려면 n 입력");
			
			sList[studentIdx] = student;
			
			studentIdx++;
			
			if(scan.next().equals("n"))
			{
				input=false;
			}
		}
	}
	
	public void show() {
		System.out.print("학생명 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균 \n");
//		System.out.print(student.name + "\t" );
//		System.out.print(student.kor + "\t" );
//		System.out.print(student.eng + "\t" );
//		System.out.print(student.math + "\t" );
//		System.out.print(student.getTot() + "\t" );
//		System.out.print(student.getAvg() + "\n" );
		for(int i = 0 ; i < studentIdx ; i++)
		{
			System.out.print(sList[i].name + "\t" );
			System.out.print(sList[i].kor + "\t" );
			System.out.print(sList[i].eng + "\t" );
			System.out.print(sList[i].math + "\t" );
			System.out.print(sList[i].getTot() + "\t" );
			System.out.print(sList[i].getAvg() + "\n" );
		}
		
	}
	public void update() {
		System.out.println("업데이트");
	}
	public void remove() {
		System.out.println("제거");
	}
	public void search() {
		System.out.println("탐색");
	}
	
}
