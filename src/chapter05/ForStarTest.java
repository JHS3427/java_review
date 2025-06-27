package chapter05;

/*(시작)
 * 
 * *
 * **
 * ***
 * ****
 * (종료)
 */

public class ForStarTest {

	public static void main(String[] args) {
		for(int i =1 ; i<=10;i++)//행
		{
			for(int j=10; j>=i;j--)//열
			{
				System.out.print("*");
			}
			System.out.println();	
		}
		System.out.println("[종료]");	
		
	}

}
