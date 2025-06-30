package chapter06;

import java.util.Scanner;

public class ArrayTest04 {

	public static void main(String[] args) {
		// 배열 객체 생성 후 크기 확인 : 기본형 데이터를 저장하는 객체 생성. - 안에 들어가는 데이터는 기본형임을 잊으면 안된다.
		int[] numberList = new int[5];
		String[] nameList = {"홍길동","이순신","김유신"};
		boolean[] flagList = new boolean[2];
		
		System.out.println(numberList.length);
		System.out.println(nameList.length);
		System.out.println(flagList.length);
		
		// 배열 객체 생성 후 크기 확인 : 참형 데이터를 저장하는 객체 생성.
		//Scanner scan = new Scanner(System.in); - 기존 1개짜리 스캐너
		Scanner[] scanList = new Scanner[3]; //Scanner 클래스의 객체를 3개 저장한다. 초기화만 되서 바로 호출시 null 나옴
		//ScanList 0번지에 Scanner 객체 생성 후 주소 저장.
		scanList[0] = new Scanner(System.in);
		scanList[1] = new Scanner(System.in);
		scanList[2] = new Scanner(System.in);
		//scanList[0] = scanList[2]; -- 이 뜻은 scanList[2]에 저장된 위치번호를 scanList[0]으로 바꾸는것
		System.out.println(scanList[0].hashCode());//여기서는 0번과 2번의 위치정보가 달랐었는데
		System.out.println(scanList[1].hashCode());
		System.out.println(scanList[2].hashCode());
		
		scanList[0] = scanList[2];
		System.out.println(scanList[0].hashCode());//여기서는 0번과 2번의 위치정보가 같아짐. 이게 call by reference
		System.out.println(scanList[1].hashCode());
		System.out.println(scanList[2].hashCode());
		
		int[] nList = new int[3];
		nList[0] = 10;
		nList[1] = 20;
		nList[2] = 30;
		
		nList[0] = nList[2];//이 경우는 위
		// System.out.println(nList[0].hashCode()); - hashCode는 위치 찍을때 쓰는 함수라 빼야함
		System.out.println(nList[0]);
		System.out.println(nList[1]);
		System.out.println(nList[2]);
		
		//call by value(값을 호출해서 변경) / call by reference(주소를 호출해서 변경)
		//저장소의 특정 위치에 값이 바로 바뀜 VS 저장소에 특정 위치에 저장된 주소정보가 변경됨.
	}

}
