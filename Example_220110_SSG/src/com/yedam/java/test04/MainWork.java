package com.yedam.java.test04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class MainWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run =true;
		Scanner scanner = new Scanner(System.in);
		String job = null;
		List<Work> list = new ArrayList<>();
		
		while(run) {
			System.out.println("===1.할일입력 | 2.전체조회 | 3.할일조회 | 4.할일완료 | 5.종료 ===");
			System.out.println("선택>");
			int menuNo = Integer.parseInt(scanner.nextLine());
			switch (menuNo) {
			case 1:
				System.out.print("할 일>");
				job = scanner.nextLine();
				Work work = new Work(job);
				list.add(work);
				break;
			case 2:
				
				for(Work workTemp : list) {
					String isfin = "미완료";
					//if(bookTemp.isRental())
						//isRental = "대여중";
					System.out.println(workTemp.getJobNo() + " " + workTemp.getJob() + 
							" " + (workTemp.isFin() ? "완료" : "미완료"));
					
				}
				break;
			case 3:
				System.out.println("할 일 조회");
				for(Work workTemp : list) {
				
					if(workTemp.isFin()==false)
					System.out.println(workTemp.getJob() + " 미완료 ");
							
				}
				break;
			case 4:
				System.out.print("완료할 할 일을 선택해주세요>");
				job = scanner.nextLine();
				
				for(Work workTemp : list) {
					if(workTemp.getJob().equals(job)) {
						if(workTemp.isFin()) {
							System.out.println("해당 할 일은 이미 완료되었습니다.");
						}else {
							workTemp.setFin(true);
							System.out.println("해당 할 일을 완료처리하였습니다..");
						}
					}
				}
				break;
			case 5:
				run = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			
			}
		}
	}

}
