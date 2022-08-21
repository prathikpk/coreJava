package com.Aurionpro.model2;

import java.util.ArrayList;

import com.Aurionpro.model1.Player;

public class PlayerInfo {
	public ArrayList<Player> players;

   public PlayerInfo(ArrayList<Player>players) {
		this.players = players;

	}

	public ArrayList<Player> getAlister() {
		ArrayList<Player>Alister=new ArrayList<>();
		for (Player p : players) {
			if (p.getMatches() > 100 && (p.getRuns() >= 5000 || p.getWickets() >= 150)) {
			 Alister.add(p)	;
				}
		}
		return Alister;
		
	}

//	public ArrayList<Player> getBlister() {
//		Player[] Blister = new Player[players.length];
//	ArrayList<Player>Blister=new ArrayList<>();
//		int count = 0;
//		for (Player p : players) {
//			if (p.getMatches() > 50
//					&& ((p.getRuns() > 3000 && p.getRuns() < 5000) || (p.getWickets() > 75 && p.getWickets() < 150))) {
//				Blister.add(p);
//			}
//		}
//		return Blister;
//	}
//
//	public Player[] getClister() {
//		Player[] Clister = new Player[players.length];
//		int count = 0;
//		for (Player p : players) {
//			if (p.getMatches() <= 20 && (p.getRuns() <= 1000 || p.getWickets() <= 25)) {
//				Clister[count++] = p;
//			}
//		}
//		return Clister;
//	}
//
//	public Player getMaxScorer() {
//		Player player = players[0];
//		for (int i = 0; i < players.length; i++) {
//			if (player.getRuns() < players[i].getRuns()) {
//				player = players[i];
//			}
//		}
//		return player;
//	}
	}


