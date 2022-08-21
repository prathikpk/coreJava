package com.Aurionpro.model;

public class Account {

	private int accountNo;
	private String name;
	private double balance;

	public Account(int accountNo, String name, double balance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) throws Insufficientexception {
		if (amount > balance) {
			throw new Insufficientexception("insufficient fund");
		} else {
			balance -= amount;
		}

	}

}
