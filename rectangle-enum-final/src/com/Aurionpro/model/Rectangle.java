package com.Aurionpro.model;

public class Rectangle {
	private final double height;
	private final double width;
	private final ColorType color;

	public Rectangle(double height, double width, ColorType color) {
		this.height = validatevalue(height);
		this.width = validatevalue(width);
		this.color = color;

	}

	public double validatevalue(double value) {
		if (value <= 0) {
			return 1;
		} else if (value > 300) {
			return 100;
		} else
			return value;
	}

	public ColorType getColor() {
		return color;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}
	//cannot add setter method for final instance
//	public ColorType setColor() {
//		return color;
//	}
//
//	public double setHeight() {
//		return height;
//	}
//
//	public double setWidth() {
//		return width;
//	}

	public double calculateArea() {
		double area = height * width;
		return area;
	}

}
