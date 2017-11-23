package com.joshua.lab8;

import java.util.Scanner;

public class Lab8_2 {

	public static void run() {

		// Output Program Header
		// Generate options
		/*
		 * Pattern 1:          Pattern 2:
         * 1                   1 2 3 4
         * 1 2                 1 2 3
         * 1 2 3               1 2
         * 1 2 3 4             1
         *
         * Pattern 3:          Pattern 4:
         *       1             4 3 2 1
         *     2 1               3 2 1
         *   3 2 1                 2 1
         * 4 3 2 1                   1
         *
         */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Pattern Generator Program (PGP)\n");
		boolean running = true;

		while (running) {
			int pattern;
			System.out.print("Choose a pattern (1 - 4): ");
			pattern = scanner.nextInt();
			int rows;
			System.out.print("How many rows (3 - 9)\t: ");
			rows = scanner.nextInt();

			boolean patternError = false;
			StringBuilder sb = new StringBuilder();
			switch (pattern) {
				case 1: {
					for (int i = 0; i < rows + 1; i++) {
						for (int j = 0; j < i; j++) {
							sb.append(j + 1).append(" ");
						}
						sb.append("\n");
					}
					System.out.println(sb.toString());
				}
				break;
				case 2: {
					for (int i = rows; i > 0; i--) {
						for (int j = 0; j < i; j++) {
							sb.append(j + 1).append(" ");
						}
						sb.append("\n");
					}
					System.out.println(sb.toString());
				}
				break;
				case 3: {
					for (int i = 0; i < rows; i++) {
						for (int k = 0; k < (rows - i) * 2; k++) {
							sb.append(" ");
						}
						for (int j = i; j >= 0; j--) {
							sb.append(j + 1).append(" ");
						}
						sb.append("\n");
					}

					System.out.println(sb.toString());
				}
				break;
				case 4: {
					for (int i = rows; i >= 0; i--) {
						for (int k = 0; k < (rows - i) * 2; k++) {
							sb.append(" ");
						}
						for (int j = 0; j < i; j++) {
							sb.append(j + 1).append(" ");
						}
						sb.append("\n");
					}
					System.out.println(sb.toString());
				}
				break;
				default: {
					System.out.println("Please enter a valid value!");
					patternError = true;
				}
			}

			if (patternError) {
				continue;
			}

			scanner.nextLine();

			String opt = "";
			System.out.print("Do you wish to do another (Y/N)? :");
			opt = scanner.nextLine();

			opt = opt.trim().toLowerCase();
			running = opt.charAt(0) == 'y';
		}

	}
}
