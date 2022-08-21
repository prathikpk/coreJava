package com.Aurionpro.model;

public class Exception {

	public static void main(String[] args) {

		int c=0;
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			c = a/b;
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException handled");;
		}catch (ArithmeticException e) {
			System.out.println("ArithmeticException handled");;
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException handled");;
		}finally {
			System.out.println("hello inside finally");
		}
		System.out.println("Division is:"+c);
	}

}
