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
}
