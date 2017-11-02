package com.joshua.lab3;

import java.util.Scanner;

public class MetricAssist {

	public static void run() {

		double miles, kilometers;
		double gallons, litres;
		double pounds, kilograms;


		Scanner scanner = new Scanner(System.in);

		System.out.println("Imperial Measurements");

		System.out.print("Enter the number of miles \t : ");
		miles = scanner.nextDouble();

		System.out.print("Enter the number of gallons \t : ");
		gallons = scanner.nextDouble();

		System.out.print("Enter the number of pounds \t : ");
		pounds = scanner.nextDouble();

		kilometers = milesToKilometers(miles);
		litres = gallonsToLitres(gallons);
		kilograms = poundsToKilograms(pounds);

		System.out.println("\nEquivalent Metric measurements");
		System.out.println("The number of kilometres is \t : " + kilometers);
		System.out.println("The number of litres is \t : " + litres);
		System.out.println("The number of kilograms is \t : " + kilograms);

		scanner.close();
	}


	private static double milesToKilometers(double miles) {
		return miles * 1.6093;
	}

	private static double gallonsToLitres(double gallon) {
		return gallon * 3.7854;
	}

	private static double poundsToKilograms(double pounds) {
		return pounds * 0.4536;
	}
}
