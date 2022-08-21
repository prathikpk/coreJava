package com.Aurionpro.model;

public class Circle implements ICalculateArea {
	public float radius;

	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	@Override
	public double calArea() {
		return 3.14*radius * radius;
	}

}
