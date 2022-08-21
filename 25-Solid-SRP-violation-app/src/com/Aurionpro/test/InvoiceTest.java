package com.Aurionpro.test;

import com.Aurionpro.model.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice in = new Invoice("100", "CricketKit", 30000, 30, 10);
		System.out.println(in);
		System.out.println("--------------------------------------------------------------");
		in.printInvoice();
	}

}
