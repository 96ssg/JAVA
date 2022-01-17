package com.yedam.java.account;

import java.sql.SQLException;

import com.yedam.java.common.DAO;

public class AccountDAOImpl extends DAO implements AccountDAO {

	// 싱글톤 설정
	private static AccountDAO instance = new AccountDAOImpl();

	private AccountDAOImpl() {
	}

	public static AccountDAO getInstance() {
		return instance;
	}

	// 실행 메소드
	@Override
	public void createaccount(Account act) {
		// TODO Auto-generated method stub
		try {
			connect();
			if (act.getAccountBalance() < 1) {

				String insert = "INSERT INTO account VALUES (?,?,?,?) ";
				pstmt = conn.prepareStatement(insert);
				pstmt.setString(1, act.getAccountNo());
				pstmt.setString(2, act.getAccountOwner());
				pstmt.setString(3, act.getAccountPassword());
				pstmt.setInt(4, act.getAccountBalance());

				int result = pstmt.executeUpdate();

				System.out.println(result + "생성된 계좌가 등록되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public Account Balanceinquiry(String accountNo, String accountPassword) {
		Account act = null;
		act = new Account();
		try {
			connect();
			String select = "SELECT * FROM emp13 WHERE employee_id = ?  ";
			pstmt = conn.prepareStatement(select);
			pstmt.setString(1, act.getAccountNo());

			rs = pstmt.executeQuery();
			if (rs.next()) {
				

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return act;
	}

	@Override
	public void deposit(Account act) {
		// TODO Auto-generated method stub

	}

	@Override
	public void withdraw(Account act) {
		// TODO Auto-generated method stub

	}

	@Override
	public void transfer() {
		// TODO Auto-generated method stub

	}

}
