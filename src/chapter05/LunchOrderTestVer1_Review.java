package chapter05;

import java.util.Scanner;

/*
 * 키오스크 만들기
 */
public class LunchOrderTestVer1_Review {

	public static void main(String[] args) {
		System.out.println("**************************************");
		System.out.println("\t Welcome to Food Market!!!!!!!");
		System.out.println("**************************************");
		System.out.println("\t 1. 햄버거(🍔) \t 2. 피자(🍕)");
		System.out.println("\t 3. 라면(🍜) \t 4. 샐러드(🥗)");
		System.out.println("\t 9. 나가기");
		System.out.println("**************************************");
		String menuName = new String("");
		int menuNo=-1;
		int menuPrice=-1;
		int menuCharge=-1;
		int menuChange=-1;
		
		Scanner menuClick = new Scanner(System.in);
		
		//1. 메뉴 주문.
		
		if(menuClick.hasNextInt())
		{
			menuNo=menuClick.nextInt();
			switch(menuNo)
			{
			case 1:
				menuName = "1. 햄버거(🍔)";
				menuPrice = 100;
				break;
			case 2:
				menuName = "2. 피자(🍕)";
				menuPrice = 200;
				break;
			case 3:
				menuName = "3. 라면(🍜)";
				menuPrice = 300;
				break;
			case 4:
				menuName = "4. 샐러드(🥗)";
				menuPrice = 400;
				break;
			case 9:
				System.out.println("안녕히 가세요");
				System.exit(0);
				break;
			default:
				System.out.println("메뉴 준비중 입니다.");	
				System.exit(0);			
			}
		}
		else System.out.println("Wrong Click");
		System.out.println("주문 내용 : " + menuName + " / 가격 : " + menuPrice);
						
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
		System.out.println("투입 하실 금액을 입력하세요.");
		if(menuClick.hasNextInt())
		{
			menuCharge = menuClick.nextInt();
			if(menuCharge>menuPrice)
			{
				menuChange=menuCharge-menuPrice;
				System.out.println("입력한 금액 : " + menuCharge + " / 잔돈 : " + menuChange);
			}
			else
			{
				System.out.println("돈이 더 필요함.");
			}
		}
		else System.out.println("Wrong Click");
		//3. 주문 내역 출력 : 주문한 메뉴는 (햄버거), 결제금액, 잔돈()입니다.
		System.out.println("주문 내용 : "+ menuName +" / 입력한 금액 : " 
		+ menuCharge + " / 잔돈 : " + menuChange);
		
	}
}
