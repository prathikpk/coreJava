package com.Aurionpro.model;

public class InvoicePrinter {
	public void printinvoice(Invoice in) {
		System.out.println("Tax:" + in.calculateTax());
		System.out.println("Discount:" + in.calculateDiscount());
		System.out.println("total cost:" + in.calculateTotal());
	}

}
