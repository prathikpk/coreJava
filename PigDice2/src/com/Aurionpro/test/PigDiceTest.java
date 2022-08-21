package com.Aurionpro.test;

import java.util.Scanner;

import com.Aurionpro.model.PigDice;

public class PigDiceTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PigDice pig = new PigDice();

		System.out.print("Enter player name:");
		String name = sc.next();
		System.out.println("------------------------------------");
		System.out.println(name + " , your current score is " + pig.getTurnscore());
		System.out.println(" ");
		System.out.println("-----Lets Start PigDice Game!!!------");

		System.out.println("Turn " + (pig.getTurn() + 1));
		startgame(pig);
		wincond(pig);
		System.out.println(name + " you have won the game in " + pig.getTurn() + " turns");
	}

	private static void startgame(PigDice pig) {
		Scanner Sc = new Scanner(System.in);
		char c;
		while ((pig.getTotalscore() + pig.getTurnscore()) <=20) {
			System.out.print("Roll or Hold ? (r/h): ");
			c = Sc.next().charAt(0);
			if (c == 'r') {
				rolldice(pig);
			}
			if (c == 'h') {
				holddice(pig);
			}
		}
	}

	private static void rolldice(PigDice pig) {
		int diescore;
		diescore = pig.dievalue();
		pig.Turnscore(diescore);
		System.out.println(diescore);
		if (diescore == 1) {
			pig.turn++;
			printdetails(pig);
			System.out.println("-------------------------------");
			System.out.println("Turn " + (pig.getTurn() + 1));

		}
	}

	private static void holddice(PigDice pig) {
		pig.Totalscore();
		pig.turn++;
		printdetails(pig);
		pig.turnscore = 0;
		System.out.println("---------------------------------");
		System.out.println("TURN " + (pig.getTurn() + 1));
	}

	private static void wincond(PigDice pig) {
		if ((pig.getTotalscore() + pig.getTurnscore()) > 20) {
			pig.Totalscore();
			pig.turn++;
			printdetails(pig);
			System.out.println("-----------------------------------");
			System.out.println("Congratulations!!!you have won the game");
			printdetails(pig);
		}
	}

	private static void printdetails(PigDice pig) {
		System.out.println("your turnscore is:" + pig.getTurnscore());
		System.out.println("your totalscore is:" + pig.getTotalscore());
		System.out.println("your total turn is:" + pig.getTurn());
	}

}
