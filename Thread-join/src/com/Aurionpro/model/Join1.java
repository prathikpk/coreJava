package com.Aurionpro.model;

public class Join1 extends Thread {
	static int n;

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i * n);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Join1 j = new Join1();
		j.start();
		Join1.n = 5;
		j.join();

		for (int i = 1; i <= 5; i++) {
			int n = 10;
			System.out.println(i * n);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
