package com.Aurionpro.model;

public class Threadt1 {

	public static void main(String[] args) {
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("inside anonymous class");
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();

		// using lambda
		Runnable r2 = () -> {
			System.out.println("inside run using lambda");
		};
		Thread t2 = new Thread(r2);
		t2.start();

		// for static
		Runnable r3 = Threadt1::execute;
		Thread t3 = new Thread(r3);
		t3.start();
	}

	public static void execute() {
		System.out.println("inside static");
	}

}
