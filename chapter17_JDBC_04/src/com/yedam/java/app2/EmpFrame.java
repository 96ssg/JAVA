package com.yedam.java.app2;

import java.util.List;
import java.util.Scanner;

import com.yedam.java.emp.Emp;
import com.yedam.java.emp.EmpDAO;
import com.yedam.java.emp.EmpDAOImpl;

public class EmpFrame {
	// 필드

	private EmpDAO emDAO = EmpDAOImpl.getInstance();
	private Scanner scanner = new Scanner(System.in);

	Emp em = null;

	public EmpFrame() {
		while (true) {
			// 메뉴출력
			menuPrint();
			// 메뉴선택
			int menuNo = menuSelect();
			// 각 메뉴별로 기능 실행
			if (menuNo == 1) {
				// 등록
				insertEmp();
			} else if (menuNo == 2) {
				// 수정
				updateEmp();
			} else if (menuNo == 3) {
				// 삭제
				deleteEmp();
			} else if (menuNo == 4) {
				// 단건조회
				selectOne();
			} else if (menuNo == 5) {
				// 전체조회
				selectAll();
			} else if (menuNo == 9) {
				// 종료
				end();
				break;
			}
		}
	}

	public void menuPrint() {
		System.out.println();
		System.out.println("===1.등록 2.수정 3.삭제 4.사원조회 5.전체조회 6.종료===");
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

	public void insertEmp() {
		// 부서정보 입력
		Emp em = inputemInfo();
		// 부서정보 등록
		emDAO.insert(em);
	}

	public void updateEmp() {
		// 부서정보 입력
		Emp em = inputemName();
		// 부서정보 등록
		emDAO.update(em);
	}

	public void deleteEmp() {
		int employeeId = inputemId();

		emDAO.delete(employeeId);
	}

	public void selectOne() {
		// 부서번호 입력
		int employeeId = inputemId();
		// 부서정보 조회
		Emp em = emDAO.selectOne(employeeId);
		// 부서정보 출력
		if (em == null) {
			System.out.println("해당 부서 정보가 존재하지 않습니다.");
		} else {
			System.out.println(em);
		}
	}

	public void selectAll() {
		// 전체 부서정보 조회
		List<Emp> list = emDAO.selectAll();
		// 전체 부서정보 출력
		for (Emp em : list) {
			System.out.println(em);
		}
	}

	public void end() {
		System.out.println("프로그램 종료");
	}

	public Emp inputemInfo() {
		em = new Emp();
		System.out.print("사원 ID>");
		em.setEmployeeId(Integer.parseInt(scanner.nextLine()));
		System.out.print("사원명>");
		em.setFirstName(scanner.nextLine());
		System.out.print("직급>");
		em.setJobId(scanner.nextLine());
		System.out.print("연봉>");
		em.setSalary(Integer.parseInt(scanner.nextLine()));
		System.out.print("상여>");
		em.setCommissionPct(scanner.nextLine());
		System.out.print("부서명>");
		em.setDepartmentName(scanner.nextLine());
		System.out.print("지역번호>");
		em.setLocationId(Integer.parseInt(scanner.nextLine()));

		return em;
	}

	public Emp inputemName() {
		Emp em = new Emp();
		System.out.print("사원 ID>");
		em.setEmployeeId(Integer.parseInt(scanner.nextLine()));
		System.out.print("부서명>");
		em.setDepartmentName(scanner.nextLine());
		return em;
	}

	public int inputemId() {
		int employeeId = 0;
		System.out.print("사원 ID>");
		employeeId = Integer.parseInt(scanner.nextLine());

		return employeeId;
	}
}
