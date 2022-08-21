package com.Aurionpro.test;

import java.util.*;

import com.Aurionpro.model.BookCric;

public class BookCricTest {

	public static void main(String[] args) {
		BookCric c = new BookCric();
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
				c.showplayer1details(runs1, balls1, pgno, score1, player1);
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
				c.showplayer2details(pgno, runs2, score2, balls2, player2, score1);
				if (score2 > score1) {
					break;
				}
				balls2++;
			}
			c.showResultCondition(score1, score2, player1, player2);
		}
	}
}
