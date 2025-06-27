package chapter05;

import java.util.Scanner;

/*
 * 반복문 : for(초기값선언; 조건식;증감연산식){실행문(조건식이 true인 경우 실행)}
 * 조건식이 false가 되면 for 블록 탈출.
 * 초기값으로 선언된 변수는 for 블록 안에서만 사용 가능. 
 */
public class ForTest {

	public static void main(String[] args) {
		for(int i=1;i<1000;i+=20) {	System.out.println(i);	}

		//강사님 강의
		//시작값과 종료값을 실행 시 외부에서 입력을 통해 진행함.
		Scanner scan = new Scanner(System.in);
		int start = 0, end = 0;
		System.out.println("시작값");
		start = scan.nextInt();
		System.out.println("끝값");
		end = scan.nextInt();
		for(int i = start ; i<=end; i+=10) {//1이상의 값을 누적합으로 대입 => 1+=값
			System.out.println(" i = " + i );
		}
		//System.out.println(i); 에러 발생 구문 : 원인은 i의 블록 범위가 for에서 끝나므로 바깥으로 나오면 죽음.
		System.out.println("-- for 문 종료 -- ");
		//1~10까지의 정수합을 출력
		int sum = 0;
		for(int i = 1;i<=10;i++)
		{
			//int sum = 0; //여기서 이렇게 초기화 시켜버리면 반복문 돌때마다 초기화가 된다.
			sum+=i;
		}
		System.out.println(sum);
	}

}
