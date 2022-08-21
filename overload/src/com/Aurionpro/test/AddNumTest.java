package com.Aurionpro.test;

import com.Aurionpro.model.Addnumbers;

public class AddNumTest {

	public static void main(String[] args) {
			Addnumbers addi=new Addnumbers();
			System.out.println(addi.add(10, 20));
			System.out.println(addi.add(10, 20, 30));
			System.out.println(addi.add(10.5, 2.55));
	}

}
