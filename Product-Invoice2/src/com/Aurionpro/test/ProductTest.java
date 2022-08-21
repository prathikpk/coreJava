package com.Aurionpro.test;

import com.Aurionpro.model.Invoice;
import com.Aurionpro.model.InvoicePrinter;
import com.Aurionpro.model.Product;

public class ProductTest {

	public static void main(String[] args) {
		Product[] p = { new Product("Cricket-Kit", 1001, 10000, 10, 5), new Product("Laptop", 1025, 15000, 10, 5),
				new Product("Mobile", 2034, 20000, 7, 5) };
		for (Product prod : p)
			prod.printInvoice();
	    InvoicePrinter in=new InvoicePrinter();
	   in.printinvoice();
		System.out.println("===========================================");
		System.out.println("Total cart bill:" + Invoice.getTotalCartBill());
		System.out.println("===========================================");
	}

}
