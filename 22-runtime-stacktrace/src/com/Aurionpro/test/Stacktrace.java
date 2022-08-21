package com.Aurionpro.test;


public class Stacktrace {
	public static void main(String[] args) {
		method1();
		System.out.println("End of main");
	}

	private static void method1() {
		
			method2();
		System.out.println("End of method1");
	}

	private static void method2(){
		method3();
		System.out.println("End of method3");
	}

	private static void method3() throws RuntimeException {
		throw new RuntimeException("Error in method3");
	}
}
