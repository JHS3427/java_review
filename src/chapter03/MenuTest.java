package chapter03;
import java.util.Scanner;
public class MenuTest {

	public static void main(String[] args) {
		System.out.println("*********************");
		System.out.println("Welcome to Shooping Mall");
		System.out.println("Welcome to Food Market");
		System.out.println("*********************");
		System.out.println("\t1.상품보기 \t2.상품구입");
		System.out.println("\t3.영수증보기 \t4.종료");
		System.out.println("*********************");
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴를 선택해주세요(숫자) > ");
		int number = scan.nextInt();
		System.out.println("선택한 메뉴 : " + number);
	}

}
