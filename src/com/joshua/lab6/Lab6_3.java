package com.joshua.lab6;

import java.util.Random;

public class Lab6_3 {

	public static int run(boolean outputConsole) {

		Random rand = new Random(System.nanoTime());

		int dice1 = rand.nextInt(6) + 1;
		int dice2 = rand.nextInt(6) + 1;
		int dice3 = rand.nextInt(6) + 1;

		int winnings;

		if (outputConsole)
			System.out.println(dice1 + "\n" + dice2 + "\n" + dice3);

		/**
		 *  Compares the dice to see if a pair exists.
		 *  True if pair exists, false otherwise
		 */
		boolean pair = dice1 == dice2 || dice1 == dice3 || dice2 == dice3;
		/**
		 * If dice1 is one of the pairs, the paired number is dice1
		 * Otherwise it must be dice2. If no pair exists this value is not used
		 * And is assigned the value of dice2
		 */
		int pairedNumber = dice1 == dice2 || dice1 == dice3 ? dice1 : dice2;
		/**
		 * Determines if all three dice are the same value.
		 * True if all three dice values equal, false otherwise
		 */
		boolean triple = dice1 == dice2 && dice1 == dice3;

		if (triple) {
			if (outputConsole)
				System.out.println("Congratulations : You threw THREE - " + dice1 + "s");
			if (dice1 == 6) {
				if (outputConsole)
					System.out.println("You win $20");
				winnings = 20;
			} else {
				if (outputConsole)
					System.out.println("You win $10");
				winnings = 10;
			}
		} else if (pair) {
			if (outputConsole)
				System.out.println("Congratulations : You threw TWO - " + pairedNumber + "s");
			if (outputConsole)
				System.out.println("You win $5");
			winnings = 5;
		} else {
			if (outputConsole)
				System.out.println("Unfortunately : You did not throw anything of value");
			if (outputConsole)
				System.out.println("You lose $1");
			winnings = -1;
		}

		return winnings;
	}

}
