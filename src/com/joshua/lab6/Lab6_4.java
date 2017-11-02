package com.joshua.lab6;

import java.util.Random;
import java.util.Scanner;

public class Lab6_4 {

	private static final int ROCK = 1;
	private static final int PAPER = 2;
	private static final int SCISSORS = 3;


	public static void run() {

		Scanner scanner = new Scanner(System.in);
		Random rand = new Random(System.nanoTime());

		int playerChoice;
		String endMsg = "";
		String cpuChoiceS = "";
		String playerChoiceS = "";

		System.out.println("Choices are\t 1: Rock");
		System.out.println("\t\t\t 2: Paper");
		System.out.println("\t\t\t 3: Scissors");
		System.out.print("Which do you choose (1, 2, 3) : ");
		playerChoice = scanner.nextInt();

		int cpuChoice = rand.nextInt(3) + 1;

		if (cpuChoice == playerChoice) {
			if (cpuChoice == ROCK) {
				cpuChoiceS = "ROCK";
				playerChoiceS = "ROCK";
			} else if (cpuChoice == PAPER) {
				cpuChoiceS = "PAPER";
				playerChoiceS = "PAPER";
			} else {
				cpuChoiceS = "SCISSORS";
				playerChoiceS = "SCISSORS";
			}
			endMsg = "We tie";
		} else {
			switch (cpuChoice) {
				case ROCK: {
					cpuChoiceS = "ROCK";

					if (playerChoice == PAPER) {
						endMsg = "You win";
						playerChoiceS = "PAPER";
					} else {
						endMsg = "I win";
						playerChoiceS = "SCISSORS";
					}
				}
				break;
				case PAPER: {
					cpuChoiceS = "PAPER";

					if (playerChoice == SCISSORS) {
						endMsg = "You win";
						playerChoiceS = "SCISSORS";
					} else {
						endMsg = "I win";
						playerChoiceS = "ROCK";
					}
				}
				break;
				case SCISSORS: {
					cpuChoiceS = "SCISSORS";

					if (playerChoice == ROCK) {
						endMsg = "You win";
						playerChoiceS = "ROCK";
					} else {
						endMsg = "I win";
						playerChoiceS = "PAPER";
					}
				}
				break;
			}
		}


		System.out.println("You picked " + playerChoiceS + " and I picked " + cpuChoiceS + "\t : " + endMsg);


	}

}
