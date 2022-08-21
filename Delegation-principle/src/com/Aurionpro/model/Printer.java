package com.Aurionpro.model;

public class Printer {

	DelegationPrinter dprinter = new DelegationPrinter();

	public void print() {
		dprinter.print();
	}
}
