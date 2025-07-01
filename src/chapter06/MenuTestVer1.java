package chapter06;

import java.util.Scanner;

/* 더조은 레스토랑 메뉴 등록/출력/검색 프로그램
* - 메뉴 : 피자 / 햄버거 / 라면 / 샐러드
* - 메뉴명 / 이모지 / 메뉴가격을 저장.
* - 메뉴명 이모지 가격은 각각 1차원 배열로 생성하여 관리.
* - 입출력을 위해서 각 배열의 주소를 통일시칸다.
* - 메뉴 관리를 위해서 각 벼읠의 주소를 통일시킨다.
* - 프로그래밍 방식 중 일부 : 1)구조적(Structured) 방식 - 순차적으로 내려오고 제어문으로 다시 위로 올라가는식
* 					    / 2)객체지향적(Object Oriented) 방식 - 
*/
public class MenuTestVer1 {

	public static void main(String[] args) {
		//변수 또는 객체 선언
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴 갯수 : ");
		final int MAX_SIZE = scan.nextInt();
		
		String[] nameList = new String[MAX_SIZE];
		String[] emojiList = new String[MAX_SIZE];
		int[] priceList = new int[MAX_SIZE];
		
		// 메뉴 등록 / 출력 / 검색 / 종료
		boolean menuFlag =true;
		int menu = 0;
		int menuCount = 0; //메뉴 등록 1개 완료할 때마다 1씩 증가.
		while(menuFlag)
		{
			System.out.println("****************************");
			System.out.println(" 더조은 레스토랑 메뉴 관리 프로그램 ");
			System.out.println(" 1. 메뉴 등록 ");
			System.out.println(" 2. 메뉴 리스트 출력 ");
			System.out.println(" 3. 메뉴 검색 ");
			System.out.println(" 9. 프로그램 종료 ");
			System.out.println("****************************");
			
			System.out.print("메뉴 : ");
			menu = scan.nextInt();
			
			if(menu==1)
			{
				for(int i = menuCount; i<MAX_SIZE;i++)//저장 공간 크기가 부족하면 메세지 출력 후 종료 추가
				{
					//메뉴 등록
					System.out.print("등록할 메뉴 입력 : ");
					nameList[i] = scan.next();
					System.out.print("등록할 이모지 입력 : ");
					emojiList[i] = scan.next();
					System.out.print("메뉴 가격 입력(정수) : ");
					priceList[i] = scan.nextInt();
					//메뉴 카운터 증가
					menuCount++;
					
					if(menuCount == MAX_SIZE)//전체 공간과 같은 크기인지 확인.
					{
						System.out.println("저장공간 부족. 등록 종료");
					}
					else 
					{
						System.out.print("계속 입력하겠습니까? 나가시려면 N");
						if(scan.next().equals("N"))
						{
							i = MAX_SIZE;
						}
					}
				}//for문
			}
			else if(menu==2)
			{
				if(menuCount!=0) //이렇게 하면 위보다 빠름(위는 stack>Heap>0번 / 아래는 stack으로 끝)
				{
					for(int i=0;i<MAX_SIZE;i++)
					{ // 이름이 null이 아닌 경우에만 해당 내용을 출력
						if(nameList[i]!=null)
						{
							System.out.print(nameList[i] + "\t");
							System.out.print(emojiList[i] + "\t");
							System.out.print(priceList[i] + "\t");
						}
						System.out.println();
					}
				}
				else
				{
					System.out.println("등록된 데이터가 없습니다. 등록을 진행해주세요");
				}
				System.out.println();
			}
			else if(menu==3)
			{
				boolean searchFlag = true;
				while(searchFlag)
				{
					System.out.print("메뉴 검색 ");
					String searchingMenu = scan.next();
					if(nameList[0]!=null)
					{
						for(int j = 0 ; j<menuCount ; j++)//MAX_SIZE가 아니라 menuCount 써서 데이터 들어간 곳까지만 검색
						{
							if(nameList[j].equals(searchingMenu))
							{
								System.out.print(nameList[j] + " " + emojiList[j] + " " + 
										priceList[j] + "원");
							}
						}
					}
					else
					{
						System.out.println("메뉴 입력 먼저 하시오");
						searchFlag=false;
					}
					/*
					 * 강사님 방법 - 내꺼 틀림.
					 * 	int searchIdx= -1;
					 * 	for(int i = 0; i<menuCout;i++)
					 * 	{
					 * 	if(searchingMenu.equals(nameList[i]))
					 * 		{
					 * 			searchIdx=i;
					 *		}
					 *	}
					 *	if(searchIdx==-1)
					 *	{없다는 내용 출력
					 *	}
					 *	else
					 *	{찾은 내용 출력
					 *	}
					 *
					 *이후는 출력문
					 */
				}//메뉴검색 while
			}
			else if(menu==9)
			{
				System.out.print("><---프로그램 종료---><");
				System.exit(0);				
			}
			else
			{
				System.out.println("=> 준비중입니다.");
			}
		}
	}//main method
}//class
