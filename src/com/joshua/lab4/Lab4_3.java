package com.joshua.lab4;

import java.util.Scanner;

public class Lab4_3 {

	private static final double EARTH_RADIUS = 6391.2F;

	public static void run() {

		Scanner scanner = new Scanner(System.in);

		double startLong;
		double startLat;

		double endLong;
		double endLat;

		// Prompt user for input
		System.out.println("Great Circle Distance Program\n");
		System.out.println("Start Location");
		System.out.print("Enter latitude \t: ");
		startLat = scanner.nextDouble();
		System.out.print("Enter longitude : ");
		startLong = scanner.nextDouble();

		System.out.println("\nEnd Location");
		System.out.print("Enter latitude \t: ");
		endLat = scanner.nextDouble();
		System.out.print("Enter longitude\t: ");
		endLong = scanner.nextDouble();

		// Convert Lat/Long to Radians
		double startLongRad;
		double startLatRad;
		double endLongRad;
		double endLatRad;

		startLongRad = Math.toRadians(startLong);
		startLatRad = Math.toRadians(startLat);

		endLongRad = Math.toRadians(endLong);
		endLatRad = Math.toRadians(endLat);

		// Calculate Distance
		double x1, x2, x3;
		double z1, z2;
		double a;
		double distance;
		int distRnd;

		x1 = Math.sin(startLatRad);
		z1 = Math.cos(startLatRad);

		x2 = Math.sin(endLatRad);
		z2 = Math.cos(endLatRad);

		x3 = Math.cos(endLongRad - startLongRad);

		a = (x1 * x2) + (z1 * z2 * x3);

		distance = EARTH_RADIUS * Math.acos(a);
		distRnd = (int) distance;
		// Output result

		System.out.println("Computed Distance\t : " + distRnd);

	}


}
