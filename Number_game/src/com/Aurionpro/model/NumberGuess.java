package com.Aurionpro.model;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

	public int number;
	public int userinput;
	public static int turns = 1;

	public void playgame() {
		this.number = RandomNumber();
		while (turns <= 6) {
			UserInput();			
		}
	}

	public int RandomNumber() {
		Random rand = new Random();
		return rand.nextInt(100);
	}

	public void UserInput() {
		System.out.println("Guess the number:");
		Scanner sc = new Scanner(System.in);
		userinput = sc.nextInt();
		if (this.userinput > 0 && this.userinput <= 100) {
			isCorrectNumber();
			incrementTurn();
			Printdetails();
		}
	}

	public void isCorrectNumber() {
		if (turns <= 6 && userinput == number) {
			System.out.format("you have guessed it right in " + turns + " turns");
			System.out.println("          ");
		} else if (userinput < number) {
			System.out.println("Too low...");
		} else if (userinput > number) {
			System.out.println("Too high...");
		}
	}

	public void Printdetails() {
		if (turns > 6 && userinput != number) {
			System.out.println("YoU Lost!!! YOU COUDN'T GUESS THE RIGHT  NUMBER...the number was " + this.number);
		} else if (userinput == number) {
			System.out.println("you won the game!!!");
		}
	}

	public void incrementTurn() {
		turns++;
	}

}
