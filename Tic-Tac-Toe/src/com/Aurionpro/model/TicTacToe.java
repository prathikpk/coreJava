package com.Aurionpro.model;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		String name1;
		System.out.println("Enter player1 name:");
		Scanner userone=new Scanner(System.in);
		name1=userone.next();
		
		String name2;
		System.out.println("Enter player2 name:");
		Scanner usertwo=new Scanner(System.in);
		name2=usertwo.next();
		System.out.println("Lets start the game!!");
		
		char[][] board = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' } };

		printBoard(board);

		while (true) {
			playerone(board, scanner);
			if (result(board)) {
				break;
			}
			printBoard(board);

			playertwo(board, sc);
			if (result(board)) {
				break;
			}
			printBoard(board);
		}
	}

	private static void playerone(char[][] board, Scanner scanner) {
		int user1;
		while (true) {
			System.out.println("Where would you like to play?");
			user1 = scanner.nextInt();
			if (isValidMove(board, user1)) {
				break;
			} else {
				System.out.println(user1 + " is not a valid move.");
			}
		}
		position(board, user1, 'X');
	}

	private static void playertwo(char[][] board, Scanner sc) {
		int user2;
		while (true) {
			System.out.println("Where would you like to play?");
			user2 = sc.nextInt();
			if (isValidMove(board, user2)) {
				break;
			} else {
				System.out.println(user2 + " is not a valid move.");
			}
		}
		position(board, user2, 'O');
	}

	private static boolean isValidMove(char[][] board, int position) {
		switch (position) {
		case 1:
			return (board[0][0] == '1');
		case 2:
			return (board[0][1] == '2');
		case 3:
			return (board[0][2] == '3');
		case 4:
			return (board[1][0] == '4');
		case 5:
			return (board[1][1] == '5');
		case 6:
			return (board[1][2] == '6');
		case 7:
			return (board[2][0] == '7');
		case 8:
			return (board[2][1] == '8');
		case 9:
			return (board[2][2] == '9');
		default:
			return false;
		}
	}

	private static void position(char[][] board, int pos, char symbol) {
		switch (pos) {
		case 1:
			board[0][0] = symbol;
			break;
		case 2:
			board[0][1] = symbol;
			break;
		case 3:
			board[0][2] = symbol;
			break;
		case 4:
			board[1][0] = symbol;
			break;
		case 5:
			board[1][1] = symbol;
			break;
		case 6:
			board[1][2] = symbol;
			break;
		case 7:
			board[2][0] = symbol;
			break;
		case 8:
			board[2][1] = symbol;
			break;
		case 9:
			board[2][2] = symbol;
			break;
		default:
			System.out.println(" ");
		}
	}

	private static boolean wincondition(char[][] board, char symbol) {
		if ((board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol)
				|| (board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol)
				|| (board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol) ||

				(board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol)
				|| (board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol)
				|| (board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol) ||

				(board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol)
				|| (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
			return true;
		}
		return false;
	}

	private static boolean result(char[][] board) {

		if (wincondition(board, 'X')) {
			printBoard(board);
			System.out.println("Player1 wins!");
			return true;
		}

		if (wincondition(board, 'O')) {
			printBoard(board);
			System.out.println("player 2 wins!");
			return true;
		}
		return false;
	}

	private static void printBoard(char[][] board) {
		System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("-+-+-");
		System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("-+-+-");
		System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
	}

}
