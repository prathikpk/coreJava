package com.Aurionpro.test;

import com.Aurionpro.model.Table;

public class TableTest extends Thread {
	static Table t;
	int n;

	public void run() {
		t.printTable(n);
	}

	public static void main(String[] args) {
		t = new Table();
		TableTest t1 = new TableTest();
		TableTest t2 = new TableTest();
		t1.n = 5;
		t2.n = 10;
		t1.start();
		t2.start();

	}

}
