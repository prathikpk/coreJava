package com.Aurionpro.model;

public class VarArgs {
	public int add(int... n) {
		int sum = 0;
		for (int i : n) {
			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		VarArgs a = new VarArgs();
		System.out.println("sum if no Args passed:" + a.add());
		System.out.println("----------------------------");
		System.out.println("Sum of 3 Args:" + a.add(1, 3, 4));
		System.out.println("----------------------------");
		System.out.println("Sum of 4 Args:" + a.add(2, 10, 50, 20));
	}

}
