package com.Aurionpro.test;

import com.Aurionpro.model.Circle;
import com.Aurionpro.model.Rectangle;

public class AreaTest {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(10, 2);
		System.out.println("Area of Rectangle:"+r.calArea());
		Circle c = new Circle(10);
		System.out.println("Area of Circle:"+c.calArea());
	}
}
