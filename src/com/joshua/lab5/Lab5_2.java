package com.joshua.lab5;

import java.util.Scanner;

/**
 * Lab5_2
 *
 * @author Joshua Mayer
 */
public class Lab5_2 {

	private static final int BOLT_COST = 5;
	private static final int NUT_COST = 3;
	private static final int WASHER_COST = 1;

	public static void run() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Bob's Discount Bolt Program\n");

		int boltCount, nutCount, washerCount;

		System.out.print("Number of bolts\t\t : ");
		boltCount = scanner.nextInt();
		System.out.print("Number of nuts\t\t : ");
		nutCount = scanner.nextInt();
		System.out.print("Number of washers\t : ");
		washerCount = scanner.nextInt();

		System.out.println();
		if (nutCount < boltCount)
			System.out.println("Check the Order: too few nuts");
		if (washerCount < boltCount * 2)
			System.out.println("Check the Order: too few washers");
		else
			System.out.println();

		int totalCost = 0;
		totalCost += (boltCount * BOLT_COST);
		totalCost += (nutCount * NUT_COST);
		totalCost += (washerCount * WASHER_COST);

		System.out.printf("Total cost: %3d cents\n", totalCost);


	}

}
