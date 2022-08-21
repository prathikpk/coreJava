package com.Aurionpro.model;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {

		ArrayList<String> games = new ArrayList<String>();
		games.add("Cricket");
		games.add("Football");
		games.add("Tennis");
		games.add("Baseball");
		System.out.println("---Original ArrayList------");
		System.out.println(games);
		System.out.println("  ");

		games.add(2, "Hockey");
		System.out.println("----After adding in index 2----");
		System.out.println(games);
		System.out.println("  ");

		games.set(3, "Table-tennis");
		System.out.println("-----After replacing the element-------");
		System.out.println(games);
		System.out.println("  ");

		games.remove(4);
		System.out.println("---------After removing element------");
		System.out.println(games);
		System.out.println("  ");

		System.out.println("---------Getting the index of element-------");
		System.out.println("The index of Given element is:" + games.indexOf("Hockey"));
		System.out.println("  ");

		System.out.println("-------Getting the size of Arraylist----");
		System.out.println("The size of arraylist is:" + games.size());
		System.out.println("  ");

		System.out.println("-----Checking if arraylist contains the element-----");
		System.out.println(games.contains("Cricket"));
		System.out.println("  ");

		System.out.println("------Getting the Element ---------");
		System.out.println(games.get(3));
		System.out.println("  ");

		System.out.println("--------Clonning the Arraylist--------");
		System.out.println(games.clone());
		System.out.println("  ");

		System.out.println("---------Removing all elements-----");
		games.clear();
		System.out.println(games);

	}

}
