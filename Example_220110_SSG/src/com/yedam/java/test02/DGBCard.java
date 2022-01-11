package com.yedam.java.test02;

public class DGBCard extends Card {
	//필드
	private String company = "대구은행";
	private String cardStaff;
	
	//생성자
	public DGBCard(String cardNo, int validDate, int cvc) {
		super(cardNo, validDate, cvc);
		// TODO Auto-generated constructor stub
		this.company = company;
		this.cardStaff = cardStaff;
		
	}
	//오버라이딩
	@Override
	public void showCardInfo() {
		// TODO Auto-generated method stub
		String CardNo = "5432-4567-9534-3657";
		String cardStaff = "신빛용";
		int validDate = 20251203;
		int cvc = 253;
		System.out.println("카드정보 " +"("+ "CardNo : " + CardNo + " , 유효기간 : " + validDate + " , CVC : " + cvc+")");
		
		System.out.println("담당직원 -" + cardStaff + " , " + company);
	}
	

}
