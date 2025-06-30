package chapter06;

public class ArrayTest05 {

	public static void main(String[] args) {
		// 
		int nList[] = new int[3];
		// nList = "1"; - 타입 미스매치 에러. 현재 nList는 주소를 내보내는거라 숫자를 주고 싶다면 nList[0]=1 이런식으로 해야함
		// nList[3] = 99; - 써두기만 해두면 빨간 에러줄이 안뜨지만 돌리면(런타임시) 에러뜸. 크기를 넘어갔다는 에러임.(ArrayIndexOutOfException)
/*(ArrayIndexOutOfException) 다른 예시.
		for(int i=0;i<5;i++) {
			System.out.println(nList[i]);
		}
	*/	
		
		System.out.println(nList.hashCode());
		System.out.println(nList[2]);
		for(int i=0;i<nList.length;i++) {
			System.out.println(nList[i]);
		}

		
		
	}

}
