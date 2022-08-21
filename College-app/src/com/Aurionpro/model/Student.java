package com.Aurionpro.model;

public class Student extends Person {
	public Branchtype Branch;

	public Student(int id, String address, String dob, Branchtype branch) {
		super(id, address, dob);
		Branch = branch;
	}


}
