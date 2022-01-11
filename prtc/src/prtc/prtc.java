package prtc;
import java.util.Scanner;
public class prtc {

	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		/*
		// 문제1
		
		int score = Integer.parseInt(scanner.nextLine());
		int score2 = Integer.parseInt(scanner.nextLine());
		if(score + score2 >= 0) {
			System.out.println("Natural Number");
		}else {
			System.out.println("실수");
		}
		*/
		/*
        // 문제2		
		int score = Integer.parseInt(scanner.nextLine());
		int score2 = Integer.parseInt(scanner.nextLine());
		if(score > score2) {
			    System.out.println(">");
		}else if(score == score2) { 
				System.out.println("=");
		}else{
				System.out.println("<");
		}
		*/
		/*
		// 문제3
		double weight = Double.parseDouble(scanner.nextLine());
		double height = Double.parseDouble(scanner.nextLine());
		double BMI = (weight/height*height);
		if(BMI < 18.5) {
			System.out.println("저체중");	
		}else if(18.5 <= BMI && BMI < 25 ) {
			System.out.println("정상");
		}else if(25 <= BMI && BMI < 30) {
			System.out.println("과체중");
		}else {
			System.out.println("비만");
		}
		*/
		/*
		//문제 4
		int num = Integer.parseInt(scanner.nextLine());
		
		switch(num) {
		case 1 :
			System.out.println("2");
			break;
		case 2 :
			System.out.println("4");
			break;
		case 3 :
			System.out.println("6");
			break;
		case 4 :
			System.out.println("8");
			break;
		case 5 :
			System.out.println("10");
			break;
		case 6 :
			System.out.println("12");
			break;
		case 7 :
			System.out.println("14");
			break;
		case 8 :
			System.out.println("16");
			break;
		case 9 :
			System.out.println("18");
			break;						
		}
		*/
		//문제5
		int score = 87;
		switch(score/10){
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("E");
			break;
	
		}
		
		
}

}