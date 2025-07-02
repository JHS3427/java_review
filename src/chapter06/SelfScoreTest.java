package chapter06;

import java.util.Scanner;

/*
 * 사람 여러명의 국영수 점수를 받아서 총점과 평균을 출력한다.
 * 2차원 배열 사용, 배열1 : 사람이름 / 배열2 : 2차원 점수배열 - 순서는 배열1의 사람이름을 따른다. 과목은 국영수과사
 * 사람의 수는 초기에 입력을 받는다.
 * 메뉴 : 등록/리스트출력/검색/수정/삭제/시스템 종료
 * 메뉴는 if문과 switich case문 중 하나로 만들어본다.
 */
public class SelfScoreTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("사람수 입력");
		final int PP_NUM = scan.nextInt();
		String[] subject = {"국어","영어","수학","과학","사회"};
		String[] pp_Name = new String[PP_NUM];
		String searchName;
		int[][] pp_Score = new int[PP_NUM][subject.length+2];
		int regi_idx= 0;
		int tot = 0;
		int avg= 0;
		boolean menuloop= true;
		while(menuloop)
		{
			int search_idx;
			System.out.println("메뉴 입력.\n 1 : 사람 등록\n 2 리스트 출력 \n 3 검색 \n 4 수정"
					+ " \n 5 삭제 \n 9 시스템 종료");
			int menuSelect = scan.nextInt();
			if(menuSelect==1)
			{
				System.out.println("사람 및 점수 등록");
				boolean ps_regi = true;
				
				while(ps_regi)
				{
					tot= 0;
					avg= 0;
					System.out.print("이름 등록 : ");
					pp_Name[regi_idx] = scan.next();
					for(int i = 0; i<subject.length; i++)
					{
						System.out.print(subject[i] + " 점수 등록 : ");
						pp_Score[regi_idx][i] = scan.nextInt();
						tot+=pp_Score[regi_idx][i];
					}
					
					avg = tot/subject.length;
					pp_Score[regi_idx][subject.length]=tot;
					pp_Score[regi_idx][subject.length+1]=avg;
					
					regi_idx++;
					System.out.print("등록을 그만두고 메뉴로 나가기 : n / 등록하기 : 다른버튼");
					if(scan.next().equals("n"))
					{
						ps_regi=false;
					}//if-scan_equal_n
				}//while-ps_regi
			}//else if_1
			else if(menuSelect==2)
			{
				System.out.println("등록 리스트 전체 출력");
				System.out.println("이름 \t 국어 \t 영어 \t 수학 \t 과학 \t 사회 \t 총점 \t 평균");
				for(int i = 0 ; i < PP_NUM ; i++)
				{
					System.out.print(pp_Name[i]+"\t");
					for(int j=0;j<subject.length+2;j++)
					{
						System.out.print(pp_Score[i][j]+"\t");
					}
					System.out.println();
				}
			}//else if_2
			else if(menuSelect==3)//검색
			{
				search_idx=-1;
				System.out.print("검색할 이름을 입력하세요.");
				searchName=scan.next();
				for(int i = 0; i<regi_idx;i++)
				{
					if(searchName.equals(pp_Name[i]))
					{
						search_idx= i;					
					}
				}//for문
				if(search_idx == -1)
				{
					System.out.println("그런사람 없음");
				}
				else
				{
					for(int j=0;j<subject.length+2;j++)
					{
						System.out.print(pp_Score[search_idx][j]+"\t");
					}	
					
				}
			}//else if_3
			else if(menuSelect==4)//수정
			{
				search_idx=-1;
				System.out.print("수정할 이름을 입력하세요.");
				searchName=scan.next();
				for(int i = 0; i<regi_idx;i++)
				{
					if(searchName.equals(pp_Name[i]))//찾는 사람이 있으면 이름을 바꿀지 점수를 바꿀지 선택
					{
						search_idx= i;
					}
					System.out.println();
				}//for문
				if(search_idx==-1)
				{
					System.out.println("그런사람 없음");					
				}
				else
				{
					System.out.println();
					System.out.println("이름을 바꿀거면 \"name\", 점수를 바꿀꺼면 \"score\" 입력");
					String nOrS = scan.next();
					if(nOrS.equals("name"))
					{
						System.out.println("바꿀 이름 입력");
						String reName=scan.next();
						pp_Name[search_idx]=reName;
						System.out.println("바꾼 이름 : " + pp_Name[search_idx]);
					}
					else if(nOrS.equals("score"))
					{
						System.out.println("새 점수 입력");
						tot= 0;
						avg= 0;
						for(int j = 0; j<subject.length; j++)
						{
							System.out.print(subject[j] + " 점수 등록 : ");
							pp_Score[search_idx][j] = scan.nextInt();
							tot+=pp_Score[search_idx][j];
						}
						avg = tot/subject.length;
						pp_Score[search_idx][subject.length]=tot;
						pp_Score[search_idx][subject.length+1]=avg;
					}
					else
					{
						System.out.println("입력 실수. 처음부터 하시오.");
					}
				}
			}//else if 4
			else if(menuSelect==5)//삭제.
			{
				search_idx=-1;
				System.out.print("삭제할 이름을 입력하세요.");
				searchName=scan.next();
				for(int i = 0; i<regi_idx;i++)
				{
					if(searchName.equals(pp_Name[i]))//찾는 사람이 있으면 이름을 바꿀지 점수를 바꿀지 선택
					{
						search_idx= i;
					}
					System.out.println();
				}//for문
				if(search_idx==-1)
				{
					System.out.println("그런사람 없음");					
				}
				else
				{
					String[] newNameString= new String[PP_NUM];
					int[][] newScoreArray = new int[PP_NUM][subject.length+2];
					for(int i = 0 ; i<PP_NUM-1;i++)
					{
						if(i<search_idx)
						{
							newNameString[i]=pp_Name[i];
							newScoreArray[i] = pp_Score[i];
						}
						else
						{
							newNameString[i]=pp_Name[i+1];
							newScoreArray[i] = pp_Score[i+1];
						}
					}
					pp_Name=newNameString;
					pp_Score=newScoreArray;
					regi_idx--;
				}
			}
			else if(menuSelect==9)
			{
				menuloop=false;
			}
		}
	}//main method

}//class
