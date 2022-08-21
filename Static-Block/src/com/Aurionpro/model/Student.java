package com.Aurionpro.model;

public class Student extends Professor {

	public Student() {
		System.out.println("Student");
	}

	static {
		System.out.println("name of student is Karan");
		int id=10;
		System.out.println("Id:"+id);
	}

}
