package com.joshua.lab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab7_4 {

	//   |   Tell Netbeans to bug off about printing to stack trace.
	//   |   It's being annoying >.>
	//   V   And I'm not happy about it
	@SuppressWarnings("CallToPrintStackTrace")
	public static void Run() {
		try {
			Scanner scanner = new Scanner(new File("Lab7Data.txt"));

			int readValue = scanner.nextInt();
			int posCount = 0;
			int posSum = 0;
			int negCount = 0;
			int negSum = 0;
			int max = 0;
			int min = 0;
			int index = 1;

			while (readValue != 0) {
				System.out.printf("Number %2d : %4d\n", index++, readValue);
				if (readValue > 0) {
					posCount++;
					posSum += readValue;
					if (readValue > max)
						max = readValue;
				} else if (readValue < 0) {
					negCount++;
					negSum += readValue;
					if (readValue < min)
						min = readValue;
				}

				readValue = scanner.nextInt();
			}

			System.out.println("\nStatistics for Positive values\n");
			System.out.printf("Count of positive numbers\t : %4d\n", posCount);
			System.out.printf("Sum of positive numbers\t\t : %4d\n", posSum);
			System.out.println("\nStatistics for Negative values\n");
			System.out.printf("Count of negative numbers\t : %4d\n", negCount);
			System.out.printf("Sum of negative numbers\t\t : %4d\n", negSum);
			System.out.println("\nOverall Stats");
			System.out.printf("Maximum number\t\t\t : %4d\n", max);
			System.out.printf("Minimum number\t\t\t : %4d\n", min);


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}


}
