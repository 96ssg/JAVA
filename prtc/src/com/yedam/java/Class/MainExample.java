package com.yedam.java.Class;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder adder = new Adder();
		Subtracter sub = new Subtracter();
		
		adder.run();
		sub.run();
		
		Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
			toDollar.run();
	}

}
