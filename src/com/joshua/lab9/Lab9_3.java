package com.joshua.lab9;

import com.joshua.Utils;

import java.util.Arrays;
import java.util.Scanner;

public class Lab9_3 {

	public static void run() {

		Scanner scanner = new Scanner(System.in);

		int[] randomList = new int[50];
		for (int i = 0; i < randomList.length; i++)
			randomList[i] = Utils.generateRandom(9);

		Arrays.stream(randomList).forEach(System.out::print);
		System.out.println();
		for (int i = 0; i <= 4; i++) {
			System.out.print(i);
			for (int j = 0; j < 9; j++)
				System.out.print(" ");
		}
		System.out.println();
		for (int i = 0; i < 50; i++) {
			System.out.print(i % 10);
		}
		System.out.println("\n");

		boolean running = true;

		while (running) {
			int[] target = new int[4];
			boolean found = false;
			int index = 0;
			System.out.println("Enter the sequence of digits you wish to search for:");
			System.out.print("Enter number 1: ");
			target[index++] = scanner.nextInt();
			System.out.print("Enter number 2: ");
			target[index++] = scanner.nextInt();
			System.out.print("Enter number 3: ");
			target[index++] = scanner.nextInt();
			System.out.print("Enter number 4: ");
			target[index] = scanner.nextInt();

			int indexFoundAt = 0;

			for (int i = 0; i < randomList.length; i++) {
				if ((i + 4) >= 50) break;
				if (randomList[i] == target[0]) {
					for (int j = 0; j < target.length; j++) {
						if (randomList[i + j] != target[j]) break;
						if (j == target.length - 1) found = true;
					}
				}
				if (found) {
					indexFoundAt = i;
					break;
				}
			}


			if (found) {
				System.out.print("The sequence ");
				Arrays.stream(target).forEach(System.out::print);
				System.out.println(" is FOUND - it starts at index location " + (indexFoundAt));
				System.out.print("Do you wish to search for another? (Y/N): ");
				scanner.nextLine();
				String startAgain = scanner.nextLine();
				if (startAgain.toLowerCase().equals("n")) running = false;
			} else {
				System.out.print("The sequence ");
				Arrays.stream(target).forEach(System.out::print);
				System.out.println(" is NOT FOUND in the list.");
				System.out.print("Do you wish to search for another? (Y/N): ");
				scanner.nextLine();
				String startAgain = scanner.nextLine();
				if (startAgain.toLowerCase().equals("n")) running = false;
			}
		}

	}
}
