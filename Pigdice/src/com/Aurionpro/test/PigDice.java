package com.Aurionpro.test;

import java.util.*;
import java.util.ArrayList;

public class PigDice {

	public static void main(String[] args) {
		int num_players;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> players = new ArrayList();
		ArrayList<Integer> scores = new ArrayList();
		Random rand = new Random();

		do {
			System.out.print("how many players: ");
			num_players = sc.nextInt();
		} while (num_players < 1 && num_players>3);

		for (int i = 0; i < num_players; i++) {
			System.out.print("enter player" + (i + 1) + " name:");
			players.add(sc.next());
			scores.add(0);
		}
		System.out.println("-----------------------------------");
		System.out.println("the number of players are: " + num_players);
		System.out.println("lets play pig dice!!!");
		System.out.println("----------------------------------");

		for (int j = 0; j < players.size(); j++) {
			String name = players.get(j);
			int score = scores.get(j);
			
			
			char c;
			int dievalue = 0;
			int totalscore = 0;
			int turnscore = 0;

			System.out.println(name + " its ur turn, current score is " + score);

			for (int k = 1; totalscore<20; k++) {
				System.out.println("Turn " + k);
				
				System.out.println("Roll or Hold ? (r/h)");
				c = sc.next().charAt(0);
				if(dievalue==1) {
					dievalue=0;
				}
				
				while (c == 'r' && totalscore < 20 && dievalue != 1) {
					dievalue = 1 + rand.nextInt(6);
					System.out.println("Dice " + dievalue);
					if (dievalue != 1) {
						totalscore = totalscore + dievalue;
					}
					turnscore = turnscore + dievalue;
					System.out.println("Roll or Hold ? (r/h)");
					c = sc.next().charAt(0);
				}
				if (dievalue == 1) {
					
					totalscore =totalscore-turnscore;
					System.out.println("Turn " + k + " no score ");
				} else {
					System.out.println("The turn score is " + turnscore);
					System.out.println("The total score is " + totalscore);
				}
				if (totalscore >= 20) {
					System.out.println("You finished in " + k + " turns");
				}
				turnscore=0;
			}
		}
	}
}
