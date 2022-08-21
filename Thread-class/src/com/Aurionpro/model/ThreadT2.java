package com.Aurionpro.model;

public class ThreadT2 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 6; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		ThreadT2 t2 = new ThreadT2();
		Thread th = new Thread(t2);// creating thread class object
		th.start();
	}

}
