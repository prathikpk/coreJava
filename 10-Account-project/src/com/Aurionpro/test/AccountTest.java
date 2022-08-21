package com.Aurionpro.test;

import com.Aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account accounts = new Account(10, "rajj", 7000.0);

		showwithdrawTrans(accounts.withdraw(3000), accounts);
		showdeposittrans(accounts.deposit(2000));
		// showAccountDetails(accounts);

	}

	private static void showdeposittrans(boolean deposit) {
		if (deposit) {
			System.out.println("deposit successful");
		} else {
			System.out.println("deposit unsuccessful");
		}

	}

	private static void showwithdrawTrans(boolean withdraw, Account accounts) {
		if (withdraw) {
			System.out.println("withdraw successful");
			showAccountDetails(accounts);
		} else {
			System.out.println("withdraw unsuccessful");
		}

	}

	private static void showAccountDetails(Account account) {
		System.out.println("---------------------------------");

		System.out.println("Account id : " + account.getId());
		System.out.println("account name: " + account.getName());
		System.out.println("account balance: " + account.getBalance());
	}

}
