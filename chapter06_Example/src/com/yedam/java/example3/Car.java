package com.yedam.java.example3;

public class Car {

	// 필드
	private static int serialNum = 6092;
	private String CarName; // 차종
	private String CarCompany; // 제조회사
	private int CarNumber; // 차넘버
	private int Caryears; // 차연식

	// 생성자
	public Car() {
		serialNum++;

	}

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Car.serialNum = serialNum;
	}

	public String getCarName() {
		return CarName;
	}

	public void setCarName(String carName) {
		CarName = carName;
	}

	public String getCarCompany() {
		return CarCompany;
	}

	public void setCarCompany(String carCompany) {
		CarCompany = carCompany;
	}

	public int getCarNumber() {
		return CarNumber;
	}

	public void setCarNumber(int carNumber) {
		CarNumber = carNumber;
	}

	public int getCaryears() {
		return Caryears;
	}

	public void setCaryears(int caryears) {
		Caryears = caryears;
	}

	// 메서드

}
