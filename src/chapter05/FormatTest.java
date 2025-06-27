package chapter05;
/*
 * 정수를 3자리마다 ","를 찍는 방법.
 */
public class FormatTest {

	public static void main(String[] args) {

		int a = 20002000;
		String aa = String.format("%,d", new Object[] {Integer.valueOf(a)});
		System.out.println(aa);
	}

}
