package com.joshua.lab5;

import java.util.Scanner;

public class Lab5_1 {

	public static void run() {

		Scanner scanner = new Scanner(System.in);

		// Ouput program header
		System.out.println("Ground Beef Calculator Program\n");

		// Prompt user for data
		float pkgPrice1, pkgPrice2;
		float fatContent1, fatContent2;
		float fullPrice1, fullPrice2;
		System.out.print("Price per pound first package\t\t : ");
		pkgPrice1 = scanner.nextFloat();

		System.out.print("Percent lean beef for first package\t : ");
		fatContent1 = scanner.nextFloat();

		fullPrice1 = pkgPrice1 / (fatContent1 / 100F);

		System.out.println();

		System.out.print("Price per pound second package\t\t : ");
		pkgPrice2 = scanner.nextFloat();

		System.out.print("Percent lean beef for second package\t : ");
		fatContent2 = scanner.nextFloat();

		fullPrice2 = pkgPrice2 / (fatContent2 / 100F);

		System.out.println();
		System.out.printf("First package cost per pound of lean\t : $ %4.2f\n", fullPrice1);
		System.out.printf("Second package cost per pound of lean\t : $ %4.2f\n", fullPrice2);


		// Respond with best value

		System.out.println();
		if (fullPrice1 == fullPrice2)
			System.out.println("Both packages are equal in value!");
		else if (fullPrice1 < fullPrice2)
			System.out.println("First package is the better value!");
		else
			System.out.println("Second package is the better value!");


	}

}
