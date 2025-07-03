package chapter07;

public class CarTesst {

	public static void main(String[] args) {
		//1. 객체 생성.
		Car avante = new Car();
		Car ev6 = new Car();
		//2. 객체에 데이터 값 할당.
		avante.name = "아반떼";
		avante.company = "현대자동차";
		avante.price =10000;
		
		ev6.name = "ev6";
		ev6.company = "기아자동차";
		ev6.price =2000;
		
		//3. 객체 메소드 호출
		//각 메소드 호출 종료시, main으로 돌아가는 복귀주소(retrun address)를 저장 했다가 이를 이용해서 여기로 다시 온다..
		avante.showInfo();
		ev6.showInfo();
		System.out.println("메인메소드 종료");
	}

}
