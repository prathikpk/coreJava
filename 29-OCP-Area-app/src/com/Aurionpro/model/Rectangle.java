package com.Aurionpro.model;

public class Rectangle implements ICalculateArea {
	public float length;
	public float breadth;

	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public float getLength() {
		return length;
	}

	public float getBreadth() {
		return breadth;
	}

	@Override
	public double calArea() {
		return length*breadth;
	}

}
