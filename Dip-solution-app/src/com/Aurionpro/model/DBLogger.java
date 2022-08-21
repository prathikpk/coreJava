package com.Aurionpro.model;

public class DBLogger implements ILogger {

	@Override
	public void log() {
		System.out.println("Logged to DB ");
	}

}
