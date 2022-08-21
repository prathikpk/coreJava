package com.Aurionpro.test;

import com.Aurionpro.model.Innerclass;

public class InnerClassTest {

	public static void main(String[] args) {
      
		Innerclass in=new Innerclass();
		in.show();
		System.out.println("----------------------");
//		Innerclass.Inner in1=in.new Inner();
//		in1.display();
		Innerclass inner=new Innerclass() {//Anonymous class is when instance is created
			public void show() {
				System.out.println("Dhoni");
				System.out.println("Rohit");
				System.out.println("Virat");
			}
		};
		inner.show();
	}
}
