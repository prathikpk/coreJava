package com.Aurionpro.test;

import com.Aurionpro.model.ColorType;
import com.Aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle smallRectangle = new Rectangle(10,600, ColorType.BLUE);
		showRetangleDetails(smallRectangle);
   System.out.println("-----------------------------------");
		Rectangle bigRectangle = new Rectangle(10,400);
		showRetangleDetails(bigRectangle);
		
		 System.out.println("-----------------------------------");
			Rectangle testRectangle = new Rectangle(40);
			showRetangleDetails(testRectangle);
			
	}

	private static void showRetangleDetails(Rectangle rectangle) {
		System.out.println("---------------------------------");

		System.out.println("Rectangle height : " + rectangle.getHeight());
		System.out.println("Rectangle width : " + rectangle.getWidth());
		System.out.println("Area of Rectangle : " + rectangle.calculateArea());
		System.out.println("Rectangle color : " + rectangle.getColor());
	}

}
