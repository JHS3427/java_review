package chapter06;

import java.util.Arrays;

/*
 * 배열 복사 : for문, System.arrayCopy(), Arrays.copyof()
 */
public class ArrayCopy {

	public static void main(String[] args) {
		// 1. for
		
		int[] arrInt = {1,2,3};
		int[] arrInt2 = new int[5];
		
		int[] arrInt3 = new int[3]; //System.arrayCopy()용 변수.
		int[] arrInt4 = new int[3]; //Arrays.copy
		
		for(int i = 0; i<arrInt.length;i++)
		{
			arrInt2[i] = arrInt[i];
		}
		
		for(int i =0;i<arrInt2.length;i++) System.out.println(arrInt2[i]);
		
		//2. System.arrayCopy()복제할 원본 / 원본 시작 위치 / 복제할곳/ 복제본 시작 위치 / 전체 갯수
		System.arraycopy(arrInt, 0, arrInt3, 0, arrInt.length);
		
		/*public static void arraycopy(Object src,
 			int srcPos,
			 Object dest,
			 int destPos,
			 int length)*/
		for(int i =0;i<arrInt3.length;i++) System.out.print(arrInt3[i] + "\t");
		//3 Arrays.copyOf()
		//public static int[] copyOf (int) original.
		
		arrInt4 = Arrays.copyOf(arrInt,arrInt.length);
		for(int i = 0; i<arrInt4.length;i++)
		{
			System.out.println(arrInt4[i]);
		}
	}

}
