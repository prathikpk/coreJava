package com.Aurionpro.model;

public class Accountant extends Employee {
	public double Perks;
	double amount;

	public Accountant(int empNumber, String empName, double basicSalary) {
		super(empNumber, empName, basicSalary);
		this.Perks = 0.5 * BasicSalary;
	}

	@Override
	public double AnnualCtc() {
		amount = (Perks + BasicSalary) * 12;
		return amount;
	}

	public double getPerks() {
		return Perks;
	}

}
