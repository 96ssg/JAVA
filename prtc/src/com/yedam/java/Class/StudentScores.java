package com.yedam.java.Class;

public class StudentScores {
	//필드
	private int Korean;
	private int English;
	private int Math;
	private int Class1;
	String Name;
	
	
	
	//생성자
	public StudentScores(String Name, int Class1){
		this.Name = Name;
		this.Class1 = Class1;
	}
	//메소드



	public int getKorean() {
		return Korean;
	}



	public void setKorean(int korean) {
		Korean = korean;
	}



	public int getEnglish() {
		return English;
	}



	public void setEnglish(int english) {
		English = english;
	}



	public int getMath() {
		return Math;
	}



	public void setMath(int math) {
		Math = math;
	}



	public int getClass1() {
		return Class1;
	}



	public void setClass1(int class1) {
		Class1 = class1;
	}



	public String getName() {
		return Name;
	}



	public void setName(String Name) {
		Name = Name;
	}
	int getTotal() {
		int Total = 0;
		Total = Korean + English + Math;
		return Total;
	}
	double getAverage() {
		double Average = 0;
		Average = (double)(Korean + English + Math)/3;
		return Average;
	}
}
