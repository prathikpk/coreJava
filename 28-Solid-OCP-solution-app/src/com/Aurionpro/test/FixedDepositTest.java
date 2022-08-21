package com.Aurionpro.test;

import com.Aurionpro.model.Diwali;
import com.Aurionpro.model.FixedDeposit;
import com.Aurionpro.model.Holi;
import com.Aurionpro.model.NewYear;

public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit fd1 = new FixedDeposit("Karan", 10000, 3, new Diwali());
		System.out.println(fd1.calculateSimpleInterest());
		FixedDeposit fd2 = new FixedDeposit("Karan", 10000, 3, new NewYear());
		System.out.println(fd2.calculateSimpleInterest());
		FixedDeposit fd3 = new FixedDeposit("Karan", 10000, 3, new Holi());
		System.out.println(fd3.calculateSimpleInterest());
	}

}
