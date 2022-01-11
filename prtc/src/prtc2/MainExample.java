package prtc2;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("======= 문제3번");
		//문제3) 문제2에서 구현한 내용에 카드 회사 클래스 CardCompany를 싱글톤 패턴을 사용하여 구현해보세요.
		CardCompany company = CardCompany.getInstance();
		Card firstCard = company.createCard();
		Card secondCard = company.createCard();
		System.out.println("첫번째 카드 : " + firstCard.getCardNo());
		System.out.println("두번째 카드 : " + secondCard.getCardNo());
	}

}
