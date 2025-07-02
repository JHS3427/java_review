package chapter06;

import java.util.Scanner;

/*
 * ScoreTestVer3의 결과를 2차원 배열로 변경해보자.
 * - 학생 성적 수정 메뉴를 추가한다.(수정 = 검색 + 등록)
 * - 학생명 및 점수 삭제 메뉴를 추가한다.(검색 + 변경)
 */
public class ScoreTestVer4 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//		System.out.println("****************************");
//		System.out.println(" 더조은 고등학교 성적 관리 프로그램 ");
//		System.out.println(" 1. 학생 등록 ");
//		System.out.println(" 2. 학생 리스트 출력 ");
//		System.out.println(" 3. 학생 성적 검색 ");
//		System.out.println(" 9. 프로그램 종료 ");
//		System.out.println("****************************");
		System.out.print("크기입력 : ");
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		boolean menuFlag = true;
		final int MAX_SIZE = scan.nextInt(); //한번 넣고 바꾸면 안되서 final로 함.
		
		String[] nameList = new String[MAX_SIZE];
		int[][] scoreList = new int[MAX_SIZE][]; 
		
		int[] korList = new int[MAX_SIZE];
		int[] engList = new int[MAX_SIZE];
		int[] mathList = new int[MAX_SIZE];
		int[] totList = new int[MAX_SIZE];
		int[] avgList = new int[MAX_SIZE];
		int count =0; //등록된 학생수 저장
		while(menuFlag)
		{
			System.out.println("****************************");
			System.out.println(" 더조은 고등학교 성적 관리 프로그램 ");
			System.out.println(" 1. 학생 등록 ");
			System.out.println(" 2. 학생 리스트 출력 ");
			System.out.println(" 3. 학생 성적 검색 ");
			System.out.println(" 4. 학생 성적 수정 ");
			System.out.println(" 5. 학생 삭제 ");
			System.out.println(" 9. 프로그램 종료 ");
			System.out.println("****************************");
			System.out.print("메뉴선택(숫자) : ");
			menu= scan.nextInt();
			String[] subjectList = {"국어","영어","수학"};
			int tot = 0;//메뉴 1과 4에서 공용으로 사용하는 변수이므로, 단계적 초기화 필요
			int avg = 0;//메뉴 1과 4에서 공용으로 사용하는 변수이므로, 단계적 초기화 필요
			
			if(menu==1)//학생등록
			{
				for(int i=count;i<nameList.length;i++)
				{
					tot=0;
					avg=0;
					System.out.println("학생명> ");
					nameList[i] = scan.next();
					
					//학생의 점수를 입력할 배열을 생성해야 함.
					scoreList[i] = new int [5];
					for(int j =0;j<subjectList.length;j++)
					{
						System.out.println(subjectList[j] + " : ");
						scoreList[i][j] = scan.nextInt();
						tot +=scoreList[i][j];
						avg=tot/3;
					}
					
					scoreList[i][scoreList[i].length-2] = tot;
					scoreList[i][scoreList[i].length-1] = avg;
					
					count++;
					System.out.println("계속 입력 하시겠습니까?(계속 : 아무키나 누르세요, 종료 :n) ?");
					if(scan.next().equals("n"))//[scan.next == "n"]하면 scan.next가 위치 정보를 뱉기 때문에 이렇게 쓰면 안된다.
					{
						i = nameList.length;
						System.out.println("학생 등록 완료");
					}
				}
			}
			else if(menu ==2)//학생 리스트 출력
			{
				//if(nameList[0]!=null)
				if(count!=0) //이렇게 하면 위보다 빠름(위는 stack>Heap>0번 / 아래는 stack으로 끝)
				{
					for(int i=0;i<count;i++)
					{ // 이름이 null이 아닌 경우에만 해당 내용을 출력
						System.out.print(nameList[i] + "\t");
						for(int j = 0 ;j<scoreList[i].length; j++)
						{
							System.out.print(scoreList[i][j] + "\t");
						}
					}
				}
				else
				{
					System.out.println("등록된 데이터가 없습니다. 등록을 진행해주세요");
				}
				System.out.println();
				
			}
			else if(menu ==3)//학생 성적 검색
			{
				if(nameList[0]!=null)
				{
					boolean searchFlag=true;
					while(searchFlag)
					{
						System.out.println("학생명 검색 : ");
						String searchName = scan.next();
						int searchIdx=-1;
						int nameCount=0;
						for(String name : nameList)
						{
							if(name!=null)
							{
								if(name.equals(searchName))
								{
									searchIdx=nameCount;
								}
								nameCount++;
							}
						}
						System.out.println("검색결과 주소 : "+ searchIdx);
						
						//Step5 : 데이터 출력		
						
						for(int score:scoreList[searchIdx])
						{
							System.out.print(score + "\t");							
						}
						System.out.print(nameList[searchIdx] + "\t");
						System.out.print(korList[searchIdx] + "\t");
						System.out.print(engList[searchIdx] + "\t");
						System.out.print(mathList[searchIdx] + "\t");
						System.out.print(totList[searchIdx] + "\t");
						System.out.print(avgList[searchIdx] + "\n");
						
						System.out.println("계속 검색? 계속하려면 n빼고 아무거나, 아니면 n ");
						if(scan.next().equals("n"))
						{
							System.out.println();
						}
					}//while
				}//if null
			}
			else if(menu == 4)
			{
				// 순서 - 수정할 학생명이 존재하는지 존재여부 확인.
				// 있는 경우 : 학생의 새로운 성적 입력 후 수정.
				// 없는 경우 : 수정불가 > 검색 데이터 존재 X. 다시 입력할지 질문.
				boolean modiFlag = true;
				while(modiFlag)
				{
					if(count!=0)
					{
						System.out.println("수정");
						System.out.println("(수정)학생명 검색 : ");
						String modifiedName = scan.next();
						int modiIdx = -1;
						for(int i = 0 ; i < count ; i++)
						{
							if(nameList[i].equals(modifiedName))
							{
								modiIdx = i;
							}
						}
						if(modiIdx == -1)
						{
							System.out.println("수정할 데이터가 존재하지 않습니다, 다시 입력해주세요");
						}
						else
						{
							tot=0;
							avg=0;
							scoreList[modiIdx] = new int[5];
							for(int j =0;j<subjectList.length;j++)
							{
								System.out.println(subjectList[j] + " : ");
								scoreList[modiIdx][j] = scan.nextInt();
								tot +=scoreList[modiIdx][j];
								avg=tot/3;
							}
							
							scoreList[modiIdx][scoreList[modiIdx].length-2] = tot;
							scoreList[modiIdx][scoreList[modiIdx].length-1] = avg;
							
							for(int score : scoreList[modiIdx])
							{
								System.out.print(score + "\t");
							}
							
							System.out.println("수정왼료");
							
							System.out.println("계속 수정 하겠습니까? 싫으면 n");
							if(scan.next().equals("n"))
							{
								modiFlag = false;
							}
						}
					}
					else
					{
						System.out.println("등록된 데이터가 없습니다.");
						modiFlag = false;						
					}
				}
			}
			else if(menu == 5)
			{
				System.out.print("학생삭제");
				if(count != 0)
				{
					boolean deleteFlag = true;
					while(deleteFlag)
					{
						System.out.print("(삭제) 학생명 검색 : ");
						String deleteName = scan.next();
						int deleteIdx = -1;
						for(int i =0; i<count;i++)
						{
							if(nameList[i].equals(deleteName))
							{
								deleteIdx = i;
							}
						}
						if(deleteIdx!=-1)
						{
							for(int j = deleteIdx ; j<count;j++)
							{// 홍길동(0) 이순신(1) 김유신(2) >> 이순신(0) 김유신(1) 김유신(2)
							 // 마지막꺼는 카운터가 하나 줄었기 때문에 나중에 넣을때 마지막꺼를 덮어써서 괜찮음
								nameList[j] = nameList[j+1];
								scoreList[j] = scoreList[j+1];
							}
							count--;
							System.out.println("계속 수정 하겠습니까? 싫으면 n");
							if(scan.next().equals("n"))
							{
								deleteFlag = false;
							}
						}
						else
						{
							System.out.println("삭제할 데이터가 없습니다.");
						}
					}//while - deleteFlag
				}
				else
				{
					System.out.println("등록된 데이터가 없습니다.");
				}
			}
			else if(menu == 9)//프로그램 종료
			{
				System.out.print("><---프로그램 종료---><");
				System.exit(0);
			}
			else
			{
				System.out.print("메뉴 준비중입니다. ");
			}
//			System.out.println("계속 진행 하시겠습니까?(계속 : 아무키나 누르세요, 종료 :n) ?");
//			if(scan.next().equals("n"))//[scan.next == "n"]하면 scan.next가 위치 정보를 뱉기 때문에 이렇게 쓰면 안된다.
//			{
//				menuFlag=false; //또는 break;
//			}
		}//while	
		System.out.print("><---프로그램 종료---><");

		
	}//main method

}//class
