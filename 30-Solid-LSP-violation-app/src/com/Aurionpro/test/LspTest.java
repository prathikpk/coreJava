package com.Aurionpro.test;

import com.Aurionpro.model.Rectangle;
import com.Aurionpro.model.Square;

public class LspTest {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(30, 40);
		if (isRectangle(rect)) {
			System.out.println("Object is rectangle");
		} else {
			System.out.println("object is not rectangle");
		}

		System.out.println("------------------------------");

		Square sq = new Square(20);
		if (isRectangle(sq)) {
			System.out.println("Object is rectangle");
		} else {
			System.out.println("object is not rectangle");
		}
	}

	private static boolean isRectangle(Rectangle rect1) {
		double before = rect1.getWidth();
		rect1.setHeight(60);
		double after = rect1.getWidth();
		return before == after;
	}

}
