package Example;

import java.util.Scanner;

public class MainExample {

	public static void main(String[] args) {
		// Calcultor 클래스 -> 사칙연산에 대한 메서드
		Calculator myCalc = new Calculator();

		int result1 = myCalc.plus(2, 4);
		System.out.println("result1:" + result1);

		int x = 10;
		int y = 4;
		int result2 = myCalc.minus(x, y);
		System.out.println("result2:" + result2);
		double result3 = myCalc.divide(x, y);
		System.out.println("result3:" + result3);
		int result4 = myCalc.A(x, y);
		System.out.println("result4:" + result4);

		// 문제2 TV 클래스 -> 다음과 같은 형태의 생성자와 메서드를 가진다.

		TV myTV = new TV();
		myTV.showInfo();
		
		// 문제3 Grade 클래스 -> 3과목의 점수를 입력받아 성적평균을 출력한다.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade myGrade = new Grade(math, science, english);
		
		//average() 메서드는 평균을 계산하여 리턴
		System.out.println("평균 : " + myGrade.average());

	}
	

}
