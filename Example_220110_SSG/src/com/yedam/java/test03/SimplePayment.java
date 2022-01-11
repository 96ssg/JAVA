package com.yedam.java.test03;

public class SimplePayment implements Payment {
private double simplePaymentRatio;

public SimplePayment(double simaplePaymentRatio) {
	this.simplePaymentRatio = simplePaymentRatio;
}
	@Override
	public int online(int price) {
		// TODO Auto-generated method stub
		return (int)(price - (price*0.1));
	}

	@Override
	public int offline(int price) {
		// TODO Auto-generated method stub
		return (int)(price - (price*0.08));
	}

	@Override
	public void showinfo() {
		// TODO Auto-generated method stub
		System.out.println("*** 간편결제 시 할인정보" );
		System.out.println("온라인 결제시 총 할인율 : 0.1 " );
		System.out.println("오프라인 결제시 총 할인율 : 0.08 " );
	}

}
