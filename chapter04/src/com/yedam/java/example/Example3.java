package com.yedam.java.example;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// 1부터 10사이의 임의의 숫자를 발생시킵니다.
		// 총3번의 기회가 있고 
		// 기회 내에 미성공 시 프로그램 종료
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int num = (int)(Math.random( )*10)+1; // 1~10 랜덤숫자발생
		
		
		int n = Integer.parseInt(scanner.nextLine());
		for(int p = 1; p <=3; p++) {
			if(n<0 || n>10) {
				System.out.println("오답");
				p--;
				continue;
			}
			if ( n == num) {
				System.out.println("정답");
				break;
			}
		}
			
		
		
		
		

	}

}
