package com.joshua.lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Part3 {

	public static void run() {

		try {
			Scanner scanner = new Scanner(new File("Lab2Data.txt"));

			int num1;
			int num2;
			int num3;
			int num4;

			scanner.nextInt();           // Skip first integer
			num1 = scanner.nextInt();

			scanner.nextLine();         // Go to the second line
			scanner.nextLine();         // Go to the third line

			for (int i = 0; i < 3; i++)  // Skip first three integers
				scanner.nextInt();
			num2 = scanner.nextInt();

			scanner.nextLine();         // Go to the third line

			num3 = scanner.nextInt();

			scanner.nextInt();          // Skip the second integer

			num4 = scanner.nextInt();

			System.out.println("First number \t : " + num1);
			System.out.println("Second number \t : " + num2);
			System.out.println("Third number \t : " + num3);
			System.out.println("Fourth number \t : " + num4);

			scanner.close();
		} catch (FileNotFoundException ex) {
			System.err.println("Failed to load file: " + "Lab2Data.txt");
			ex.printStackTrace(System.out);
		}

	}

}
