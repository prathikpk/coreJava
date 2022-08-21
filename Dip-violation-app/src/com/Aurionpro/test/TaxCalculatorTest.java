package com.Aurionpro.test;

import com.Aurionpro.model.LogType;
import com.Aurionpro.model.TaxCalculator;

public class TaxCalculatorTest {
	public static void main(String args[]) {
		TaxCalculator tax = new TaxCalculator(LogType.FILE);
		System.out.println(tax.calculateTax(10000, 20));
	}

}
