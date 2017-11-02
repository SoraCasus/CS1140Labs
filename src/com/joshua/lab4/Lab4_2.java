package com.joshua.lab4;

import java.util.Scanner;

public class Lab4_2 {

	public static void run() {

		Scanner scanner = new Scanner(System.in);

		int totalSeconds;

		// Prompt user for seconds
		System.out.println("Reverse Seconds Computation Program");
		System.out.print("What is the total number of SECONDS: ");
		totalSeconds = scanner.nextInt();

		// Compute number of seconds
		int seconds;
		seconds = totalSeconds % 60;
		totalSeconds -= seconds;        // Remove extra seconds

		// Compute number of minutes
		int totalMinutes;
		totalMinutes = totalSeconds / 60; // Convert remaining seconds to minutes

		int minutes;
		minutes = totalMinutes % 60;
		totalMinutes -= minutes;        // Remove extra minutes

		// Compute number of hours
		int totalHours;
		totalHours = totalMinutes / 60; // Convert remaining minutes into hours

		int hours;
		hours = totalHours % 24;
		totalHours -= hours;

		// Compute number of days
		int totalDays;
		totalDays = totalHours / 24;    // Convert remaining hours into days

		int days;
		days = totalDays % 7;
		totalDays -= days;              // Remove extra days

		// Compute number of weeks
		int totalWeeks;
		totalWeeks = totalDays / 7;


		// Display output
		System.out.printf("Number of whole WEEKS\t : %3d\n", totalWeeks);
		System.out.printf("Number of whole DAYS \t : %3d\n", days);
		System.out.printf("Number of whole HOURS\t : %3d\n", hours);
		System.out.printf("Number of whole MINUTES\t : %3d\n", minutes);
		System.out.printf("Number of\tSECONDS\t : %3d\n", seconds);


	}

}
