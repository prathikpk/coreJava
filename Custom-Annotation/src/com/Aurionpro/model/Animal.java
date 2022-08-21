package com.Aurionpro.model;

public class Animal {
	String name;
	int age;

	@CusAnn(Id = 1)
	public void cat() {
		System.out.println("its a cat");
	}

	@CusAnn(Id = 3)
	public void dog() {
		System.out.println("its a dog");
	}

	@CusAnn(Id = 41)
	public void Tiger() {
		System.out.println("Its a Tiger");
	}

	public void Lion() {
		System.out.println("Its a Lion");
	}

}
