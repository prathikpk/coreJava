package com.Aurionpro.model;

public class Boy implements IMannerable {

	@Override
	public void greet() {
		System.out.println("Boy is greeting");

	}

	@Override
	public void depart() {
         System.out.println("Boy is saying good-bye");
	}

}
