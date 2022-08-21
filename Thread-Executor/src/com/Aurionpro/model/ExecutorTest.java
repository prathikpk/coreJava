package com.Aurionpro.model;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest {

	public static void main(String[] args) {
		ExecutorService ex=Executors.newSingleThreadExecutor();
		//ExecutorService ex = Executors.newFixedThreadPool(2);
		ex.execute(new Task1());
		ex.execute(new Task2());
		ex.execute(new Task3());
		ex.execute(new Task4());

		ex.shutdown();
	}

}
