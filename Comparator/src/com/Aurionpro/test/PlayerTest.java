package com.Aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.Aurionpro.model.Players;

public class PlayerTest {

	public static void main(String[] args) {
		List<Players> player = new ArrayList<>();
		player.add(new Players("Rohit", 7600, 141));
		player.add(new Players("Dhoni", 10000, 203));
		player.add(new Players("Virat", 8000, 182));
		player.add(new Players("Sachin", 12000, 220));

		Comparator<Players> com = new Comparator<Players>() {
			public int compare(Players p1, Players p2) {
				if (p1.getMatches() > p2.getMatches())
					return 1;
				else
					return -1;
			}
		};

		Collections.sort(player, com);
		for (Players p : player) {
			System.out.println(p);
		}
	}

}
