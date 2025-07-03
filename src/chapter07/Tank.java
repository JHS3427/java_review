package chapter07;

import java.util.Scanner;

public class Tank {
//필드
	Scanner scan = new Scanner(System.in);
	String tankName;
	TankAmmo guns;
	
	//생성자(Constructor)
	public Tank() {
		System.out.println("이건 탱크입니다.");
	}
	//메서드
	public void nameInsert() {
		System.out.println("탱크 이름을 입력하세요.");
		tankName = scan.next();
		guns = new TankAmmo();
		System.out.println("주포 크기를 입력하세요.");
		guns.mainGun = scan.next();
		System.out.println("기관총 크기를 입력하세요.");
		guns.machinegun = scan.next();
		System.out.println("주포 포탄 크기를 입력하세요.");
		guns.round1 = scan.nextInt();
		System.out.println("기관총 탄종을 입력하세요.");
		guns.round2 = scan.nextInt();
		guns.gunsound();
	}
	public void tankPrint() {
		System.out.println(guns.mainGun);
	}
}
