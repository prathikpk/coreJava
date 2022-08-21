package com.Aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;

import com.Aurionpro.model1.Player;
import com.Aurionpro.model2.PlayerInfo;

public class ClassifyPlayerTest {

	public static void main(String[] args) {
       ArrayList<Player> players = new ArrayList<>();
        players.add(new Player(10,"Sachin",500,10000,10));
        players.add(new Player(11,"Rohit",400,8000,60));
        players.add(new Player(12,"virat",300,8000,80));
		
        PlayerInfo pl=new PlayerInfo(players);
		ArrayList <Player> Alister = pl.getAlister();
		System.out.println("A-Lister Players are:");
	     
		for (Player p :players) {
			if (pl != null)
				System.out.println(p);
		}
		System.out.println("--------------------------------------");

////		Player[] Blister = pl.getBlister();
//		ArrayList <Player> Blister = pl.getBlister();
//		System.out.println("B-Lister Players are:");
//		for (Player p : players) {
//			if (p != null)
//				System.out.println(p);
//		}
//		System.out.println("----------------------------------------");
//
//		Player[] Clister = pl.getClister();
//		System.out.println("C-Lister Players are:");
//		for (Player p : Clister) {
//			if (p != null)
//				System.out.println(p);
//
//		}
//		System.out.println("------------------------------------------");
//		System.out.println("Max Scorer!!!");
//		Player MaxScorer = pl.getMaxScorer();
//		System.out.println(MaxScorer);
	}

}