package com.yedam.java.app;

import java.util.Scanner;

import com.yedam.java.user.User;
import com.yedam.java.user.UserDAO;
import com.yedam.java.user.UserDAOImpl;

public class MainBook {
	static Scanner scanner = new Scanner(System.in);
	private UserDAO udao = UserDAOImpl.getInstance();

	public static void main(String[] args) {
		boolean run = true;

		// 로그인 메뉴
		while (true) {
			menuPrint();

			int menuNo = menuSelect();

			if (menuNo == 1) {
				insertUser(); // 회원가입
			} else if (menuNo == 2) {
				loginUser(); // 로그인
			} else if (menuNo == 3) {
				end(); // 종료
				break;
			}

		}
		// TODO Auto-generated method stub

	}

	public static void menuPrint() {
		System.out.println();
		System.out.println("=== 1.회원가입 | 2.로그인 | 3.종료 ===");
		System.out.println("선택>");
	}

	public static int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(scanner.nextLine());
		} catch (Exception e) {
			System.out.println("없는 메뉴입니다.");
		}
		return menuNo;
	}

	public static void insertUser() {
		User user = inputUserInfo();

		UserDAOImpl.getInstance().insert(user);
	}

	public static void loginUser() {
		User user = inputLoginInfo();
		User loginUser = UserDAOImpl.getInstance().selectUserInfo(user.getUserId(),user.getUserPassword());
		

		if (loginUser == null) {
			System.out.println("회원정보가 없습니다.");
		} else if (loginUser.getUserRun() == 1) {
			// 관리자일때 실행하는 메뉴
			new AdminFrame();
			
		} else if (loginUser.getUserRun() == 0) {
			// 일반 회원일때 실행하는 메뉴
			new BookFrame();
			
		}
	}

	public static void end() {
		System.out.println("종료");
	}

	public static User inputUserInfo() {
		User user = new User();
		System.out.print("회원이름>");
		user.setUserName(scanner.nextLine());
		System.out.print("회원ID>");
		user.setUserId(scanner.nextLine());
		System.out.print("회원PASSWORD>");
		user.setUserPassword(Integer.parseInt(scanner.nextLine()));
		return user;
	}
	public static User inputLoginInfo() {
		User user = new User();
		System.out.print("회원ID>");
		user.setUserId(scanner.nextLine());
		System.out.print("회원PASSWORD>");
		user.setUserPassword(Integer.parseInt(scanner.nextLine()));
		return user;
	}
}
