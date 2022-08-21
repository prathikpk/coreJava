package com.Aurionpro.model;

public class Developer implements IWorker {

	private void show() {
		System.out.println("Developer is working");
	}

	@Override
	public void work() {
		show();
	}

}
