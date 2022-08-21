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
//		Rectangle[] rectangles= {
//				new Rectangle(10,600,ColorType.BLUE),
//				new Rectangle(10,400,ColorType.GREEN),
//				new Rectangle(10,300,ColorType.GREEN),
//				new Rectangle(10,500,ColorType.GREEN),
//				new Rectangle(20,800,ColorType.GREEN),
//		};    
//		for(Rectangle r:rectangles)
//			showRetangleDetails(r);
		
	}

	private static void showRetangleDetails(Rectangle rectangle) {
		System.out.println("---------------------------------");

		System.out.println("Rectangle height : " + rectangle.getHeight());
		System.out.println("Rectangle width : " + rectangle.getWidth());
		System.out.println("Area of Rectangle : " + rectangle.calculateArea());
		System.out.println("Rectangle color : " + rectangle.getColor());
	}

}
