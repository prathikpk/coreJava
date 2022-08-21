package com.Aurionpro.model2;

import com.Aurionpro.model1.Player;

public class PlayerInfo {
	Player[] players;

	public PlayerInfo(Player[] players) {
		this.players = players;

	}

	public Player[] getAlister() {
		Player[] Alister = new Player[players.length];
		int count = 0;
		for (Player p : players) {
			if (p.getMatches() > 100 && (p.getRuns() >= 5000 || p.getWickets() >= 150)) {
				Alister[count++] = p;
			}
		}
		return Alister;
	}

	public Player[] getBlister() {
		Player[] Blister = new Player[players.length];
		int count = 0;
		for (Player p : players) {
			if (p.getMatches() > 50
					&& ((p.getRuns() > 3000 && p.getRuns() < 5000) || (p.getWickets() > 75 && p.getWickets() < 150))) {
				Blister[count++] = p;
			}
		}
		return Blister;
	}

	public Player[] getClister() {
		Player[] Clister = new Player[players.length];
		int count = 0;
		for (Player p : players) {
			if (p.getMatches() <= 20 && (p.getRuns() <= 1000 || p.getWickets() <= 25)) {
				Clister[count++] = p;
			}
		}
		return Clister;
	}

	public Player getMaxScorer() {
		Player player = players[0];
		for (int i = 0; i < players.length; i++) {
			if (player.getRuns() < players[i].getRuns()) {
				player = players[i];
			}
		}
		return player;
	}

}
