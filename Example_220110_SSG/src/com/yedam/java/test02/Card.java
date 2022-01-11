package com.yedam.java.test02;

public class Card {
	//필드
	private String cardNo;
	private int validDate;
	private int cvc;
	
	
	//생성자
	public Card(String cardNo, int validDate, int cvc) {
		this.cardNo = cardNo;
		this.validDate = validDate;
		this.cvc = cvc;
	}
	//getter,setter


	public String getCardNo() {
		return cardNo;
	}


	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}


	public int getValidDate() {
		return validDate;
	}


	public void setValidDate(int validDate) {
		this.validDate = validDate;
	}


	public int getCvc() {
		return cvc;
	}


	public void setCvc(int cvc) {
		this.cvc = cvc;
	}
	
	//메소드
	public void showCardInfo() {
		String CardNo = "5432-4567-9534-3657";
		int validDate = 20251203;
		int cvc = 253;
		System.out.println("카드정보"+("Card NO : " + CardNo + "유효기간 : " + validDate + "CVC : " + cvc));
	}
}
