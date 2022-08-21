package com.Aurionpro.test;

import com.Aurionpro.model.DBLogger;
//import com.Aurionpro.model.FileLogger;
import com.Aurionpro.model.TaxCalculator;

public class TaxCalulatorTest {

	public static void main(String[] args) {
		TaxCalculator tax = new TaxCalculator(new DBLogger());
		System.out.println(tax.calculateTax(10000, 10));
	}

}
