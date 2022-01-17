package com.yedam.java.app;

import java.util.List;
import java.util.Scanner;

import com.yedam.java.book.Book;
import com.yedam.java.book.BookDAO;
import com.yedam.java.book.BookDAOImpl;
import com.yedam.java.notice.Notice;
import com.yedam.java.notice.NoticeDAO;
import com.yedam.java.notice.NoticeDAOImpl;
import com.yedam.java.user.User;
import com.yedam.java.user.UserDAO;
import com.yedam.java.user.UserDAOImpl;

public class BookFrame {
	private BookDAO dao = BookDAOImpl.getInstance();
	private UserDAO udao = UserDAOImpl.getInstance();
	private Scanner scanner = new Scanner(System.in);
	private NoticeDAO ndao = NoticeDAOImpl.getInstance();
	Book book = null;

	public BookFrame() {
		while (true) {
			// 메뉴출력
			menuPrint();
			// 메뉴선택
			int menuNo = menuSelect();
			// 각 메뉴별로 기능 실행
			if (menuNo == 1) {
				// 공지사항
				noticebook();
			} else if (menuNo == 2) {
				// 전체조회
				selectAllbook();
			} else if (menuNo == 3) {
				// 단건조회
				selectOnebook();
			} else if (menuNo == 4) {
				// 책대여
				rentalbook();
			} else if (menuNo == 5) {
				// 책반납
				returnbook();
			} else if (menuNo == 6) {
				// 베스트셀러
				bestbook();
			} else if (menuNo == 7) {
				// 개인대여순위
				rollbook();
			} else if (menuNo == 8) {
				// 종료
				end();
				break;
			}
		}
	}

	// 1111111111111111111111111111
	public void menuPrint() {
		System.out.println("==========일반회원 메뉴===========");
		System.out.println("=== 1.공지사항 | 2.전체 도서 조회 | 3.단건 도서 조회 | 4.도서 대여 | 5.도서 반납 | 6.베스트셀러 | 7. 독서킹 | 8.로그아웃===");
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

	
		public void noticebook() {
			System.out.println("*/*/*/공지사항/*/*/*");
			List<Notice> list = ndao.select();
			for(Notice notice : list) {
				System.out.println(notice);
			}
		}
	

	public void selectAllbook() {
		List<Book> list = dao.selectAll();
		for (Book book : list) {
			System.out.println(book);
		}
	}

	public void selectOnebook() {
		// 책 제목 입력
		String bookName = inputBookName();

		Book book = dao.selectBook(bookName);

		if (book != null) {
			System.out.println(book);
		} else {
			System.out.println("해당 책 정보가 존재하지 않습니다.");
		}
	}

	public void rentalbook() {

		// 책 제목 입력
		String bookName = inputBookName();
		String userName = inputUserName();
		// 해당 북 정보 조회
		Book book = dao.selectBook(bookName);
		User user = udao.selectUser(userName);
		// 대여여부 확인
		if (book != null) {
			if (book.getBookRental() == 1) {
				// 대여가 된 경우 별도 안내문구
				System.out.println("해당 책은 대여 중입니다.");
			} else {
				// 대여가 안된 경우 대여처리
				book.setBookRental(1);
				
				System.out.println("대여되었습니다.");
				dao.update(book);
				dao.update2(book);
				udao.update(user);
			}
		} else {
			System.out.println("해당 책 정보가 존재하지 않습니다.");
		}
	}

	public void returnbook() {
		// 책 제목 입력
		String bookName = inputBookName();
		// 해당 책 정보확인
		Book book = dao.selectBook(bookName);

		if (book != null) {
			book.setBookRental(0);
			System.out.println("반납되었습니다.");
			dao.update(book);
		} else {
			System.out.println("해당 책 정보가 존재하지 않습니다.");
		}
	}

	public void bestbook() {
		List<Book> list = dao.selectRoll();
		for (Book book : list) {
			System.out.println(" 도서명 : " + book.getBookName() + " , 대여횟수 : " +book.getBookRoll());
		}
	}
	public void rollbook() {
		List<User> list = udao.selectAll();
		for (User user : list) {
			System.out.println(" 회원이름 : " + user.getUserName() + " , 대여횟수 : " + user.getUserRoll());
		}
	}

	public void insertbook() {
		Book book = inputBookInfo();
		dao.insert(book);
	}

	public void deletebook() {
		String bookName = inputBookName();

		dao.delete(bookName);
	}


	public void end() {
		System.out.println("프로그램 종료");
	}

	public String inputBookName() {
		System.out.print("책제목>");
		return scanner.nextLine();
	}

	public Book inputBookInfo() {
		Book book = new Book();
		System.out.print("책제목>");
		book.setBookName(scanner.nextLine());
		System.out.print("저자명>");
		book.setBookWriter(scanner.nextLine());
		System.out.print("책내용>");
		book.setBookContent(scanner.nextLine());

		return book;
	}
	public String inputUserName() {
		System.out.print("회원이름>");
		return scanner.nextLine();
	}
}
