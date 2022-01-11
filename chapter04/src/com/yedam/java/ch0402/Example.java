package com.yedam.java.ch0402;
import java.util.Scanner;
public class Example {

	public static void main(String[] args) {
		
		/*
		// for 문
		//예제1 0부터 90까지 10단위로 출력
		for(int i=0; i<=90; i+=10) {
			System.out.println(i);
		}
        //예제2 0부터 20까지 짝수만 출력
		for(int n=0; n<=20; n++) {
			if(n%2!=0) {
				continue;
			}
			System.out.println(n);
		}
		*/
	    //예제3 숫자를 5번 입력하고, 입력받을때마다 더해지는 값을 출력
		//출력예시 : 숫자 5개를 입력하세요.
		Scanner scanner = new Scanner(System.in);
		/*
		System.out.println("숫자 5개를 입력하세요.");
		int sum = 0;
		for(int m=1; m<=5; m++) {
			System.out.println("숫자를 입력하세요.");
			int num = Integer.parseInt(scanner.nextLine());
			sum += num;
			System.out.println("출력: " + sum);
		}
		*/
		/*
		//예제4 1부터 사용자가 입력한 숫자까지 합계
		int sum = 0;
		for(int b=1; b<=100; b++) {
			System.out.println("숫자");
			int num = Integer.parseInt(scanner.nextLine());
			sum += b;
			if(b >= 1000) {
				break;
			}
			System.out.println("출력: " + sum);
		}
		*/
		
		//quiz
		//1
		
		/*
		for(int i=1;i<=5;i++){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			    System.out.println("");
	}
*/
		//2
		
		int count = 0;
		for(int m = 1; m<=100; m++) {
			if(m%2 != 0) {
				count++;
						continue;
			}
			System.out.println("m"+m);
		}
		
		//3
		
		
}
}