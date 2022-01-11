package com.yedam.java.example3;



public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car carHyundai = new Car();
		carHyundai.setCarName("그랜져");
		System.out.println(Car.getSerialNum());
		System.out.println(carHyundai.getCarName()+" 의 차넘버 : " + carHyundai.getCarNumber());
		
		Car carBMW = new Car();
		carBMW.setCarName("520d");
		System.out.println(Car.getSerialNum());
		System.out.println(carBMW.getCarName()+" 의 차넘버 : " + carBMW.getCarNumber());
	}

}
