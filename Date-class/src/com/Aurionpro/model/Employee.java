package com.Aurionpro.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	public String Name;
	public int Id;
	public double Salary;
	public Date JoiningDate;

	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	public Employee(String name, int id, double salary, String Date) throws ParseException {
		super();
		Name = name;
		Id = id;
		Salary = salary;
		this.JoiningDate = df.parse(Date);//to convert string to date
	}

	public String getJoiningDate() {
		String date = df.format(JoiningDate);
		return date;
	}

	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Id=" + Id + ", Salary=" + Salary + ", JoiningDate=" + JoiningDate + "]";
	}

}
