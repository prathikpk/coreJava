package com.Aurionpro.model;

public class AddTest {

	public static void main(String[] args) {
		IAddable i1=new IAddable() {

		@Override
		public int AddTest(int a, int b) {
			return a+b;
		}
		};
		int add=i1.AddTest(10,20);
		System.out.println("addition is:"+add);
	}

	public static int AddNumbers(int a, int b) {
		a=20;
		b=40;
		return a + b;

	}

}
