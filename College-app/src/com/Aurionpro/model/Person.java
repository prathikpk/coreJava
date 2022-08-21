package com.Aurionpro.model;

public class Person {
	public int id;
	public String address;
	public String Dob;

	public Person(int id, String address, String dob) {
		super();
		this.id = id;
		this.address = address;
		Dob = dob;
	}

	public int getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public String getDob() {
		return Dob;
	}

}
