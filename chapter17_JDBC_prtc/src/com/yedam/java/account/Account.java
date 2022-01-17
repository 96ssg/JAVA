package com.yedam.java.account;

public class Account {
	private String accountNo;
	private String accountOwner;
	private String accountPassword;
	private int accountBalance;
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountOwner() {
		return accountOwner;
	}
	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}
	public String getAccountPassword() {
		return accountPassword;
	}
	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountOwner=" + accountOwner + ", accountPassword="
				+ accountPassword + ", accountBalance=" + accountBalance + "]";
	}
	
	
}
