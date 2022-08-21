package com.Aurionpro.model;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist1 {

	public static void main(String[] args) {
		LinkedList<String> players = new LinkedList<>();
		players.add("Sachin");
		players.add("Dhoni");
		players.add("Virat");
		players.add("Rohit");
		System.out.println("Original List:");
		System.out.println(players);
		System.out.println(" ");

		// Adding element to last index
		System.out.println("After adding at last index using AddLast:");
		players.addLast("Bhuvi");
		System.out.println(players);
		System.out.println(" ");

		// printing element in descending order
		System.out.println("Printing in decending order:");
		Iterator<String> x = players.descendingIterator();
		while (x.hasNext()) {
			System.out.println(x.next());
		}
		System.out.println(" ");

		// getting the last element from list
		System.out.println("Printing last element:");
		System.out.println(players.getLast());
		System.out.println(" ");

		// removing the first element using Poll
		System.out.println("Removing the first element");
		System.out.println("Before using poll:" + players);
		System.out.println("Using poll:" + players.poll());// this method retrieves and removes the first element
		System.out.println("After using poll:" + players);
		System.out.println(" ");

		// adding element using push
		System.out.println("Adding element using push:");
		players.push("Rohit");// adds the element to the first index
		System.out.println(players);
		System.out.println(" ");

		// removing the first occurrence of object
		System.out.println("Removing first occurance:");
		players.removeFirstOccurrence("Rohit");// removes the first occurrence of specified object
		System.out.println(players);
		
	}

}
