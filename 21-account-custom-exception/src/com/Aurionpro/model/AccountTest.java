package com.Aurionpro.model;

public class AccountTest {

	public static void main(String[] args) throws Insufficientexception {
		Account account = new Account(202, "Ajay", 20000);
		try {
			account.withdraw(40000);
		} catch (Insufficientexception e) {
			System.out.println(e.getMessage());
		}
	}

}
