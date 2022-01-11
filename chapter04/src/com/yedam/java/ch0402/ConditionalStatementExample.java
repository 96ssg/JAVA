package com.yedam.java.ch0402;

public class ConditionalStatementExample {

	public static void main(String[] args) {
		// for 문
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
        
		int z = 1;
		for(;z<=100; z++) {}
		
		for(int i=0, j=100;(i<=50) && (j>=50); i+=10, j--){}
		
		//1부터 100까지 더한 값 // 값 한번만 출력하려면 중괄호 밖에서 println
		
		int sum = 0;
		for(int i = 0; i<=100; i++) {
			sum += i;
		}
		System.out.println("1~100까지 더한 합계 : " + sum);
		
		sum = 0;
		int index = 0;
		for(index = 1; index<=100; index++) {
			sum += index;
		}
		System.out.println("sum : "+sum + ", index : " + index);
		
		for(int m=2; m<=9; m++) {
			System.out.println("***" + m +"단 ***");
			for(int n=1; n<=9; n++) {
				System.out.printf("%d X %d = %d\n", m, n, (m*n));
			}
		}
		
		System.out.println();
		//while 문
		int m = 1;
		while(m<=10) {
			System.out.println(m);
			m++;
		}
		
		sum =0;
		index =0;
		
		while(index<=100) {
			sum+=index;
			index++;
			
		}
		System.out.println("sum : " + sum+",index : " + index);

		index=1;
		while(index!=1) {
			System.out.println("while 반복문이" + index + "번 실행됩니다.");
		}
		
		do {
			System.out.println("do ~ while 반복문이" + index + "번 실행됩니다.");
		}while(index!=1);

		while(true) {
			int num = (int)(Math.random()*6) +1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		
		Qutter : for(char upper = 'A'; upper<='Z'; upper++) {
			for(char lower = 'a'; lower<='z'; lower++) {
				System.out.println(upper + "-" +lower);
				if(lower =='g') {
					break Qutter;
				}
			}
			System.out.println("2)안쪽 for문 종료");
		}
		System.out.println("2)바깥쪽 for문 종료");
		
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);
		}
}
}