package com.Aurionpro.model;

public class LineItem {
	private int id;
	private String name;
	private int quantity;
	private double unitPrice;
	private double totalCost;
	private double totalPrice;

	public LineItem(int id, String name, int quantity, double unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public double calculateTotalPrice() {
		totalCost=quantity*unitPrice;
		return totalCost;
	}
	public double calculateTotalcartPrice() {
		totalPrice+=this.totalCost;
		return totalPrice;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LineItem other = (LineItem) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public double getTotalCost() {
		return totalCost;
	}

	
	public double getTotalPrice() {
		return totalPrice;
	}

	@Override
	public String toString() {
		return "LineItem [id=" + id + ", name=" + name + ", quantity=" + quantity + ", unitPrice=" + unitPrice
				+ ", totalCost=" + totalCost + "]";
	}
	
}
