package prtc;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		int[] scores = null;
		int studentNum = 0;

		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택>");
			int menuNo = scanner.nextInt();

			switch (menuNo) {
			case 1:
				System.out.print("학생 수>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]>");
					scores[i] = scanner.nextInt();
				}
				break;
			case 3:
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] :" + scores[i]);
				}
				break;
			case 4:
				int max = 0;
				int sum = 0;
				for (int i = 0; i < scores.length; i++) {
					if(max<scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
				}
				double avg = (double)sum/scores.length;
				
				System.out.println("최고점수 : " + max);
				System.out.println("평균점수 : " + avg);
				break;
			case 5:
				run = false;
				System.out.println("프로그램 종료");
				break;

			}
		}

	}

}
