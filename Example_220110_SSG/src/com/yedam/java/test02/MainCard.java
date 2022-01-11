package com.yedam.java.test02;

public class MainCard {

	public static void main(String[] args) {
		TossCard tossCard = new TossCard(null, 0, 0, null);
		
		tossCard.showCardInfo();
		
		DGBCard dgbCard = new DGBCard(null, 0, 0);
		
		dgbCard.showCardInfo();
	}

}
