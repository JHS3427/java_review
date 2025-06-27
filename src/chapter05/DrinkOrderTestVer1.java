package chapter05;

import java.util.Scanner;

public class DrinkOrderTestVer1 {

	public static void main(String[] args) {
		// 지역 변수 선언
		Scanner scan = new Scanner(System.in);
		int menuNo = 0;
		int MenuPrice = 0;
		int charge = 0;
		int change = 0;
		String menuName="";
		String STR_MenuPrice;
		String STR_charge;
		String STR_change;
		boolean menuFlag=true;
		boolean chargeFlag=true;

		// step1. 메뉴판 출력
		System.out.println("========= 메뉴판 =========");
		System.out.println("1. ☕ 아메리카노 - 2,800원");
		System.out.println("2. 🍵 바닐라 라떼 - 3,500원");
		System.out.println("3. 🥤 딸기 쉐이크 - 4,000원");
		System.out.println("========= 메뉴판 =========");
		// step2. 주문기능
		while(menuFlag)
		{
			System.out.println("주문할 메뉴 번호 입력> ");
			if(scan.hasNextInt())
			{
				menuNo = scan.nextInt();
				menuFlag=false;
				switch(menuNo)
				{
					case 1:{ menuName = "1. ☕ 아메리카노"; MenuPrice=2800; break;}
					case 2:{ menuName = "2. 🍵 바닐라 라떼"; MenuPrice=3500; break;}
					case 3:{ menuName = "3. 🥤 딸기 쉐이크"; MenuPrice=4000; break;}
					default :{menuFlag=true; System.out.println("준비중 입니다.");}
				}
			}//if문 - 들어온 데이터가 int값인지 확인
			else
			{
				System.out.println("올바르지 않은 값입니다. 다시 입력해주세요");
				scan.next();
			}
		}
		//출력용 메뉴가격 저장
		STR_MenuPrice = String.format("%,d", new Object[] {Integer.valueOf(MenuPrice)});
		System.out.println("당신이 주문한 메뉴는 "+ menuName + "이며, 금액은 " + STR_MenuPrice+"원 입니다.");
		// step3. 결제기능
		while(chargeFlag)
		{
			System.out.println("입금 금액을 입력해주세요.");		
			if(scan.hasNextInt())//들어오는게 숫자가 맞는지 확인
			{
				charge += scan.nextInt();
				STR_charge=String.format("%,d", new Object[] {Integer.valueOf(charge)});
				if(charge < MenuPrice)//들어온 돈이 음료 가격보다 작으면 추가 입력 요청
				{
					System.out.println("결제하실 금액은 "+STR_MenuPrice+"원 입니다.");
					System.out.println("총 입금 금액은 "+STR_charge+"원 입니다.");
					System.out.println("=> 금액이 부족합니다. 다시 입력해주세요.");
				}
				else
				{
					change = charge-MenuPrice;
					STR_change=String.format("%,d", new Object[] {Integer.valueOf(change)});
					System.out.println("결제가 완료되었습니다.");
					System.out.println("결제할 금액 : " + STR_MenuPrice + "원 // 총 입금 금액 : "+ STR_charge
							+ "원 // 결제 완료! 잔돈 : " + STR_change +"원" );
					chargeFlag=false;
				}
			}
			else
			{
				System.out.println("올바르지 않은 값입니다. 다시 입력해주세요");
				scan.next();
			}
		}//결제 while문
		System.out.println("[종료]");
	}//main method

}//class
