package com.Aurionpro.model;

public class Manager extends Employee {
	public double hra;
	public double Da;
	public double Ta;
	double amount;

	public Manager(int empNumber, String empName, double basicSalary) {
		super(empNumber, empName, basicSalary);
		this.hra = 0.1 * BasicSalary;
		this.Da = 0.2 * BasicSalary;
		this.Ta = 0.3 * BasicSalary;
	}

	@Override
	public double AnnualCtc() {
		amount = (BasicSalary + hra + Da + Ta) * 12;
		return amount;
	}

	public double getHra() {
		return hra;
	}

	public double getDa() {
		return Da;
	}

	public double getTa() {
		return Ta;
	}

}
