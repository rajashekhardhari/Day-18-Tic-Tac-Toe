package com.bridgelabz.ticractoe;

import java.util.Scanner;

public class TicTacToe {

	static char[] board = new char[10];
	char player, computer;
	Scanner scan = new Scanner(System.in);

	public void initialize() {
		for (int i = 1; i < 10; i++) {
			board[i] = ' ';
		}
	}

	public static void main(String[] args) {

		System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
		System.out.println("---------");
		System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
		System.out.println("---------");
		System.out.println(board[7] + " | " + board[8] + " | " + board[9]);

	}

}
