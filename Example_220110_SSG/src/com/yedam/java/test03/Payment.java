package com.yedam.java.test03;

public interface Payment {
	//상수필드
	String On = "(ONLINE_PAYMENT_RATIO) , 5%";
	String Off = "(OFFLINE_PAYMENT_RATIO) , 3%";
	//추상 메소드
	public int online(int price);
	public int offline(int price);
	public void showinfo();
}
