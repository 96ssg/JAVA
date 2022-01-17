package com.yedam.java.account;

public interface AccountDAO {
	public void createaccount(Account act); // 계좌개설
	
	public Account Balanceinquiry(String accountNo, String accountPassword); //잔액조회
	
	public void deposit(Account act); //입금
	
	public void withdraw(Account act); // 출금
	
	public void transfer(); // 이체
	
	
	
}
