package com.joshua.lab5;

import java.util.Random;
import java.util.Scanner;

/**
 * Lab5_4
 *
 * @author Joshua Mayer
 */
public class Lab5_4 {

	private static final int ADDITION = 1;
	private static final int SUBTRACTION = 2;
	private static final int MULTIPLICATION = 3;
	private static final int DIVISION = 4;
	private static final int MODULUS = 5;


	public static void run() {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random(System.nanoTime());

		System.out.println("Arithmetic Practice Program\n");

		int x = random.nextInt(100) + 1;
		int y = random.nextInt(100) + 1;
		int operator = random.nextInt(5) + 1;
		int answer = 0;
		int userIn;

		System.out.print("Question: ");

		switch (operator) {
			case ADDITION: {
				System.out.print(x + " + " + y + " = ");
				answer = x + y;
			}
			break;

			case SUBTRACTION: {
				System.out.print(x + " - " + y + " = ");
				answer = x - y;
			}
			break;

			case MULTIPLICATION: {
				System.out.print(x + " * " + y + " = ");
				answer = x * y;
			}
			break;

			case DIVISION: {
				System.out.print(x + " / " + y + " = ");
				answer = x / y;
			}
			break;

			case MODULUS: {
				System.out.print(x + " % " + y + " = ");
				answer = x % y;
			}
			break;
		}

		userIn = scanner.nextInt();

		if (userIn == answer)
			System.out.println("Correct");
		else
			System.out.println("Incorrect");

	}


}
