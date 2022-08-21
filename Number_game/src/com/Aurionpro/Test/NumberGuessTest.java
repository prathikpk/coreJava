package com.Aurionpro.Test;

import java.util.Scanner;

import com.Aurionpro.model.NumberGuess;

public class NumberGuessTest {

	public static void main(String[] args) {

		NumberGuess number = new NumberGuess();
		int start;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to start the game: ");
		start = sc.nextInt();
		while (start == 1) {
			number.playgame();
		}
	}

}
