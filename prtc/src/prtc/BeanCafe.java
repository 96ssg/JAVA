package prtc;

public class BeanCafe {
	private String cafeName;
	private int money;
	private int passengerCount;
	
	
	public BeanCafe(String cafeName) {
		this.cafeName = cafeName;

	}
	public void take(int money) {
		this.money +=money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println("%s의 손님은 %d이고 수입은 %d입니다.\n",cafeName, passengerCount,money);
	}
}
