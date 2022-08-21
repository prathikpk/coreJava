package com.Aurionpro.model;

import java.util.StringTokenizer;

public class StringTokenizer1 {

	public static void main(String[] args) {

		String s = "Knowledge Is Power and wisdom";
		StringTokenizer s1 = new StringTokenizer(s);

		System.out.println("Total number Token is:" + s1.countTokens());// will give the count of token
		System.out.println("----------------------");
		System.out.println(s1.hasMoreElements());// will check if there are Elements in String
		System.out.println("----------------------");

		int i = 1;
		while (s1.hasMoreElements()) {
			System.out.println("Token " + i + ":" + s1.nextElement());
			i++;
		}
		System.out.println("-----------------------");
		System.out.println(s1.hasMoreElements());
	}

}
