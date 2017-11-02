package com.joshua.lab3;

import java.util.Scanner;

public class Tripster {

	public static void run() {

		Scanner scanner = new Scanner(System.in);

		float drivingDistance;
		float efficency;
		float fuelCost;

		float totalCost;

		System.out.println("Fuel cost calculator");

		System.out.print("Driving distance in km \t\t : ");
		drivingDistance = scanner.nextFloat();

		System.out.print("Car efficency in km per litre\t : ");
		efficency = scanner.nextFloat();

		System.out.print("Cost per litre of fuel\t\t : $");
		fuelCost = scanner.nextFloat();

		totalCost = (drivingDistance / efficency) * fuelCost;

		System.out.printf("The cost of this trip will be \t : $%5.2f\n", totalCost);

		scanner.close();
	}

}
