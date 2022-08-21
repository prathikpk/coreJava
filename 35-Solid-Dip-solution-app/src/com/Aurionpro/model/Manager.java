package com.Aurionpro.model;

public class Manager implements IWorker {

	private void display() {
		System.out.println("Manager is working");
	}

	@Override
	public void work() {
		display();
	}

}
