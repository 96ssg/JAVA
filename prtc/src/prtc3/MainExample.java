package prtc3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		Scanner scanner = new Scanner(System.in);

		List<Product> list = new ArrayList<Product>();

		while (run) {
			System.out.println("=== 1.상품 및 가격입력 | 2.제품별 가격 | 3.분석 | 4.종료 ===");
			System.out.print("선택>");
			int menuNo = scanner.nextInt();

			switch (menuNo) {
			case 1:
				System.out.println("상품명>");
				String name = scanner.nextLine();
				System.out.println("가격>");
				int price = Integer.parseInt(scanner.nextLine());
				
				Product product = new Product(name, price);
				list.add(product);
				break;
			case 2:
				for(int i=0; i<list.size(); i++) {
					Product productTemp = list.get(i);
					System.out.println(productTemp.getName()+" : " + productTemp.getPrice());
				}
				for(Product temp : list) {
					System.out.println(temp.getName()+" : " + temp.getPrice());
				}
				
				break;
			case 3:
				int max = 0;
				for(Product temp : list) {
					if(max < temp.getPrice()) {
						max = temp.getPrice();
					}	
				}
				String productName = null;
				int productTotal = 0;
				for(int i=0; i<list.size(); i++){
					Product temp = list.get(i);
					if(temp.getPrice() == max) {
						productName = temp.getName();
						continue;
					}
					productTotal += temp.getPrice();
				}
				
				System.out.println("최고 가격을 가진 제품은" + productName + "입니다.");
				System.out.println("최고 가격을 제외한 총합은" + productTotal + "입니다.");
				break;
			case 4:
				run = false;
				System.out.println("프로그램 종료");

				break;
			}
		}
	}
}
