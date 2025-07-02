package chapter06;

import java.util.Scanner;

/*
 * 음식 주문/결제 프로그램(콘솔)
 * 
 * - 음식을 주문(1), 결제(2), 프로그램 종료(9)하는 메뉴로 구성.
 * - 프로그램 종료를 제외하고 나머지 메뉴는 반복 선택 가능하다.
 * - 메뉴 선택 시 체크하는 기능은 switch case를 사용하여 구현한다.
 * 
 * 
 * 예외 사항 처리 : 메뉴 선택 또는 결제 금액 입력 시 정수형 타입이 아닌 경우 메세지 출력 후 재입력 유도.
 * 입력값이 정확할 때까지 재입력을 유도하여 진행, flag 변수를 이용하여 반복진행.
 * 결제 금액이 부족할 경우, 재입력을 통해 금액을 누적으로 계산하여 저장 후 결제.
 */
public class LunchOrderTestVer3 {

	public static void main(String[] args) {
		//주문 음식 리스트
		String[] menuList = {"햄버거(🍔)","피자(🍕)","라면(🍜)","샐러드(🥗)"};
		int[] priceList = {100,200,300,400};
		//주문 리스트 선언 및 생성
		
		Scanner scan = new Scanner(System.in);
		System.out.print("주문리스트 크기 : ");
		final int MAX_SIZE=scan.nextInt();		
		boolean menuFlag=true;
		int count = 0;
		int[] orderPriceList = new int[MAX_SIZE];
		String[] orderMenuList = new String[MAX_SIZE];
		String[] orderNameList = new String[MAX_SIZE];
		
		//결제 리스트 선언 및 생성
		//메뉴명, 결제금액, 입금액, 잔돈		
		String[] paymentMenuList = new String[MAX_SIZE];
		int[] totalAmountList= new int[MAX_SIZE];
		int[] paidAmountList = new int[MAX_SIZE];
		int[] changeList = new int[MAX_SIZE];
		int paymentCount=0;
		while(menuFlag)
		{
			System.out.println("**************************************");
			System.out.println("\t Welcome to Food Market!!!!!!!");
			System.out.println("**************************************");
			System.out.println("\t 1. 음식 주문");
			System.out.println("\t 2. 주문 리스트 조회");
			System.out.println("\t 3. 음식 결제");
			System.out.println("\t 4. 결제 리스트");
			System.out.println("\t 9. 프로그램 종료");
			System.out.println("**************************************");
			int menu = 0;
			menu = scan.nextInt();
			switch(menu)
			{
				case 1 :
					System.out.println("음식 주문");
					//1. 메뉴 주문
					boolean orderFlag = true;

					String menuName = null;
					int menuPrice = 0;
					while(orderFlag)
					{
						System.out.println("주문 메뉴(숫자)");
						System.out.println("\t 1. 햄버거(🍔):100 \t 2. 피자(🍕):200");
						System.out.println("\t 3. 라면(🍜):300 \t 4. 샐러드(🥗):400");
						
						if(scan.hasNextInt())
						{
							int menuNo=scan.nextInt();
//							switch(menuNo) { //길지만 않으면 케이스도 위로 올려써도 된다.
//								case 1:	
//									orderMenuList[count]=menuList[menuNo-1];
//									orderPriceList[count] = priceList[menuNo-1];
//									break;
//									// menuPrice = 100; break;
//								case 2:
//									orderMenuList[count]=menuList[menuNo-1];
//									orderPriceList[count] = priceList[menuNo-1];
//									break;
//								//menuName = "피자(🍕)"; menuPrice = 200;break;
//								case 3: 
//									orderMenuList[count]=menuList[menuNo-1];
//									orderPriceList[count] = priceList[menuNo-1];
//									break;//menuName = "라면(🍜)"; menuPrice = 300;break;
//								case 4: 
//									orderMenuList[count]=menuList[menuNo-1];
//									orderPriceList[count] = priceList[menuNo-1];
//								default: System.out.println("메뉴 준비중입니다.");				
//							}
							if(menuNo<1 || menuNo>4)//위의 switch case 코드 압축
							{
								System.out.println("메뉴 준비중입니다.");
							}
							else
							{
								orderMenuList[count]=menuList[menuNo-1];
								orderPriceList[count] = priceList[menuNo-1];
								System.out.println(menuList[menuNo-1] + "주문 완료");
							}
							count++;
							
							//주문 리스트 저장 공간이 있으면 이걸 띄우고 아니면 다른거로
							//주문 갯수 체크1
							if(count == MAX_SIZE)
							{
								System.out.println("주문 공간 부족, 주문은 최대 "+MAX_SIZE+"개");
								orderFlag=false;
							}
							else
							{
								System.out.println("계속 준비할까.종료 : n ");
								if(scan.next().equals("n"))
								{
									orderFlag=false;
								}
								
							}
						}
						else
						{
							System.out.println("올바르지 않은 입력값입니다.");
							System.out.println("입력값 : " + scan.next());
							orderFlag=true;
						}	
					}
					break;
				case 2 :
					System.out.println("주문 리스트 조회");
					for(int i = 0 ; i < count;i++)
					{
						System.out.print((i+1)+"번 : "+orderMenuList[i]+ "\t");
						System.out.print((i+1)+"번 : "+orderPriceList[i]+ "\t");
						System.out.println();						
					}
					break;
				case 3:
					System.out.println("음식 결제");
					boolean paymentFlag =true;
					int totalPayment=0;
					int charge=0;
					int change=0;
					for (int i=0;i<count;i++)
					{
						totalPayment += orderPriceList[i];
					}
					while(paymentFlag)//결제 요금 부족시 반복 실행.
					{//결제 예정 금액 출력 :orderPriceList
						
						System.out.print("결제 예정 금액 : "+ totalPayment);
						System.out.print("결제할 요금 입력(숫자)> ");
						if(scan.hasNextInt())
						{
							charge += scan.nextInt();

							System.out.println("총 입력 금액." + charge);
							
							if(charge>=totalPayment)
							{
								change = charge-totalPayment;
								paymentFlag = false;
								System.out.println("결제 완료. "+ change +"원은 잔돈입니다.");
								paymentMenuList[paymentCount] = orderMenuList[0]+"등...";
								totalAmountList[paymentCount] = totalPayment;
								paidAmountList[paymentCount] = charge;
								changeList[paymentCount] = change;
								
								System.out.println(paymentMenuList[paymentCount] + "\t");
								System.out.println(totalAmountList[paymentCount] + "\t");
								System.out.println(paidAmountList[paymentCount] + "\t");
								System.out.println(changeList[paymentCount] + "\t");
								
								//결제 완료 후 주문 내역 리스트(orderMenuList)와
								//주문 내역 가격 리스트(orderMenuPrice)를 비워야한다.
								/*for(int i = 0 ; i < count ; i ++)
								{
									orderMenuList[i]=null;
									orderPriceList[i]=0;
								}*/
								//위 아래 둘다 배열을 초기화 하는식.
								//위는 각각의 자리를 비우는거, 아래는 새로 하나 만들어서 갈아끼우는거.
								orderMenuList = new String[MAX_SIZE];
								orderPriceList = new int[MAX_SIZE];
								count = 0;//order
								paymentCount++;//payment
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
					break;
					
				case 4:
					for(int i = 0 ; i<paymentCount;i++)
					{
						System.out.println(paymentMenuList[i] + "\t");
						System.out.println(totalAmountList[i] + "\t");
						System.out.println(paidAmountList[i] + "\t");
						System.out.println(changeList[i] + "\t");
					}
					break;
				case 9 :
					System.out.println("<--시스템 종료-->");
					System.out.println(">--시스템 종료--<");
					System.exit(0);
					break;
				default :
					System.out.println("준비중입니다.");
			}//switch
		}//while-menuFlag

	}//main method

}//class
