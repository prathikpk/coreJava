package com.Aurionpro.model;

public class Table {

	public void printTable(int n) {


//		synchronized (this) {// synchronize only particular block
			for (int i = 1; i <= 5; i++) {
				System.out.println(i * n);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}

		//}
		System.out.println("hello");
		System.out.println("hie");
	}

}
