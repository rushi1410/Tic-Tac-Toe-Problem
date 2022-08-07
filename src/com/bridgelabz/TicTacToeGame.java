package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {
	
	static char[] board = new char[10];
	static char player,computer;
	public static Scanner scanner = new Scanner(System.in);
	
	static void createBoard(){
		for(int index = 1 ; index<10 ; index++) {
			board[index] = ' ';
		}
	}
	
	static void getPlayerChoice() {
		 System.out.print("select X or O : ");
		 player = Character.toUpperCase(scanner.next().charAt(0));
		 
		 if (player == 'X')
			 computer='O';
		 else
			 computer ='X';
		 System.out.println("You have selected : " +player);
		 System.out.println("Computer's choice : " +computer);
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome To Tic Tac Toe Game");
		createBoard();
		getPlayerChoice();
		
	}
}