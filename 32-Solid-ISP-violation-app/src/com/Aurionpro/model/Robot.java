package com.Aurionpro.model;

public class Robot implements IWorker{

	@Override
	public void startWork() {
		System.out.println("Robot started working");
	}

	@Override
	public void stopWork() {
		System.out.println("Robot stopped working");
	}

	@Override
	public void startEat() {
		throw new RuntimeException("Robots cannot eat");
	}

	@Override
	public void stopEat() {
		throw new RuntimeException("Robots cannot eat");
	}

}
