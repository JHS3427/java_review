package chapter04;

import java.util.Scanner;

/*
 * 삼항 연산자 : (조건문) ? 결과1 : 결과2ㅣ
 */
public class OpTernaryTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//스캐너 같은 임포트 필요한거에 마우스 클릭하고 CTRL+SHIFT+O 누르면 해면 import가 된다.
		System.out.println("점수 > ");
		int score = input.nextInt();
		//score가 60점 이상이면 "합격" 이하면 :불합격. 해당 결과를 result 변수에 저장하자.
		
		String result;
		result = (score>=60)? new String("합격") :new String("불합격");
		System.out.println("result : " + result);
	}

}
