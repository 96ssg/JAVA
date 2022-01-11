package com.yedam.java.test03;

public class CardPayment implements Payment {
	private double cardRatio;

	public CardPayment (double cardRatio) {
		this.cardRatio = cardRatio;
	}
	@Override
	public int online(int price) {
		// TODO Auto-generated method stub
		return (int)(price - (price*0.13));
	}

	@Override
	public int offline(int price) {
		// TODO Auto-generated method stub
		return (int)(price - (price*0.11));
	}

	@Override
	public void showinfo() {
		// TODO Auto-generated method stub
		System.out.println("*** 카드로 결제 시 할인정보" );
		System.out.println("온라인 결제시 총 할인율 : 0.13 " );
		System.out.println("오프라인 결제시 총 할인율 : 0.11 " );
	}

}
