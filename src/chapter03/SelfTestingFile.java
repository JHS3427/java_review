package chapter03;
import java.util.Scanner;
public class SelfTestingFile {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();
		System.out.println("\n이름 : "+name);
		
		int counter = scan.nextInt();
		System.out.println("\t카운터 : " +counter);
		
	}

}
