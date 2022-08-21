package com.Aurionpro.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.Aurionpro.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee[] employees = { new Employee(101, "Karan", 30000), new Employee(102, "Suraj", 35000),
				new Employee(103, "Abhay", 20000), new Employee(104, "Anuj", 40000), };

		HashMap<Integer, Employee> emp = new HashMap<>();

		for (Employee emp1 : employees) {
			emp.put(emp1.getId(), emp1);
		}

		Set<HashMap.Entry<Integer, Employee>> emp2 = emp.entrySet();
		for (HashMap.Entry<Integer, Employee> entry : emp2) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
