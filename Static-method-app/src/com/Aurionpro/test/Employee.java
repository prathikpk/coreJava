package com.Aurionpro.test;
public class Employee {
	public int id;
	public String name;
	public int salary;
	
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	 
//    private static void printEmployeeDetails() {
//    	System.out.println(salary);
//    	System.out.println(name);
//    	System.out.println(id);
//    }
   
    public void printEmployeeDetails1() {
    	System.out.println(id);
    	System.out.println(name);
    	System.out.println(salary);
    	
    }
}
