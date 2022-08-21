package com.Aurionpro.test;

import java.util.HashSet;
import java.util.Set;

import com.Aurionpro.model.LineItem;

public class LineItemTest {

	public static void main(String[] args) {
		Set<LineItem> items = new HashSet<>();
		items.add(new LineItem(101, "oreo", 10, 6));
		items.add(new LineItem(102, "Parle g", 15, 5));
		items.add(new LineItem(103, "Borborne", 8, 5));
		items.add(new LineItem(101, "oreo", 10, 10));

		for (LineItem item : items) {
			double totalcostprice = 0;
			totalcostprice = item.calculateTotalPrice();
			System.out.println(item);
			System.out.println(totalcostprice);
		}
		for (LineItem item1 : items) {
			double totalcartprice = 0;
			totalcartprice = item1.calculateTotalcartPrice();
			System.out.println(totalcartprice);

		}

	}

}
