package com.Aurionpro.model;

public class EnumTest {

	public static void main(String[] args) {
		Mobile[] m = Mobile.values();// to print all the values in the Enum
		System.out.println("List of mobile");
		for (Mobile mobile : m)
			System.out.println(mobile+"-"+mobile.ordinal());
		System.out.println("----------------------");
		System.out.println("Price of SamSung Mobile:" + Mobile.OPPO.getPrice());
		Mobile.OS();

	}

}
