package com.yedam.java.Class;

public class SalaryMan {
	//필드
	
	private int salary;
	
	//생성자
	//클래스이름(매개변수, ...){} //리턴타입 x
	
	SalaryMan(){
		salary = 1000000;
	}
	SalaryMan(int salary) {      //int Salary 매개변수
		this.salary = salary; // 필드명이랑 구분을 위해서 this 사용
	}
	//메소드
	//리턴타입 메서드이름(매개변수,...){} //리턴타입 없으면 void
	int getAnnualGross() {
		int salarys = 0;
		salarys = salary * 12 + salary * 5;
		return salarys;
	}
	
}
