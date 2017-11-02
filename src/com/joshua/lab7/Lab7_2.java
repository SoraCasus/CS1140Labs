/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joshua.lab7;

import java.util.Random;
import java.util.Scanner;

/**
 * @author 5059901
 */
public class Lab7_2 {

	public static void Run(int numThrows) {

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		int diceValue;

		System.out.print("What Die total do you wish to test for (2 - 12): ");
		diceValue = scanner.nextInt();

		if (diceValue > 12 || diceValue < 2) {
			System.out.println("Please enter a valid number between 2 & 12");
			Run(numThrows);
		}


		System.out.println("Die throws \t Probability");
		int numValuesAchieved = 0;

		for (int i = 1; i <= numThrows; i++) {
			int num1 = random.nextInt(6) + 1;
			int num2 = random.nextInt(6) + 1;

			if ((num1 + num2) == diceValue)
				numValuesAchieved++;

			if (i % 1000 == 0) {
				float probability = (float) numValuesAchieved / (float) i;
				System.out.printf("%8d \t %7.5f\n", i, probability);
			}
		}


	}

}
