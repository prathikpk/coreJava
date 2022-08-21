package com.Aurionpro.test;

import com.Aurionpro.model.Accountant;
import com.Aurionpro.model.Developer;
import com.Aurionpro.model.Employee;
import com.Aurionpro.model.Manager;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Manager(100, "Ajay", 30000.0);
		printdetails(emp);

		Employee empl = new Accountant(101, "Raj", 40000.0);
		printdetails(empl);

		Employee emplo = new Developer(102, "Karan", 35000.0);
		printdetails(emplo);

	}

	private static void printdetails(Employee emp) {
		System.out.println("----------------------");
		System.out.println("Emp ID:" + emp.EmpNumber);
		System.out.println("emp name:" + emp.EmpName);
		System.out.println("Emp basic salary:" + emp.getBasicSalary());
	}
}
