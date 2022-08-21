package com.Aurionpro.model;

import java.util.HashSet;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
		Set<String> games = new HashSet<String>();
		games.add("Cricket");
		games.add("Footbool");
		games.add("Tennis");
		games.add("Hockey");
		System.out.println("-----Original Set-------------");
		System.out.println(games);
		System.out.println("  ");

		System.out.println("------After Adding-----------");
		games.add("Kabaddi");
		System.out.println(games);
		System.out.println("  ");

		System.out.println("----Cannot add duplicate elements in Set---");
		games.add("Cricket");
		System.out.println(games);
		System.out.println("  ");

		System.out.println("--------After removing------------");
		games.remove("Hockey");
		System.out.println(games);
		System.out.println("  ");

		System.out.println("-------Getting Set size---------");
		System.out.println("The size of set is:" + games.size());
		System.out.println("  ");

		System.out.println("------Removing all Elements-----");
		games.clear();
		System.out.println(games);
		System.out.println("  ");

		System.out.println("--------Checking if Set is Empty-------");
		System.out.println(games.isEmpty());
		System.out.println("  ");

		System.out.println("--------To check if set contains the element-------");
		System.out.println(games.contains("Cricket"));
	}

}
