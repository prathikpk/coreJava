package com.Aurionpro.model;

public class InvoicePrinter {
	private Product p;
	Invoice in=new Invoice(p);
	public void printinvoice() {
		System.out.println("Product Name:"+p.getProduct());
		System.out.println("Discount on product is:" + in.calculateDiscount());
		System.out.println("Total tax on product is:" + in.calculateTax());
		System.out.println("Total cost of product is:" + in.calculateTotal());
		System.out.println("  ");
	}

}
