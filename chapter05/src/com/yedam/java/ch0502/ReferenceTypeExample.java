package com.yedam.java.ch0502;

public class ReferenceTypeExample {

	public static void main(String[] args) {
		// 값을 이용하여 배열 생성
		int[] scores = {83,90,87};
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);

		for(int i=0; i<3; i++) {
			System.out.println(scores[i]);
		}
		
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
			
		}
		System.out.println("총합 : "+ sum);
		double avg = (double)sum / 3;
		System.out.println("평균 : "+ avg);
		
		//값을 이용해서 배열생성2
		int[] scores1;
		scores1 = new int[] {83,90,87};
		
		int sum1 = 0;
		for(int i = 0; i<3; i++) {
			sum1 += scores1[i];		
		}
		System.out.println("총합 : " + sum1);
		
		int sum2 = add(new int[]{83,90,87});
		System.out.println("총합 : " + sum2);
		
		//new 연산자로 배열생성
		int[] arr1 = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr1["+i+"] : " + arr1[i]);
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int i=0; i<3; i++) {
			System.out.println("arr1["+i+"] : "+arr1[i]);
		}
		
		String[] arr2 = new String[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr2["+i+"]:"+arr2[i]);
		}
		
		arr2[0] = "1월";
		arr2[1] = "2월";
		arr2[2] = "3월";
		for(int i=0; i<3; i++) {
			System.out.println("arr2["+i+"]:"+arr2[i]);
		}
	}
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
	return sum;
	}
	

}
