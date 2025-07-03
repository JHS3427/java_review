package chapter07;

public class Car {
	
	//필드 - 필드변수, 멤버변수, 전역변수
	
	String name;
	String company;
	int price;
	
	//생성자
	
	//메소드
	public void showInfo()
	{
		System.out.print(name+ "\t");
		System.out.print(company + "\t");
		System.out.println(price+"\t");
	}
}
