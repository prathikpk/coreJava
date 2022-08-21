package com.Aurionpro.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class EmployeeTest {

	public static void main(String[] args) {
			ArrayList<Employee> emp=new ArrayList<>();
			emp.add(new Employee(101, "Sachin", 20000));
			emp.add(new Employee(102, "Karan", 30000));
			emp.add(new Employee(103, "Darshan", 60000));
			emp.add(new Employee(104, "Virat", 40000));
			
		Optional<Employee>maxSalary;
		maxSalary=	emp.stream().max(Comparator.comparingDouble(n->n.getSalary()));
		maxSalary.ifPresent(System.out::println);
		System.out.println("-------------------------------------------");
		
		Optional<Employee>minSalary;
		minSalary=	emp.stream().min(Comparator.comparingDouble(n->n.getSalary()));
		minSalary.ifPresent(System.out::println);
		System.out.println("-----------------------------------------------");
		
		emp.stream().filter(n->n.getName().length()>6).forEach(System.out::println);
		System.out.println("-------------------------------------------------");
		
		double sum=emp.stream().mapToDouble(n->n.getSalary()).sum();
		System.out.println("Total is:"+sum);
		
			
		}
	}


