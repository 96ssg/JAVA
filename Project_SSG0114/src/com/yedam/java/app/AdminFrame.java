package com.yedam.java.app;

import java.text.SimpleDateFormat;
import java.util.Date;
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

public class AdminFrame {
	private UserDAO udao = UserDAOImpl.getInstance();
	private BookDAO dao = BookDAOImpl.getInstance();
	private Scanner scanner = new Scanner(System.in);
	private NoticeDAO ndao = NoticeDAOImpl.getInstance();
	Book book = null;

	public AdminFrame() {
		while (true) {
			// 메뉴출력
			menuPrint();
			// 메뉴선택
			int menuNo = menuSelect();
			// 각 메뉴별로 기능 실행
			if (menuNo == 1) {
				// 회원삭제
				adminbook();
			} else if (menuNo == 2) {
				// 전체조회
				selectAllbook();
			}else if (menuNo == 3) {
				// 책 등록
				insertbook();
			} else if (menuNo == 4) {
				// 책 삭제
				deletebook();
			} else if (menuNo == 5) {
				// 공지사항
				noticebook();
			} else if (menuNo == 6) {
				// 종료
				end();
				break;
			}
		}
	}

	// 1111111111111111111111111111
	public void menuPrint() {
		System.out.println("==========관리자모드===========");
		System.out.println(
				"=== 1.회원삭제 | 2.전체조회 | 3. 책 등록 | 4. 책 삭제 | 5.공지사항@ | 6.로그아웃===");
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
		Notice notice = inputNoticeInfo();
		ndao.insert(notice);
	}

	public void selectAllbook() {
		System.out.println("==admin 전체 도서 목록 조회 ==");
		List<Book> list = dao.selectAll();
		for (Book book : list) {
			System.out.println(book);
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

	public void adminbook() {
		
		List<User> list = udao.selectAll();
		for(User user : list) {
			System.out.println(user);
		}
		String userName = inputUserName();
		
		
		if(udao.selectUser(userName) != null) {
			udao.delete(userName);
		}else {
			System.out.println("해당 회원 정보가 존재하지 않습니다.");
		}
		
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
	public Notice inputNoticeInfo() {
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy년 MM월dd일 HH시mm분ss초"); 
		Date time = new Date();
		String time1 = format1.format(time);
		Notice notice = new Notice();
		System.out.print("공지사항 추가>");
		notice.setStory(scanner.nextLine());
		notice.setTime(time1);
		
		
		return notice;
	}
	
}
