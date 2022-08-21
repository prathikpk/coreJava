package com.Aurionpro.model;

public class Employee {

	public static void main(String[] args) {
		IWorker dev = new Developer();
		IWorker wk = new Manager();
		employee(wk);
		employee(dev);
	}

	private static void employee(IWorker w) {
		w.work();
	}

}
