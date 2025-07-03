package chapter07;

public class Animal {
	//Field(전역변수) - 초기화 안해도 JVM이 해줌.
	String name;
	int age;
	//Constructor
	public Animal() { //이런 모습을 기본 생성자라고 함 - 이름이 클래스와 같고 소괄호 안에 아무것도 없음
		//생성자 호출시 실행되는 내용. - 호출 시점 new Animal(); -코드 실행시 실행됨
		//this.name = name;
		//System.out.println(name + "객체를 생성한다.");
		System.out.println("객체를 생성한다.");
	}
	//method 
	public void sleep()
	{
		String date = "20250703";
		System.out.println(date + "잠을 잔다");
	}
	public static void main(String[] args) {
		Animal giraffe = new Animal();
		Animal elephant = new Animal();
		
		giraffe.name = "기린이";
		elephant.name = "코끼리";
		System.out.println("giraffe.name = " +giraffe.name );
		System.out.println("elephant.name = " +elephant.name );
	}
}

