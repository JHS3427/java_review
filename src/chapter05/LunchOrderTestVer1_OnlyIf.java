package chapter05;

import java.util.Scanner;

/*
 * 키오스크 만들기
 */
public class LunchOrderTestVer1_OnlyIf {

	public static void main(String[] args) {
		System.out.println("**************************************");
		System.out.println("\t Welcome to Food Market!!!!!!!");
		System.out.println("**************************************");
		System.out.println("\t 1. 햄버거(🍔) \t 2. 피자(🍕)");
		System.out.println("\t 3. 라면(🍜) \t 4. 샐러드(🥗)");
		System.out.println("\t 9. 나가기");
		System.out.println("**************************************");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴 선택(숫자만) > ");
		int menuNo = -1;
		String menuName="";
		int menuPrice=-1;
		int charge = 0;
		int change = 0;
		//1. 메뉴 주문.
		
		if(scan.hasNextInt())
		{
			menuNo=scan.nextInt();
			if(menuNo==1)
			{
				menuName = "1. 햄버거(🍔)";
				menuPrice=100;
			}
			else if(menuNo==2)
			{
				menuName = "2. 피자(🍕)";
				menuPrice=200;
			}
			else if(menuNo==3)
			{
				menuName = "3. 라면(🍜)";
				menuPrice=300;
			}
			else if(menuNo==4)
			{
				menuName = "4. 샐러드(🥗)"; 
				menuPrice=400;
			}
			else if(menuNo==9)
			{
				System.out.println("- 프로그램을 종료합니다.");
				System.exit(0);
			}
			else
			{
				System.out.println("준비중입니다.");
				System.exit(0);
			}
		}
		else
		{
			System.out.println("올바르지 않은 입력값입니다.");
			System.exit(0);
		}
		System.out.println("당신이 선택한 음식은 "+ menuName + "이며 가격은 "+ menuPrice + "원 입니다." );
		
		//2. 주문 메뉴 결제.
		System.out.print("결제할 요금 입력(숫자)> ");
		if(scan.hasNextInt())
		{
			charge = scan.nextInt();
			if(charge>=menuPrice)
			{
				change = charge-menuPrice;
			}
			else
			{
				System.out.println("요금이 부족합니다. 다시 입력해주세요.");
			}
		}
		else
		{
			System.out.println("올바르지 않은 입력값입니다.");
		}	
		//3. 주문 내역 출력 : 주문한 메뉴는 (햄버거), 결제금액, 잔돈()입니다.
		System.out.println("주문한 메뉴는 " + menuName + " 결제 금액은 "
		+ menuPrice + "원 이며, 잔돈은 " + change + "원 입니다.");
	}
}
