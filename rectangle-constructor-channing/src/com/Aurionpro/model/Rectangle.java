package com.Aurionpro.model;

public class Rectangle {
	private double height;
	private double width;
	private ColorType color;

	public Rectangle(double height, double width, ColorType color) {
		this.height = validatevalue(height);
		this.width = validatevalue(width);
		this.color = color;

	}
	public Rectangle(double height, double width) {
		this(height,width,ColorType.RED);
	}

	public Rectangle(double height) {
		this(height,10,ColorType.RED);
			

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

	public double calculateArea() {
		double area = height * width;
		return area;
	}

}
