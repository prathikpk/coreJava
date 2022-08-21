package com.Aurionpro.test;

import com.Aurionpro.model.Account;
import com.Aurionpro.model.CurrentAccount;
import com.Aurionpro.model.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {
		SavingAccount saveac = new SavingAccount(10, "raj", 10000.0);
		showAccountDetails(saveac);
		saveac.deposit(5000);
		saveac.withdraw(1000);
		showAccountDetails(saveac);
		System.out.println("----------------------------");
		CurrentAccount current = new CurrentAccount(10, "ram", 20000.0);
		current.withdraw(30000);
		showAccountDetails(current);
		saveac.withdraw(10000);
		showAccountDetails(current);

	}

	private static void showAccountDetails(Account account) {
		System.out.println("---------------------------------");

		System.out.println("Account id : " + account.getId());
		System.out.println("account name: " + account.getName());
		System.out.println("account balance: " + account.getBalance());
	}

}
