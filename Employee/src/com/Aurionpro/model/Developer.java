package com.Aurionpro.model;

public class Developer extends Employee {
	public double Pa;
	public double Ot;
	double amount;

	public Developer(int empNumber, String empName, double basicSalary) {
		super(empNumber, empName, basicSalary);
		this.Pa = 0.3 * BasicSalary;
		this.Ot = 0.2 * BasicSalary;
	}
	
	@Override
	public double AnnualCtc() {
		amount = (Pa + Ot + BasicSalary) * 12;
		return amount;
	}

	public double getPa() {
		return Pa;
	}

	public double getOt() {
		return Ot;
	}


}
