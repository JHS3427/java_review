package chapter05;

import java.util.Scanner;
/*
 * 키오스크 만들기
 * 추가되어야 되는 내용.
 * 예외 사항 처리 : 메뉴 선택 또는 결제 금액 입력 시 정수형 타입이 아닌 경우 메세지 출력 후 재입력 유도.
 * 입력값이 정확할 때까지 재입력을 유도하여 진행, flag 변수를 이용하여 반복진행.
 * 결제 금액이 부족할 경우, 재입력을 통해 금액을 누적으로 계산하여 저장 후 결제.
 * 
 * 강사님 깃허브
 * https://github.com/TJG404
 */
public class LunchOrderTestVer2 {

	public static void main(String[] args) {
		System.out.println("**************************************");
		System.out.println("\t Welcome to Food Market!!!!!!!");
		System.out.println("**************************************");
		System.out.println("\t 1. 햄버거(🍔):100 \t 2. 피자(🍕):200");
		System.out.println("\t 3. 라면(🍜):300 \t 4. 샐러드(🥗):400");
		System.out.println("\t 9. 나가기");
		System.out.println("**************************************");
		
		int a = 20002000;
		String aa = String.format("%,d", new Object[] {Integer.valueOf(a)});
		System.out.println(aa);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴 선택(숫자만) > ");
		int menuNo = -1;
		String menuName="";
		int menuPrice=-1;
		int charge = 0;
		int change = 0;
		boolean menuFlag = true, paymentFlag = true;
		//1. 메뉴 주문.
		while(menuFlag)
		{
			if(scan.hasNextInt())
			{
				menuNo=scan.nextInt();
				switch(menuNo) { //길지만 않으면 케이스도 위로 올려써도 된다.
					case 1:	menuName ="햄버거(🍔)"; menuPrice = 100; break;
					case 2:	menuName = "피자(🍕)"; menuPrice = 200;break;
					case 3: menuName = "라면(🍜)"; menuPrice = 300;break;
					case 4: menuName = "샐러드(🥗)"; menuPrice = 400;break;
					case 9: System.out.println("- 프로그램을 종료합니다."); System.exit(0); break;
					default: System.out.println("준비중입니다.");				
				}
				menuFlag=false;
			}
			else
			{
				System.out.println("올바르지 않은 입력값입니다.");
				System.out.println("입력값 : " + scan.next());
				menuFlag=true;
			}	
		}		
		System.out.println("주문하신 메뉴는 " + menuName + " , 가격은 "+menuPrice+"원 입니다");
		/*
		if(scan.hasNextInt())
		{
			menuNo=scan.nextInt();
			if(menuNo==1)
			{
				System.out.println("1. 햄버거(🍔) 선택.");
			}
			else if(menuNo==2)
			{
				System.out.println("2. 피자(🍕) 선택.");
			}
			else if(menuNo==3)
			{
				System.out.println("3. 라면(🍜) 선택.");
			}
			else if(menuNo==4)
			{
				System.out.println("4. 샐러드(🥗) 선택.");
			}
			else if(menuNo==9)
			{
				System.out.println("- 프로그램을 종료합니다.");
				System.exit(0);
			}
			else
			{
				System.out.println("준비중입니다.");
			}
		}
		else
		{
			System.out.println("올바르지 않은 입력값입니다.");
		}	
		*/
		
		//2. 주문 메뉴 결제.
		while(paymentFlag)
		{
			System.out.print("결제할 요금 입력(숫자)> ");
			if(scan.hasNextInt())
			{
				charge += scan.nextInt();

				System.out.println("총 입력 금액." + charge);
				
				if(charge>=menuPrice)
				{
					change = charge-menuPrice;
					paymentFlag = false;
				}
				else
				{
					System.out.println("요금이 부족합니다. 다시 입력해주세요.");
				}
			}
			else
			{
				scan.next();
				System.out.println("올바르지 않은 입력값입니다. 다시 입력하시오.");
				paymentFlag=true;
			}
		}//while(paymentFlag)문
		//3. 주문 내역 출력 : 주문한 메뉴는 (햄버거), 결제금액, 잔돈()입니다.
		System.out.println("주문한 메뉴는 " + menuName + " 결제 금액은 "
		+ menuPrice + "원 이며, 잔돈은 " + change + "원 입니다.");
	}//main method
}
