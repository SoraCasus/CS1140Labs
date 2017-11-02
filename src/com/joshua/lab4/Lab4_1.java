package com.joshua.lab4;

import java.util.Scanner;

public class Lab4_1 {

	public static void run() {
		Scanner scanner = new Scanner(System.in);

		int weeks;
		int days;
		int hours;
		int minutes;
		int seconds;

		int totalSeconds = 0;

		// Prompt user for weeks
		System.out.println("Seconds Computation Program\n");
		System.out.print("How many WEEKS\t : ");
		weeks = scanner.nextInt();

		// Prompt user for days
		System.out.print("How many DAYS\t : ");
		days = scanner.nextInt();

		// Prompt user for hours
		System.out.print("How many HOURS\t : ");
		hours = scanner.nextInt();

		// Prompt user for minutes
		System.out.print("How many MINUTES : ");
		minutes = scanner.nextInt();

		// Prompt user for seconds
		System.out.print("How many SECONDS : ");
		seconds = scanner.nextInt();

		// Compute total seconds in time period
		int weekInSeconds = weeks;
		weekInSeconds *= 7;     // Weeks -> Days
		weekInSeconds *= 24;    // Days -> Hours
		weekInSeconds *= 60;    // Hours -> Minutes
		weekInSeconds *= 60;    // Minutes -> Seconds
		totalSeconds += weekInSeconds;

		int daysInSeconds = days;
		daysInSeconds *= 24;    // Days -> Hours
		daysInSeconds *= 60;    // Hours -> Minutes
		daysInSeconds *= 60;    // Minutes -> Seconds
		totalSeconds += daysInSeconds;

		int hoursInSeconds = hours;
		hoursInSeconds *= 60;   // Hours -> Minutes
		hoursInSeconds *= 60;   // Minutes -> Seconds
		totalSeconds += hoursInSeconds;

		int minutesInSeconds = minutes;
		minutesInSeconds *= 60; // Minutes -> Seconds
		totalSeconds += minutesInSeconds;

		totalSeconds += seconds;

		// Display info
		System.out.println();
		System.out.println("Total SECONDS during that time period is : " + totalSeconds);

	}
}
