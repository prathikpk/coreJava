package com.Aurionpro.model;

public class Product {
	public String product;
	public int Id;
	public double amount;
	public double discount;
	public float tax;

	public Product(String product, int id, double amount, double discount, float tax) {
		super();
		this.product = product;
		Id = id;
		this.amount = amount;
		this.discount = discount;
		this.tax = tax;

	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getId() {
		return Id;
	}

	public double getAmount() {
		return amount;
	}

	public double getDiscount() {
		return discount;
	}

	public float getTax() {
		return tax;
	}

	public void printInvoice() {
		Invoice inv = new Invoice(this);
		inv.printinvoice();
	}

	@Override
	public String toString() {
		return "Product [product=" + product + ", Id=" + Id + ", amount=" + amount + ", discount=" + discount + ", tax="
				+ tax + "]";
	}

}
