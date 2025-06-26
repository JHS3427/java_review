package chapter05;

import java.util.Scanner;

/*
 * 변수 값을 체크하여 실행
 * switch(변수){
 * 	case 값1:	//변수의 값과 값1이 동일하다면 아래의 실행문 1을 수행.
 * 		실행문1
 * 		break;
 *  case 값2:	//변수의 값과 값2이 동일하다면 아래의 실행문 2을 수행.
 * 		실행문2
 * 		break;
 * 	.......
 * 	default:	//값1, 값2 외의 다른 값인 경우 실행
 * 		실행문3	//break 없어도 된다. 
 * }
 * 주의점 : 만약 중간에 있어야할 break가 없을 경우, default로 가는게 아니라 그냥 다음 case를 침범해서 실행문을 돌려버리니 주의.
 */
public class SwitchTest {

	public static void main(String[] args) {
		// 프로그램 실행 시 정수 값을 입력받아 결과를 출력하시오.
		// 입력값이 1이면, 사과(🍎) 출력.
//		2이면 오렌지(🍊)
//		3이면 망고(🍋)
//		4이면 키위(🥝)
//		그 외에의 숫자는 '준비중입니다" 출력
		Scanner scan = new Scanner(System.in);
		int number = -1; //일반적인 초기화에서는 0도 정수값이라 -1을 보통 입력함.
		System.out.println("숫자 > ");
		number = scan.nextInt();
		
		System.out.println(number);
		
		switch(number) 
		{
			case 1:
				System.out.println("사과 > 🍎");
				break;
			case 2:
				System.out.println("오렌지 > 🍊");
				break;
			case 3:
				System.out.println("망고 > 🍋");
				break;
			case 4:
				System.out.println("키위 > 🥝");
				break;
			default:
				System.out.println("준비중입니다.");
		}
		System.out.println("끝.");
	}

}
