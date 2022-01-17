package com.yedam.java.app.emp;

import java.util.List;
import java.util.Scanner;

public class EmpApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		EmpDAO dao = EmpDAO.getInstance();

		Emp em = null;
		int employeeId = 0;

		while (run) {
			System.out.println();
			System.out.println("=== 1.등록 2.수정 3.삭제 4.사원조회 5.전체조회 9.종료 ===");
			System.out.println("선택>");
			int menuNo = scanner.nextInt();

			switch (menuNo) {
			case 1:
				em = new Emp();
				System.out.print("사번>");
				em.setEmployeeId(scanner.nextInt());
				System.out.print("이름>");
				em.setFirstName(scanner.next());
				System.out.print("직급>");
				em.setJobId(scanner.next());
				System.out.print("연봉>");
				em.setSalary(scanner.nextInt());
				System.out.print("상여>");
				em.setCommissionPct(scanner.next());
				System.out.print("부서이름>");
				em.setDepartmentName(scanner.next());
				System.out.print("위치>");
				em.setLocationId(scanner.nextInt());
				
				
				dao.insert(em);
				break;
			case 2:
				em = new Emp();
				System.out.print("사번>");
				em.setEmployeeId(scanner.nextInt());
				System.out.print("연봉>");
				em.setSalary(scanner.nextInt());
				
				dao.update(em);
				break;
			case 3:
				System.out.print("사번>");
				employeeId = scanner.nextInt();
				
				dao.delete(employeeId);
				break;
			case 4:
				System.out.print("사번>");
				employeeId = scanner.nextInt();
				em = dao.selectOne(employeeId);
				System.out.println(em);
				break;
			case 5:
				List<Emp> list = dao.selectAll();
				for(Emp emp : list) {
					System.out.println(emp);
				}
				break;
			case 9:
				run = false;
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}
