package com.joshua.lab9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab9_2 {

	public static void run() {

		int[] passCode = {7, 3, 4, 6, 0};

		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();

		int[] reference = new int[10];
		int[] key = new int[10];
		for (int i = 0; i < reference.length; i++) {
			reference[i] = i;
			key[i] = rand.nextInt(4);
		}

		System.out.println("\nAuthentication Process");
		System.out.println();
		System.out.println("To be granted access please enter your corresponding PIN number");

		System.out.print("Number: ");
		Arrays.stream(reference).forEach((i) -> System.out.print(i + " "));
		System.out.println();

		System.out.print("Random: ");
		Arrays.stream(key).forEach((i) -> System.out.print(i + " "));
		System.out.println();

		int[] correctPasscode = new int[5];
		for (int i = 0; i < correctPasscode.length; i++)
			correctPasscode[i] = key[passCode[i]];

		System.out.print("Enter PIN sequence: ");
		String userIn = scanner.nextLine();
		boolean pass = true;
		if (userIn.length() == correctPasscode.length) {
			int[] userInput = new int[5];
			for (int i = 0; i < 5; i++) {
				userInput[i] = userIn.charAt(i) - '0';
				if (userInput[i] != correctPasscode[i])
					pass = false;
			}
		} else {
			pass = false;
		}

		if (pass)
			System.out.println("\nCorrect PIN - authentication confirmed");
		else
			System.out.println("\nIncorrect PIN - authentication denied");

	}

}
