package com.Aurionpro.test;

import com.Aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle smallrect=new Rectangle();
		setRectangleDetails(smallrect,10,20);
        showRetangleDetails(smallrect);

	
         Rectangle bigrect=new Rectangle();
         setRectangleDetails(bigrect,100,20);
        showRetangleDetails(bigrect);
		
	}

	private static void showRetangleDetails(Rectangle rectangle) {
		
		System.out.println("Rectangle height : "+rectangle.getHeight());
        System.out.println("Rectangle width : "+rectangle.getWidth());
       
        System.out.println("Area of Rectangle : " +rectangle.calculateArea());
	}

	private static void setRectangleDetails(Rectangle rectangle, int height, int width) {
		
		rectangle.setHeight(height);
		rectangle.setWidth(width);
	}
     
}
