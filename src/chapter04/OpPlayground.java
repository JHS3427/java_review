package chapter04;

import java.util.Scanner;

public class OpPlayground {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//지역변수를 선언하는 경우에는 초기화를 진행해야한다.
		String name=null;//String 같은 class 계열은 null값 입력이 가능하다.
		int age=0,height=0;
		//int height=0;
		boolean parent=false , heartdease = false;
		//boolean heartdease;
		
		System.out.println("*****************************************");
		System.out.println("\t\t 놀이기구 탑승전 유의사항 체크");		
		System.out.println("*****************************************");
		
		System.out.println("이름 입력 : ");
		name = input.next();
		System.out.println("나이 입력 : ");
		age = input.nextInt();
		System.out.println("키 입력 : ");
		height = input.nextInt();
		System.out.println("부모님 입력(동반O:1 // 동반X:0) : ");
		parent = (input.nextInt()==1)?true:false;
		//parent = input.nextBoolean(); //이거로 바로 boolean 받기 가능
		System.out.println("심장질환 입력(있음O:1 // 없음X:0) : ");
		heartdease = (input.nextInt()==1)?true:false;
		
		
		
		//6세이상, 단 6세미만이면 키120이상이고 보호자동반이면 가능.
		//키 120이상
		//심장질환 불가
		
		boolean first_test;
		first_test = (age>=6? true:((height>=120)&&(parent)?true:false));
		
		boolean second_test;
		second_test = (height>=120);
		
		boolean third_test;
		third_test = !heartdease;
		System.out.println("Y OR N : " + (first_test&&second_test&&third_test));
		
		//강사님 풀이
		//((6세이상 키 120이상) || (6세이하 키 120이상 보호자 동반) )&&(심장질환)
		boolean teacher_ans;
		teacher_ans = ((age >=6 && height>=120)||(age <6 && height>=120 && parent==true))&&(heartdease==false);
		System.out.println("Y OR N 2: " + (teacher_ans));
		
		
	}
}
