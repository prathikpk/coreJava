package com.Aurionpro.model;

public class CurrentAccount extends Account {
	double OverDraft=50000;

	public CurrentAccount(int id, String name, Double balance) {
		super(id, name, balance);
	}
    @Override
	public void withdraw(double amount) {
		if (this.getBalance() - amount < -OverDraft) {
			System.out.println("insufficient balance");
		}
		else {
			this.setBalance(this.getBalance()-amount);
		}
	}

}
