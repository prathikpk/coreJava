package com.Aurionpro.model;

public class Invoice {
	Product p;
	static double TotalCartBill;

	public static double getTotalCartBill() {
		return TotalCartBill;
	}

	public Invoice(Product product) {
		super();
		this.p = product;
		Invoice.TotalCartBill = calculatebill();
	}

	private double calculatebill() {
		return TotalCartBill += calculateTotal();
	}

	public double calculateDiscount() {
		return (p.amount * p.discount) / 100;

	}

	public double calculateTotal() {
		return (p.amount + this.calculateTax()) - this.calculateDiscount();

	}

	public double calculateTax() {
		return (p.amount * p.tax) / 100;
	}

	public void printinvoice() {
		System.out.println("Product Name:"+p.getProduct());
		System.out.println("Discount on product is:" + calculateDiscount());
		System.out.println("Total tax on product is:" + calculateTax());
		System.out.println("Total cost of product is:" + calculateTotal());
		System.out.println("  ");
	}
}
