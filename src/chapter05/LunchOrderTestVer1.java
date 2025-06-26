package chapter05;

import java.util.Scanner;

/*
 * 키오스크 만들기
 */
public class LunchOrderTestVer1 {

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
			switch(menuNo) { //길지만 않으면 케이스도 위로 올려써도 된다.
			case 1:	menuName ="햄버거(🍔)"; menuPrice = 100; break;
			case 2:	menuName = "피자(🍕)"; menuPrice = 200;break;
			case 3: menuName = "라면(🍜)"; menuPrice = 300;break;
			case 4: menuName = "샐러드(🥗)"; menuPrice = 400;break;
			case 9: System.out.println("- 프로그램을 종료합니다."); System.exit(0); break;
			default: System.out.println("준비중입니다.");				
			}
		}
		else
		{
			System.out.println("올바르지 않은 입력값입니다.");
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
