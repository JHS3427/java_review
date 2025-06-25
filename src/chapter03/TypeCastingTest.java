package chapter03;
/*
 * 형변환 : 자동(묵시적) 형변환, 강제(명시적) 형변환 예시.
 */
public class TypeCastingTest {

	public static void main(String[] args) {
		//자동(묵시적) 형변환 : 작은 데이터를 큰 데이터 타입에 넣는다.
		byte bdata = 1;
		short sdata = bdata;
		int idata = sdata;
		long ldata = idata;
		
		int number = 100;
		float fnumber= number;
		
		char str = 'A';
		int strNumber = str;

		//강제(명시적) 형변환 - 큰 데이터 타입을 작은 데이터 타입에 넣는다.
		
		int inumber = 10000;
		byte bnumber = (byte)inumber;
		
		double dnumber = 123456789.052875;
		int inumber2 = (int)dnumber;
		
		System.out.println("-- 자동 형변환 --");
		System.out.println(ldata);
		System.out.println(fnumber);
		System.out.println(strNumber);
		
		System.out.println("-- 강제 형변환 --");		
		System.out.println(bnumber);
		System.out.println(inumber2);

	}

}
