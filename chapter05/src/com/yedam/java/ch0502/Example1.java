package com.yedam.java.ch0502;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// 예제1 - 주어진 배열 안의 값을 전부 더하고 합과 평균을 출력해보시오
		int[] arr1 = {10,20,30,50,3,60,-5};
		int sum = 0;
		for(int i=0; i<7; i++) {
			sum += arr1[i];
			
		}
		System.out.println("총합 : "+ sum);
		double avg = (double)sum / 7; // arr1.length;로 입력해도됌 length=배열 전체
		System.out.println("평균 : "+ avg);
		
		// 예제2 - 주어진 배열 안의 값을 출력하는데
		// 인덱스가 2의 배수인 경우만 출력한다.
		for(int i=0; i<7; i++) {
			if(arr1[i]%2 == 0) {
				System.out.println(arr1[i]);
			}	
		}
		System.out.println();
		// 예제3 - 인덱스번호 2개를 입력받아, 그 값을 서로 바꿔보세요. *교체하려면 임시변수 필요!
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 인덱스:");
		int index1 = scanner.nextInt();
		System.out.println("두번째 인덱스:");
		int index2 = scanner.nextInt();
		
		int temp = arr1[index1];
		arr1[index1] = arr1[index2];
		arr1[index2] = temp;
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]+" ");
		}
	}

}
