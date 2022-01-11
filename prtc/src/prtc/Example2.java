package prtc;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		int[] price = null;
		int A = 0;

		while (run) {
			System.out.println("1.상품수 | 2.가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			int menuNo = scanner.nextInt();
			switch (menuNo) {
			case 1:
				System.out.println("상품수>");
				A = scanner.nextInt();
				price = new int[A];
				break;
			case 2:
				for (int i = 0; i < price.length; i++) {
					System.out.print((i + 1) + "번째 제품>");
					price[i] = scanner.nextInt();
				}
				break;

			case 3:
				for (int i = 0; i < price.length; i++) {
					System.out.println((i + 1) + "번째 제품:" + price[i]);
				}

				break;
			case 4:
				int max = 0;

				for (int i = 0; i < price.length; i++) {
					if (max < price[i]) {
						max = price[i];
					}
				}
				int index = 0 ;
				int sum = 0;
				for(int i=0; i<price.length; i++) {
					if(price[i] == max) {
						index=i+1;
						continue;
					}
					sum += price[i];
				}
				System.out.println("최고 가격을 가진 제품은"+index+"번째 제품입니다.");
				System.out.println("최고 가격을 제외한 제품을의 합은"+sum+"입니다.");
				break;
			case 5:
				run = false;
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}
