package com.yedam.java.ch01_01;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ===클래스 상속

		// 자식클래스인 DmbCellphone 인스턴스 생성
		DmbCellphone dmbCellphone = new DmbCellphone("자바폰", "검정", 10);

		// 부모클래스인 Cellphone의 필드
		System.out.println("모델 : " + dmbCellphone.model);
		System.out.println("색상 : " + dmbCellphone.color);

		// DmbCellPhone 자신의 필드
		System.out.println("채널 : " + dmbCellphone.channel);

		// 부모클래스인 CellPhone

		dmbCellphone.powerOn();
		dmbCellphone.bell();
		dmbCellphone.sendVoice("여보세요.");
		dmbCellphone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		dmbCellphone.sendVoice("반갑습니다.");
		dmbCellphone.hangUp();

		// DmbCellphone 자신의 메서드

		dmbCellphone.turnOnDmb();
		dmbCellphone.changeChannelDmb(12);
		dmbCellphone.turnOffDmb();

		System.out.println();

		// ===메서드 재정의
		int r = 10;
		Calculator calculator = new Calculator();
		System.out.println("원면적 : " + calculator.areaCircle(r));

		Computer computer = new Computer();
		System.out.println("원면적 : " + computer.areaCircle(r));

		System.out.println();
		
		//부모 메서드 호출
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
				

	}

}
