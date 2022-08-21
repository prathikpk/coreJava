package com.Aurionpro.model1;

public class PrintModel {

	public static void main(String[] args) {
		Default1 d=new Default1();
		Public1 p=new Public1();
		Private1 p1=new Private1();
		Protected1 pr=new Protected1();
		d.show();
		p.show();
		//p1.show();//its gives error as access modifier is private
		pr.show();
	}

}
