package com.yedam.java.app.emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
	// SQL 연결정보
	String jdbc_driver = "org.sqlite.JDBC";
	String jdbc_url = "jdbc:sqlite:/c:/DEV/workspace/YedamDataBase.db";
	// 각 메서드 공통 사용 필드
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	// 싱글톤
	private static EmpDAO instance = new EmpDAO();

	private EmpDAO() {
	}

	public static EmpDAO getInstance() {
		return instance;
	}

	// JDBC Driver 로딩
	// DB 서버 접속
	// => connect() 메서드
	public void connect() {
		try {
			Class.forName(jdbc_driver);

			conn = DriverManager.getConnection(jdbc_url);

		} catch (ClassNotFoundException e) {
			System.out.println("JDBC Driver 로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB 접속 실패");
		}
	}

	// 자원해제 => disconnect() 메서드
	public void disconnect() {
		try {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			System.out.println("정상적으로 자원이 해제되지 않았습니다.");
		}
	}
	// PreparedStatement 객체 생성
	// SQL 실행
	// 결과값 출력 or 연산
	// => 각 CRUD 메서드로 반복적으로 사용
	// 전체조회
	public List<Emp> selectAll(){
		List<Emp> list = new ArrayList<>();
		try {
			connect();
			
			String select = "SELECT * FROM emp13 ORDER BY employee_id";
			pstmt = conn.prepareStatement(select);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Emp em = new Emp();
				em.setEmployeeId(rs.getInt("employee_id"));
				em.setFirstName(rs.getString("first_name"));
				em.setJobId(rs.getString("job_id"));
				em.setSalary(rs.getInt("salary"));
				em.setCommissionPct(rs.getString("commission_pct"));
				em.setDepartmentName(rs.getString("department_name"));
				em.setLocationId(rs.getInt("location_id"));
				list.add(em);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}	
		return list;
	}
	// 단건조회
	public Emp selectOne(int employeeId) {
		Emp em = null;
		try {
			connect();
			String select = "SELECT * FROM emp13 WHERE employee_id = ? ";
			pstmt = conn.prepareStatement(select);
			pstmt.setInt(1, employeeId);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				em = new Emp();
				
				em.setEmployeeId(rs.getInt("employee_id"));
				em.setFirstName(rs.getString("first_name"));
				em.setJobId(rs.getString("job_id"));
				em.setSalary(rs.getInt("salary"));
				em.setCommissionPct(rs.getString("commission_pct"));
				em.setDepartmentName(rs.getString("department_name"));
				em.setLocationId(rs.getInt("location_id"));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return em;
	}
	// 등록
	public void insert(Emp em) {
		try {
			connect();
			String insert = "INSERT INTO emp13 VALUES (?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setInt(1, em.getEmployeeId());
			pstmt.setString(2, em.getFirstName());
			pstmt.setString(3, em.getJobId());
			pstmt.setInt(4, em.getSalary());
			pstmt.setString(5, em.getCommissionPct());
			pstmt.setString(6, em.getDepartmentName());
			pstmt.setInt(7, em.getLocationId());
			
			int result = pstmt.executeUpdate();
			
			System.out.println(result + "건이 등록되었습니다.");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
	}
	// 수정
	public void update(Emp em) {
		try {
			connect();
			String update = "UPDATE emp13 SET salary = ? WHERE employee_id = ? ";
			pstmt = conn.prepareStatement(update);
			pstmt.setInt(1, em.getSalary());
			pstmt.setInt(2, em.getEmployeeId());
			
			int result = pstmt.executeUpdate();
			
			System.out.println(result + "건이 수정되었습니다.");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
	}
	// 삭제
	public void delete(int employeedId) {
		try {
			connect();
			String delete = "DELETE FROM emp13 WHERE employee_id = ? ";
			pstmt = conn.prepareStatement(delete);
			pstmt.setInt(1, employeedId);
			
			int result = pstmt.executeUpdate();
			
			System.out.println(result + "건이 삭제되었습니다.");
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
}
