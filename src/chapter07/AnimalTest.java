package chapter07;

public class AnimalTest {//여기는 실행용 클래스
	
	public static void main(String[] args) {
		System.out.println("AnimalTest 클래스 실행!!!");
		
		//사자, 호랑이를 Animal 클래스를 이용해서 사자, 호랑이 객체를 만든다.
		
		//객체 생성 및 생성자 호출.
		Animal lion = new Animal();//생성자 호출
		Animal tiger = new Animal();
		Animal giraffe = new Animal();
		Animal elephant = new Animal();
		
		lion.name = "심바";//캡슐화 되어 heap영역에 저장됨
		lion.age = 5;
		
		tiger.name = "호돌이";
		tiger.age =3;
		
		lion.sleep();
		tiger.sleep();
		System.out.println("lion.name : "+ lion.name);
		System.out.println("lion.age : "+ lion.age);
		System.out.println("tiger.name : "+ tiger.name);
		System.out.println("tiger.age : "+ tiger.age);
		
		giraffe.name = "기린이";
		elephant.name = "코끼리";
		System.out.println("giraffe.name = " +giraffe.name );
		System.out.println("elephant.name = " +elephant.name );
		
	}

}
