package com.Aurionpro.model;

public class Rectangle implements IShape {
	private double height;
	private double width;
	

	public Rectangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}


	public double getHeight() {
		return height;
	}


	public double getWidth() {
		return width;
	}


	@Override
	public double calArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
