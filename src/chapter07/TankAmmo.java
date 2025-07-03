package chapter07;

public class TankAmmo {
	//필드
	String mainGun;
	String machinegun;
	int round1;
	int round2;
	
	//생성자(Constructor)
	public TankAmmo() {
		System.out.println("전차 탄입니다");
	}
	//메서드
	public void gunsound()
	{
		System.out.println("펑");		
	}
	
}
