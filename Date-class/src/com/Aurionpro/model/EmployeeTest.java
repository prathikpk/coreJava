package com.Aurionpro.model;

import java.text.ParseException;

public class EmployeeTest {

	public static void main(String[] args) throws ParseException {
		Employee[] employee = { new Employee("Vikram", 101, 30000, "29/06/2021"),
				               new Employee("Karan", 102, 40000, "26/05/2020") 
				               };
		for (Employee emp : employee)
			printdetails(emp);
	}

	private static void printdetails(Employee emp) {
		System.out.println("Employee name:" + emp.Name);
		System.out.println("Employee ID:" + emp.Id);
		System.out.println("Employee Salary:" + emp.Salary);
		System.out.println("Employee Joining Date:" + emp.getJoiningDate());
		System.out.println("------------------------------------");
	}

}
