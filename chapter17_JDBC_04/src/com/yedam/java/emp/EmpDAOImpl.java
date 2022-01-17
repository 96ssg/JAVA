package com.yedam.java.emp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.java.common2.DAO;

public class EmpDAOImpl extends DAO implements EmpDAO {
	// 싱글톤
	private static EmpDAO instance = new EmpDAOImpl();

	private EmpDAOImpl() {
	}

	public static EmpDAO getInstance() {
		return instance;
	}

	@Override
	public List<Emp> selectAll() {
		List<Emp> list = new ArrayList<>();
		try {
			connect();
			String select = "SELECT * FROM emp13 ORDER BY employee_id";
			pstmt = conn.prepareStatement(select);
			rs = pstmt.executeQuery();
			while (rs.next()) {
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
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	@Override
	public Emp selectOne(int employeeId) {
		Emp em = null;
		try {
			connect();
			String select = "SELECT * FROM emp13 WHERE employee_id = ?  ";
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

	@Override
	public void insert(Emp em) {
		try {
			connect();
			String insert = "INSERT INTO emp13 VALUES (?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setInt(1, em.getEmployeeId());
			pstmt.setString(2, em.getFirstName() );
			pstmt.setString(3, em.getJobId());
			pstmt.setInt(4, em.getSalary());
			pstmt.setString(5, em.getCommissionPct());
			pstmt.setString(6, em.getDepartmentName());
			pstmt.setInt(7, em.getEmployeeId());
			
			int result = pstmt.executeUpdate();
			
			System.out.println(result + "건이 등록되었습니다.");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
	}

	@Override
	public void update(Emp em) {
		try {
			connect();
			String update = "UPDATE emp13 SET first_name = ? WHERE employee_id = ?";
			pstmt = conn.prepareStatement(update);
			pstmt.setString(1, em.getFirstName());
			pstmt.setInt(2, em.getEmployeeId());
			
			int result = pstmt.executeUpdate();
			
			System.out.println(result + "건이 수정되었습니다.");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}

	@Override
	public void delete(int employeeId) {
		try {
			connect();
			String delete = "DELETE FROM emp13 WHERE employee_id = ? ";
			pstmt = conn.prepareStatement(delete);
			pstmt.setInt(1, employeeId);
			
			int result = pstmt.executeUpdate();
			
			System.out.println(result + "건이 삭제되었습니다.");
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

}
