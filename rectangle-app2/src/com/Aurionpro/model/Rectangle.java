package com.Aurionpro.model;

public class Rectangle {
	private double height;
	private double width;

	public void setHeight(double ht){
	   height =ht;
	}
     public double getHeight() {
    	 return height;
     }
     public void setWidth(double wd){
  	   width =wd;
  	}
       public double getWidth() {
      	 return width;
       }
       public double calculateArea() {
    	   double area=height*width;
    	    return area;
       }
}
