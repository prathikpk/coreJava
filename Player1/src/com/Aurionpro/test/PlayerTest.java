package com.Aurionpro.test;

import com.Aurionpro.model.Player1;

public class PlayerTest {

	public static void main(String[] args) {

		Player1 player1 = new Player1("Sachin", 52);
		Player1 player2 = new Player1("Dhoni", 49);
		String player = player1.whoIselder(player2);
		showPlayerDetails(player1);
		showPlayerDetails(player2);
		System.out.println("--------------------------------");
		System.out.println("Elder player is: " + player);
	}

	private static void showPlayerDetails(Player1 elder) {
		System.out.println("---------------------------------");

		System.out.println("Player id: " + elder.getId());
		System.out.println("Player name: " + elder.getName());
		System.out.println("Player age: " + elder.getAge());
	}

}
