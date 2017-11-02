package com.joshua.lab8;

import java.util.Scanner;

public class Lab8_1 {

	public static void run() {

		Scanner scanner = new Scanner(System.in);

		// Output program header
		System.out.println("Square Root approximation program\n");
		// Get user input
		// Get value
		int value;
		System.out.print("Enter the value (SQRT)\t:");
		value = scanner.nextInt();

		// Get tolerance
		double tolerance;
		System.out.print("Enter the tolerance\t:");
		tolerance = scanner.nextDouble();

		if (tolerance == 0.0)
			tolerance = 0.00000000001;

		System.out.println("Iteration\tGuess Value\tGuess Squared\tAbsolute Difference");
		// Iterate until within tolerance
		int guessNumber = 1;
		double y = 1;
		while (true) {
			double x = (double) value;
			double quo = x / y;
			y = (y + quo) / 2;
			double absDiff = Math.abs(x - (y * y));
			System.out.printf("%8d\t%8.5f\t%8.5f\t%8.5f\n", guessNumber++, y, y * y, absDiff);
			if (absDiff < tolerance)
				break;
		}

		System.out.printf("\nApproximated Square root of %d =%8.5f\n", value, y);


	}
}
