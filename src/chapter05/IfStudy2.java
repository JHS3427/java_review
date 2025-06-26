package chapter05;
/*
 * 중첩 if문.
 */
import java.util.Scanner;

public class IfStudy2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean math_pass=false , eng_pass=false;
		System.out.println("수학 점수 입력");		
		math_pass =  (scan.nextInt()>=60)? true:false;
		System.out.println("영어 점수 입력");		
		eng_pass =  (scan.nextInt()>=60)? true:false;
		
		//1. 중첩 if문을 이용한 방식.
		if(math_pass) if(eng_pass) System.out.println("합격");
		else System.out.println("탈락");		
		//2. 중첩 if문을 논리 연산자 &&을 이용해서 바꿀 수 있다.
		if((math_pass) && (eng_pass)) System.out.println("합격");
		else System.out.println("탈락");
	}
}
