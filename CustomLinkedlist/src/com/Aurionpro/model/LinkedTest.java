package com.Aurionpro.model;

public class LinkedTest {

	public static void main(String[] args) {
		Linkedlist list = new Linkedlist();
		System.out.println("Adding the data in list:");
		list.add(10);
		list.add(20);
		list.display();
		System.out.println("---------------------------------");

		System.out.println("Adding at first index:");
		list.addfirst(40);
		list.addfirst(50);
		list.display();
		System.out.println("--------------------------------");

		System.out.println("Adding the data in list:");
		list.add(90);
		list.display();
		System.out.println("--------------------------------");

		System.out.println("Removing the data from list:");
		list.remove(1);
		list.remove(3);
		list.display();
		System.out.println("-----------------------------");
		
		System.out.println("Adding at index:");
		list.insertAt(2, 30);
		list.display();
	}

}
