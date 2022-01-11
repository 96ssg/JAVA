package prtc;

import java.util.Scanner;

public class prtc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1
		String tree= "";
for(int i=1; i<=5; i++) {
	tree = tree + "*";
	System.out.println(tree);
}
//2
int count = 0;
for(int i=1; i<=100; i++) {
	if(i%2 == 0) {
	continue;		
	}
	count++;
}
	System.out.println(count);
	
	//3
	Qutter : for(int x=1; x<=10; x++) {
		for(int y=1; y<=10; y++) {
			if(4*x+5*y == 60) {
				System.out.printf("(%d,%d)\n",x,y);
				break Qutter;
			}
		}
	}
	//4
	int value = 0;
	do {
		value = (int)(Math.random() * 10) + 1;
		
	}while(value != 7);
	
	//5
	int totalCount = 0;
	while(true) {
		int x = (int)(Math.random()*6)+1;
		int y = (int)(Math.random()*6)+1;
		totalCount++;
		int result = x + y;
		if(result == 5) {
			System.out.printf("(%d,%d)\n",x,y);
			System.out.println("주사위를 던진 횟수 :" + totalCount);
			break;
		}
		System.out.println();
		
	}
	
	//161p 7번
	boolean run = true;
	int balance = 0 ;
	Scanner scanner = new Scanner(System.in);
	
	while(run) {
		System.out.println("-----------------");
		System.out.println("1.예금 || 2.출금 || 3.잔고 || 4.종료");
		System.out.println("-----------------");
		System.out.print("선택> ");
		int menuNo = Integer.parseInt(scanner.nextLine());
		
		switch(menuNo) {
		case 1:
			System.out.print("예금액>");
			balance += Integer.parseInt(scanner.nextLine());
			break;
        case 2:
        	System.out.print("출금액<");
        	balance -= Integer.parseInt(scanner.nextLine());
			break;
        case 3:
        	System.out.print("잔고>"+balance);
	        break;
        case 4:
	
	        break;
	
		}
		
			
	}
	}

}
