package com.Aurionpro.test;

import com.Aurionpro.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee(201, "Karan", 40000.0);
		System.out.println("Employee Object");
		System.out.println(employee);
		System.out.println("-----------------------------");
		try {
			Employee emp = (Employee) employee.clone();
			Employee employee1 = (Employee) emp;
			System.out.println("Clonned Empolyee Object");
			System.out.println(employee1);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
