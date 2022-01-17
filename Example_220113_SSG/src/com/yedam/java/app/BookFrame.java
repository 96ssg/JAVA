package com.yedam.java.app;

import java.util.List;
import java.util.Scanner;

import com.yedam.java.book.Book;
import com.yedam.java.book.BookDAO;
import com.yedam.java.book.BookDAOImpl;

public class BookFrame {
	private BookDAO bkDAO = BookDAOImpl.getInstance();
	private Scanner scanner = new Scanner(System.in);

	Book bk = null;

	public BookFrame() {
		while (true) {
			// 메뉴출력
			menuPrint();
			// 메뉴선택
			int menuNo = menuSelect();
			// 각 메뉴별로 기능 실행
			if (menuNo == 1) {
				// 전체조회
				selectAll();
			} else if (menuNo == 2) {
				// 단건조회
				selectbook();
			} else if (menuNo == 3) {
				// 내용검색
				selectbookInfo();
			} else if (menuNo == 4) {
				// 대여가능
				rental();
			} else if (menuNo == 5) {
				// 책 대여
				rentalbook();
			} else if (menuNo == 6) {
				// 책 반납
				returnbook();
			} else if (menuNo == 7) {
				// 책 등록
				insertbook();
			} else if (menuNo == 9) {
				// 종료
				end();
				break;
			}
		}
	}

	public void menuPrint() {
		System.out.println();
		System.out.println("===1.전체조회 | 2.단건조회 | 3.내용검색 | 4.대여가능 | 5.책 대여 | 6.책 반납 | 7.책 등록 | 9.종료===");
		System.out.println("선택>");
	}

	public int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(scanner.nextLine());
		} catch (Exception e) {
			System.out.println("없는 메뉴입니다.");
		}
		return menuNo;
	}

	public void selectAll() {
		List<Book> list = bkDAO.selectAll();

		for (Book bk : list) {
			System.out.println(bk);
		}
	}

	public void selectbook() {
		String bookName = scanner.nextLine();

		Book bk = bkDAO.selectbook(bookName);

		if (bk == null) {
			System.out.println("해당 책 정보가 존재하지 않습니다.");
		} else {
			System.out.println(bk);
		}
	}

	public void selectbookInfo() {
		String bookName = scanner.nextLine();
		String bookContent = bk.getBookContent();
		Book bk = bkDAO.selectbook(bookContent);

		if (bk == null) {
			System.out.println("해당 책 요약이 존재하지 않습니다.");
		} else {
			System.out.println(bk);
		}
	}

	public void rental() {
		List<Book> list = bkDAO.selectAll();
		String bookName = scanner.nextLine();
		for (Book bk : list) {
			if (bk.getBookName().equals(bookName)) {
				System.out.println(bk.getBookName() + " " + bk.getBookWriter() + " "
						+ (bk.getBookRental(1) ? "대여중" : "대여가능"));
			}
		}
	}

	public void rentalbook() {
		List<Book> list = bkDAO.selectAll();
		String bookName = scanner.nextLine();
		int a = Integer.parseInt("1");
		int b = Integer.parseInt("2");
		for(Book bk : list) {
			if(bk.getBookName().equals(bookName)) {
				if(bk.getBookRental(1)) {
					System.out.println("해당 책은 대여중입니다.");
				}else {
					bk.getBookRental(2);
					System.out.println("대여되었습니다.");
				}
			}
		}
	}

	public void returnbook() {
		List<Book> list = bkDAO.selectAll();
		String bookName = scanner.nextLine();
		for (Book bk : list) {
			if (bk.getBookName().equals(bookName)) {
				bk.setBookRental(1);
				System.out.println("반납되었습니다.");
			}
		}
	}

	public void insertbook() {
		Book bk = inputBkInfo();

		bkDAO.insertbook(bk);
	}

	public void end() {
		System.out.println("프로그램 종료");
	}

	public Book inputBkInfo() {
		bk = new Book();
		System.out.print("책 이름");
		bk.setBookName(scanner.nextLine());
		System.out.print("저자명");
		bk.setBookWriter(scanner.nextLine());
		System.out.print("책 내용");
		bk.setBookContent(scanner.nextLine());
		return bk;
	}

	public Book inputBkName() {
		bk = new Book();
		System.out.print("책 이름");
		bk.setBookName(scanner.nextLine());
		return bk;
	}
}
