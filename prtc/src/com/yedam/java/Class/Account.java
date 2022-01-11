package com.yedam.java.Class;

public class Account {
	// 필드
	private String Name;
	private long balance;

	// 생성자
	Account(String Name) {
		this.Name = Name;
	}
	// 메소드

	public String getName() {
		return Name;
	}

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {

		this.balance += money;

	}

	public void withdraw(int money) {

		this.balance -= money;

	}

}
