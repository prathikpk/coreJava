package com.Aurionpro.test;

import com.Aurionpro.model1.Player;
import com.Aurionpro.model2.PlayerInfo;

public class ClassifyPlayerTest {

	public static void main(String[] args) {

		Player[] players = { new Player(10, "Sachin", 200, 20000, 20), new Player(11, "virat", 200, 8001, 15),
				new Player(12, "bhuvi", 200, 2000, 80), new Player(13, "zaheer", 400, 2000, 180),
				new Player(14, "raaj", 10, 900, 10), };

		PlayerInfo pl = new PlayerInfo(players);

		Player[] Alister = pl.getAlister();
		System.out.println("A-Lister Players are:");
		for (Player p : Alister) {
			if (p != null)
				System.out.println(p);
		}
		System.out.println("--------------------------------------");

		Player[] Blister = pl.getBlister();
		System.out.println("B-Lister Players are:");
		for (Player p : Blister) {
			if (p != null)
				System.out.println(p);
		}
		System.out.println("----------------------------------------");

		Player[] Clister = pl.getClister();
		System.out.println("C-Lister Players are:");
		for (Player p : Clister) {
			if (p != null)
				System.out.println(p);

		}
		System.out.println("------------------------------------------");
		System.out.println("Max Scorer!!!");
		Player MaxScorer = pl.getMaxScorer();
		System.out.println(MaxScorer);
	}
}