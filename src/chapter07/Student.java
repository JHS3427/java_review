package chapter07;

public class Student {
//필드 // 멤버변수, 전역변수
	String name;
	int kor, eng, math;
//constructor
	public Student()
	{
		
	}
	//method.
	public int getTot(){
		return kor+eng+math;
	}
	public int getAvg()
	{
		return (kor+eng+math)/3;
	}
}
