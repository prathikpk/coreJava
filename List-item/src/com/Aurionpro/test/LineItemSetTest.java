package com.Aurionpro.test;

import java.util.ArrayList;

import com.Aurionpro.model.LineItem;

public class LineItemSetTest {

	public static void main(String[] args) {
		ArrayList<LineItem> items = new ArrayList<>();
		items.add(new LineItem(101, "oreo", 10, 6));
		items.add(new LineItem(102, "Parle g", 15, 5));
		items.add(new LineItem(103, "Borborne", 8, 5));
		items.add(new LineItem(104, "oreo", 10, 10));

		for (LineItem item : items) {
			double totalcostprice = 0;
			totalcostprice = item.calculateTotalPrice();
			System.out.println(totalcostprice);
		}

	}

}
