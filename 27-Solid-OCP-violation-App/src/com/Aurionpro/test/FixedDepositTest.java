package com.Aurionpro.test;

import com.Aurionpro.model.FestivalType;
import com.Aurionpro.model.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit fd1 = new FixedDeposit("Ajay", 10000, 2, FestivalType.CHRISTMAS);
		System.out.println(fd1.calculateSimpleInterest());
		FixedDeposit fd2 = new FixedDeposit("jay", 30000, 3, FestivalType.DIWALI);
		System.out.println(fd2.calculateSimpleInterest());
		FixedDeposit fd3 = new FixedDeposit("Vijay", 30000, 3, FestivalType.OTHER);
		System.out.println(fd3.calculateSimpleInterest());
	}

}
