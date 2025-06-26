package chapter05;

import java.util.Scanner;

public class ScannerNextIntTest {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		boolean NT = false;
		int num1 = -1;
		int num2 = -1;
		
		NT = scan.hasNextInt();
		if(NT)
		{
			num1 = scan.nextInt();
			System.out.println("123 : " + num1);
			num2 = scan.nextInt();
			System.out.println("456 : " + num2);
		}
		
		
	}
}
