package chapter06;
/*
 * 향샹된 for문법 - 배열이나 컬렉션(특히 LIST) 객체에 사용됨
 */
public class ArrayOfForTest {

	public static void main(String[] args) {
		int nlist[] = {1,2,3,4,5};
		
		//일반적인 for문을 이용한 출력
		for(int i = 0;i<nlist.length;i++)
		{
			System.out.print(nlist[i]+" ");
		}
		System.out.println();
		//향상된 for문을 이용하여 출력 - 인덱스 같은건 jvm이 알아서 실행. 즉 인덱스를 내가 컨트롤 불가. 정 원하면 카운터 함수를 써야함.
		//따라서 데이터 출력하는거 같은 경우에만 사용.
		for(int number:nlist) {
			System.out.println(number);
		}

	}

}
