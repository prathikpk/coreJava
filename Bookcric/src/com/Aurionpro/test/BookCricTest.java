package com.Aurionpro.test;

import java.util.*;

public class BookCricTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Book Cricket game!!!");
		System.out.println("-------------------------------------");
		int start;
		String player1;
		String player2;
		int open = 1;
		int pgno;
		Random rand = new Random();
		System.out.println("Enter 1 to start and 0 to exit:");
		start = sc.nextInt();
		if (start == 1) {
			System.out.println("Enter player1 name: ");
			player1 = sc.next();
			System.out.println("Enter player2 name: ");
			player2 = sc.next();
			System.out.println("-------------------------------------");
			System.out.println(player1 + " its ur turn");
			int score1 = 0;
			int runs1 = 1;
			int balls1 = 1;
			while (open == 1 && balls1 <= 6 && runs1 != 0) {
				pgno = rand.nextInt(300);
				runs1 = pgno % 7;
				score1 = runs1 + score1;
				System.out.println("Enter 1 to open book");
				open = sc.nextInt();
				showplayer1details(runs1, balls1, pgno, score1, player1);
				balls1++;
			}
			System.out.println("------------------------------------------------");
			System.out.println(player2 + " requires " + (score1 + 1) + " runs to win in " + (balls1 = 6) + " balls");
			System.out.println("------------------------------------------------");
			System.out.println(player2 + " its ur turn");
			int score2 = 0;
			int runs2 = 1;
			int balls2 = 1;
			while (open == 1 && balls2 <= 6 && runs2 != 0) {
				pgno = rand.nextInt(300);
				runs2 = pgno % 7;
				score2 = runs2 + score2;
				System.out.println("Enter 1 to open book");
				open = sc.nextInt();
				showplayer2details(pgno, runs2, score2, balls2, player2, score1);
				if (score2 > score1) {
					break;
				}
				balls2++;
			}
			showResultCondition(score1, score2, player1, player2);
		}
	}

	public static void showplayer1details(int runs1, int balls1, int pgno, int score1, String player1) {
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

	private static void showplayer2details(int pgno, int runs2, int score2, int balls2, String player2, int score1) {
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

	private static void showResultCondition(int score1, int score2, String player1, String player2) {
		if (score1 > score2) {
			System.out.println("Congratulations!!! " + player1 + " yon won the game");
		} else if (score2 > score1) {
			System.out.println("Congratulations!!! " + player2 + " yon won the game");
		} else {
			System.out.println("its a tie");
		}
	}

}
