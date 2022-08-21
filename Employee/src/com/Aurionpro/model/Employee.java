package com.Aurionpro.model;

public abstract class Employee {

	public int EmpNumber;
	public String EmpName;
	public double BasicSalary;

	public Employee(int empNumber, String empName, double basicSalary) {
		super();
		EmpNumber = empNumber;
		EmpName = empName;
		BasicSalary = basicSalary;
	}

	public int getEmpNumber() {
		return EmpNumber;
	}

	public String getEmpName() {
		return EmpName;
	}

	public double getBasicSalary() {
		return BasicSalary;
	}

	public abstract double AnnualCtc();

	@Override
	public String toString() {
		return "Employee [EmpNumber=" + EmpNumber + ", EmpName=" + EmpName + ", BasicSalary=" + BasicSalary + "]";
	}
	

}
