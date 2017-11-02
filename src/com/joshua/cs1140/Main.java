package com.joshua.cs1140;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		final int ROCK = 1;
		final int PAPER = 2;
		final int SCISSORS = 3;

		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();

		int playerChoice;
		int cpuChoice;

		String playerChoiceS = "", cpuChoiceS = "";



		cpuChoice = rand.nextInt(3) + 1;
		System.out.print("Enter your choice: ");
		playerChoice = scanner.nextInt();

		switch(playerChoice) {
			case ROCK:  {
				playerChoiceS = "ROCK";
			} break;
			case PAPER: {
				playerChoiceS = "PAPER";
			} break;
			case SCISSORS: {
				playerChoiceS = "SCISSORS";
			} break;
		}

		switch(cpuChoice) {
			case ROCK:  {
				cpuChoiceS = "ROCK";
			} break;
			case PAPER: {
				cpuChoiceS = "PAPER";
			} break;
			case SCISSORS: {
				cpuChoiceS = "SCISSORS";
			} break;
		}


		if(playerChoice == cpuChoice) {
			System.out.println("Hey, its a tie. You both picked: " + playerChoiceS);
		} else {

			switch(playerChoice) {
				case ROCK: {
					if(cpuChoice == PAPER) {
						// you lose
					} else {
						// You win
					}
				} break;
				case PAPER: {
					if(cpuChoice == SCISSORS) {
						// you lose
					} else {
						// You win
					}
				} break;
				case SCISSORS: {
					if(cpuChoice == ROCK) {
						// you lose
					} else {
						// You win
					}
				} break;
			}







		}



	}


}
