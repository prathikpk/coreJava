package com.Aurionpro.model;

public class Table {

	public synchronized void printTable(int n) {// synchronize complete block
		for (int i = 1; i <= 5; i++) {
			System.out.println(i * n);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}

}
