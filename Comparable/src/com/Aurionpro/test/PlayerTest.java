package com.Aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.Aurionpro.model.Players;

public class PlayerTest {

	public static void main(String[] args) {
		List<Players> player = new ArrayList<>();
		player.add(new Players("Rohit", 6500, 140));
		player.add(new Players("Dhoni", 9000, 190));
		player.add(new Players("Virat", 7000, 170));
		player.add(new Players("Sachin", 10000, 200));

		//Collections.sort(player);
		 Collections.reverse(player);
		for (Players p : player) {
			System.out.println(p);
		}
	}

}
