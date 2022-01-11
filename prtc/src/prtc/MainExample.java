package prtc;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person kim = new Person("Kim", 8000);
		Person lee = new Person("Lee", 9800);
		
		StarCafe starCafe = new StarCafe("별다방 1호점");
		kim.buyCoffee(starCafe);
		starCafe.ShowInfo();
		
		System.out.println();
		BeanCafe beanCafe = new BeanCafe("콩다방 동성로점");
		lee.buyCoffee(beanCafe);
		beanCafe.ShowInfo();
		
		System.out.println();
		kim.showInfo();
		lee.showInfo();
	}

}
