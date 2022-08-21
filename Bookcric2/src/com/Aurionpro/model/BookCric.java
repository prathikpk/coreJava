package com.Aurionpro.model;

public class BookCric {

	public void showplayer1details(int runs1, int balls1, int pgno, int score1, String player1) {
		if (runs1 != 0 && balls1 <= 6) {
			System.out.println(
					"page number:" + pgno + "  balls:" + balls1 + "  run scored:" + runs1 + "  Total Score:" + score1);
		}
		if (runs1 == 0) {
			System.out.println(
					"page number:" + pgno + "  balls:" + balls1 + "  run scored:" + runs1 + "  Total Score:" + score1);
			System.out.println(player1 + " you are out ");
		} else {
			System.out.println(" ");
		}
	}

	public void showplayer2details(int pgno, int runs2, int score2, int balls2, String player2, int score1) {
		if (runs2 != 0 && balls2 <= 6) {
			System.out.println(
					"page number:" + pgno + "  run scored:" + runs2 + "  Total Score:" + score2 + "  balls:" + balls2);
		}
		if (runs2 == 0) {
			System.out.println(
					"page number:" + pgno + "  run scored:" + runs2 + "  Total Score:" + score2 + "  balls:" + balls2);
			System.out.println(player2 + " you are out ");
		} else {
			System.out.println(" ");
		}
	}

	public void showResultCondition(int score1, int score2, String player1, String player2) {
		if (score1 > score2) {
			System.out.println("Congratulations!!! " + player1 + " yon won the game");
		} else if (score2 > score1) {
			System.out.println("Congratulations!!! " + player2 + " yon won the game");
		} else {
			System.out.println("its a tie");
		}
	}
}
