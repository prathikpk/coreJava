package com.Aurionpro.model;

import java.util.Random;

public class PigDice {
	public int totalscore;
	public int turnscore;
	public int turn;
	public int diescore;

	public int dievalue() {
		Random r = new Random();
		diescore = 1 + r.nextInt(6);
		return diescore;
	}
   
	public int getTurnscore() {
		return turnscore;
	}
	
	public void updateTurnscore(int diescore) {
		if (diescore == 1) {
			this.turnscore = 0;
		} else {
			this.turnscore += diescore;
		}
	}

	public int getTotalscore() {
		return totalscore;
	}

	public int getTurn() {
		return turn;
	}
	
	public void Totalscore() {
		totalscore+=turnscore;
	}
	
	
}
