package homework0107;

import java.util.Scanner;

import homework0110.Library;

public class Example_Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		String name = null;
		String writer = null;
		Library library = new Library();

		while (run) {
			System.out.println("===1.책정보 입력 | 2.전체조회 | 3.단건조회 | 4.책 대여 | 5.책 반납 | 6.종료===");
			System.out.println("선택>");

			int menuNo = Integer.parseInt(scanner.nextLine());

			switch (menuNo) {
			case 1:
				System.out.print("첵제목>");
				name = scanner.nextLine();
				System.out.print("저자명>");
				writer = scanner.nextLine();
				Book book = new Book(name,writer);
				list.add(book);
				break;
			case 2:
				System.out.println("책번호 책제목 저자명 대여여부");
				library.printBookList();
				break;
			case 3:
				System.out.print("첵제목");
				name = scanner.nextLine();
				System.out.println("책번호 책제목 저자명 대여여부");
				library.selectBookInfo(name);
				break;
			case 4:
				System.out.print("책제목>");
				name = scanner.nextLine();
				
				for(Book bookTemp : list) {
					if(bookTemp.getBookName().equals(name)) {
						if(bookTemp.isRental()) {
							System.out.println("해당 책은 대여중입니다.");
						}else {
							bookTemp.setRental(true);
							System.out.println("대여되었습니다.");
						}
					}
				}
				break;
			case 5:
				System.out.print("책제목>");
				name = scanner.nextLine();
				library.
				break;
			case 6:
				run = false;
				System.out.println("프로그램 종료");
				break;
			}

		}
	

	}

}
