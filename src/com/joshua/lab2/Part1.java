package com.joshua.lab2;

import java.util.Scanner;

public class Part1 {

	public static void run() {

		Scanner scanner = new Scanner(System.in);

		double userInput;

		System.out.print("Enter a temperature in Fahrenheit: ");

		userInput = scanner.nextDouble();

		double celcius = (5.0 / 9.0) * (userInput - 32.0);

		System.out.println("Fahrenheit \t : " + userInput);
		System.out.println("Celcius \t : " + celcius);

	}
}
