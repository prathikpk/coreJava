package com.Aurionpro.model;

class Task1 extends Thread {
	public void run() {
		System.out.println("\nTask 1 started!!");
		for (int i = 1; i <= 10; i++)
			System.out.print(+i + " ");
		System.out.println("\nTask 1 completed!!");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
	}
}

class Task2 extends Thread {
	public void run() {
		System.out.println("\nTask 2 started!!");
		for (int i = 11; i <= 20; i++)
			System.out.print(+i + " ");
		System.out.println("\nTask 2 completed!!");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
	}
}

class Task3 extends Thread {
	public void run() {
		System.out.println("\nTask 3 started!!");
		for (int i = 21; i <= 30; i++)
			System.out.print(+i + " ");
		System.out.println("\nTask 3 completed!!");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
	}
}

class Task4 extends Thread {
	public void run() {
		System.out.println("\nTask 4 started!!");
		for (int i = 21; i <= 30; i++)
			System.out.print(+i + " ");
		System.out.println("\nTask 4 completed!!");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
	}
}
