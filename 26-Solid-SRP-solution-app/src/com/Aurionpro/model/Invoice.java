package com.Aurionpro.model;

public class Invoice {

	public String Id;
	public String Description;
	public double amount;
	public float tax;
	public double discountPercent;

	public Invoice(String id, String description, double amount, float tax, double discountPercent) {
		super();
		Id = id;
		Description = description;
		this.amount = amount;
		this.tax = tax;
		this.discountPercent = discountPercent;
	}

	public String getId() {
		return Id;
	}

	public String getDescription() {
		return Description;
	}

	public double getAmount() {
		return amount;
	}

	public float getTax() {
		return tax;
	}

	public double getDiscountPercent() {
		return discountPercent;
	}

	public double calculateTax() {

		return (amount * tax) / 100;

	}

	public double calculateDiscount() {
		return (amount * discountPercent) / 100;

	}

	public double calculateTotal() {
		return (amount + calculateTax()) - calculateDiscount();

	}

	public void printInvoice() {
		InvoicePrinter inv = new InvoicePrinter();
		inv.printinvoice(this);
	}

	@Override
	public String toString() {
		return "Invoice [Id=" + Id + ", Description=" + Description + ", amount=" + amount + ", tax=" + tax
				+ ", discountPercent=" + discountPercent + "]";
	}

}
