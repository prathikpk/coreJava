package com.Aurionpro.model;

public class Employee {
	int id;
	String name;
	double Salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return Salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
	}

}
