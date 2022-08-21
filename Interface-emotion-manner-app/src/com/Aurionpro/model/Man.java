package com.Aurionpro.model;

public class Man implements IMannerable, IEmmotionable {

	@Override
	public void cry() {
		System.out.println("Man is crying");
	}

	@Override
	public void laugh() {
		System.out.println("Man is Laughing");
	}

	@Override
	public void greet() {
		System.out.println("Man is Greeting");
	}

	@Override
	public void depart() {
		System.out.println("Man is Saying Good-Bye");
	}

}
