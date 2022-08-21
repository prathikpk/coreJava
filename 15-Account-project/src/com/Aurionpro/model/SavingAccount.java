package com.Aurionpro.model;

public class SavingAccount extends Account {
	double Minimum_Balance = 5000;

	public SavingAccount(int id, String name, Double balance) {
		super(id, name, balance);
	}

	@Override
	public void withdraw(double amount) {
		if (this.getBalance() - amount < 5000) {
			System.out.println(("insufficient balance"));
		}else {
			this.setBalance(this.getBalance()-amount);
		}
		
	}

}
