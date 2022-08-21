package com.Aurionpro.test;

import com.Aurionpro.model.ColorType;
import com.Aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle smallRectangle = new Rectangle(10,600, ColorType.BLUE);
		showRetangleDetails(smallRectangle);
   System.out.println("-----------------------------------");
		Rectangle bigRectangle = new Rectangle(10,400, ColorType.GREEN);
		showRetangleDetails(bigRectangle);
		
	}

	private static void showRetangleDetails(Rectangle rectangle) {

		System.out.println("Rectangle height : " + rectangle.getHeight());
		System.out.println("Rectangle width : " + rectangle.getWidth());
		System.out.println("Area of Rectangle : " + rectangle.calculateArea());
		System.out.println("Rectangle color : " + rectangle.getColor());
	}

	

}
