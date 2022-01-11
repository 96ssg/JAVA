package prtc2;

public class Card {

	private static int serialNum = 1000;
	
	private int cardNo;
	
	public Card() {
		serialNum++;
		this.cardNo = serialNum;
	}

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	
}
