package com.Aurionpro.model1;

public class Private1 {

	private void show() {//can only print values in same class cannot access value from other package
		System.out.println("Printing using private modifier");
	}

	public static void main(String[] args) {
		Private1 p = new Private1();
		p.show();

	}
}
