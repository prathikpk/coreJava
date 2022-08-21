package com.Aurionpro.test;

import java.util.Scanner;
import com.Aurionpro.model.ColorType;
import com.Aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of objects: ");
		int n = sc.nextInt();
		Rectangle rectangle[] = new Rectangle[n];
		for (int i = 0; i < n; i++) {
			System.out.println("enter height: ");
			double height = sc.nextDouble();

			System.out.println("enter width");
			double width = sc.nextDouble();

			System.out.println("enter color");
			ColorType color;
			try {
				String cl = sc.next();
				color = ColorType.valueOf(cl.toUpperCase());
			} catch (IllegalArgumentException e) {
				color = ColorType.RED;
			}
			rectangle[i] = new Rectangle(height, width, color);
		}
		for (Rectangle r : rectangle)
			showRetangleDetails(r);

	}

	private static void showRetangleDetails(Rectangle rectangle) {
		System.out.println("---------------------------------");

		System.out.println("Rectangle height : " + rectangle.getHeight());
		System.out.println("Rectangle width : " + rectangle.getWidth());
		System.out.println("Area of Rectangle : " + rectangle.calculateArea());
		System.out.println("Rectangle color : " + rectangle.getColor());
	}

}
