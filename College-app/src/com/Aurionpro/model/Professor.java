package com.Aurionpro.model;

public class Professor extends Person implements ISalary {
	public double Basicsalary;
	public double hra;
	public double pa;
	double amount;

	public Professor(int id, String address, String dob, double basicsalary) {
		super(id, address, dob);
		this.hra = 0.5 * basicsalary;
		this.pa = 0.2 * basicsalary;
	}

	@Override
	public double calculateSalary() {
		amount = Basicsalary + hra + pa;
		return amount;

	}

}
