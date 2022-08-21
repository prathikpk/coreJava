package com.Aurionpro.model;

import java.util.HashMap;

public class Hashmap1 {

	public static void main(String[] args) {
		HashMap<Integer, String> players = new HashMap<>();
		players.put(10, "Sachin");
		players.put(07, "Dhoni");
		players.put(18, "Virat");
		players.put(45, "Rohit");
		System.out.println("Original mapping:");
		System.out.println(players);
		System.out.println(" ");

		// we cannot add duplicate keys in Hashmap
		System.out.println("new mapping:cannot add duplicate keys,It replaces old value to new value");
		players.put(10, "Rohit");
		System.out.println(players);
		System.out.println(" ");

		// getting value using key
		System.out.println("getting the value using key");
		System.out.println(players.get(07));
		System.out.println(" ");

		// removing value using key
		System.out.println("Removing the value using key");
		System.out.println("before removing:" + players);
		System.out.println(players.remove(10));
		System.out.println("after removing:" + players);
		System.out.println(" ");

		// returning all keys as set
		System.out.println("Printing all the keys as set:");
		System.out.println(players.keySet());
		System.out.println(" ");

		// returning all entries as set
		System.out.println("Printing all entries as set:");
		System.out.println(players.entrySet());
		System.out.println(" ");

		// getting the default value of the key
		System.out.println("Printing default value:");
		System.out.println(players.getOrDefault(7, "Rohit"));
		System.out.println(" ");

		// replacing the old value with new value
		System.out.println("Printing new value");
		players.replace(18, "Virat", "Kohli");
		System.out.println(players);
	}

}
