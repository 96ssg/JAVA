package com.yedam.java.example1;

public class Subway {
	//필드
		private String subwayNumber;
		private int money;
		private int passengerCount;
		//생성자
		
		public Subway(String subwayNumber) {
			this.subwayNumber = subwayNumber;
		}
		
		//메서드
		
		public void take(int money) {
			this.money += money;
			this.passengerCount++;
			
		}
		public void showInfo() {
			System.out.println("지하철" + subwayNumber +"의 승객은" + passengerCount + "명이고, 수입은" + money + "입니다.");
		}
}
