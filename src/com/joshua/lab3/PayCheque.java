package com.joshua.lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PayCheque {

	private static final int MONDAY = 0;
	private static final int TUESDAY = 1;
	private static final int WEDNESDAY = 2;
	private static final int THURSDAY = 3;
	private static final int FRIDAY = 4;
	private static final int SATURDAY = 5;
	private static final int SUNDAY = 6;

	public static void run() {

		try {
			Scanner scanner = new Scanner(new File("Lab3Data.txt"));


			// Emplyee Data
			String employeeName;
			float hourlyWage;
			float[] hours = new float[7];
			float totalHours = 0.0F;
			float totalSalary;

			// Parse Data
			employeeName = scanner.nextLine();
			hourlyWage = scanner.nextFloat();

			for (int i = 0; i < 7; i++) {
				hours[i] = scanner.nextFloat();
				totalHours += hours[i];
			}

			totalSalary = totalHours * hourlyWage;

			// Display Data
			System.out.println("Employee Paystub\n");

			System.out.println("Emplyee Name \t\t\t : " + employeeName);
			System.out.printf("Hourly wage \t\t\t : $%2.2f", hourlyWage);
			System.out.print("\n\n");
			System.out.println("Hours worked on Monday \t\t : " + hours[MONDAY]);
			System.out.println("Hours worked on Tuesday \t : " + hours[TUESDAY]);
			System.out.println("Hours worked on Wednesday \t : " + hours[WEDNESDAY]);
			System.out.println("Hours worked on Thursday \t : " + hours[THURSDAY]);
			System.out.println("Hours worked on Friday \t\t : " + hours[FRIDAY]);
			System.out.println("Hours worked on Saturday \t : " + hours[SATURDAY]);
			System.out.println("Hours worked on Sunday \t\t : " + hours[SUNDAY]);

			System.out.print("\n");

			System.out.printf("Total hours worked \t\t : %2.2f \n", totalHours);

			System.out.print("\n");

			System.out.printf("Monday \t\t earnings \t : $%6.2f\n", hours[MONDAY] * hourlyWage);
			System.out.printf("Tuesday \t earnings \t : $%6.2f\n", hours[TUESDAY] * hourlyWage);
			System.out.printf("Wednesday \t earnings \t : $%6.2f\n", hours[WEDNESDAY] * hourlyWage);
			System.out.printf("Thursday \t earnings \t : $%6.2f\n", hours[THURSDAY] * hourlyWage);
			System.out.printf("Friday \t\t earnings \t : $%6.2f\n", hours[FRIDAY] * hourlyWage);
			System.out.printf("Saturday \t earnings \t : $%6.2f\n", hours[SATURDAY] * hourlyWage);
			System.out.printf("Sunday \t\t earnings \t : $%6.2f\n", hours[SUNDAY] * hourlyWage);
			System.out.printf("\nTotal Salary \t\t\t : $%6.2f\n", totalSalary);

			scanner.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace(System.err);
		}
	}


}
