package com.joshua.lab3;

import java.util.Scanner;

public class EqTester {

	public static void run() {

		Scanner scanner = new Scanner(System.in);

		int a;
		int b;
		int c;
		int answer;

		System.out.println("Equasion Tester");
		System.out.print("Enter the value for the variable a \t : ");
		a = scanner.nextInt();

		System.out.print("Enter the value for the variable b \t : ");
		b = scanner.nextInt();

		System.out.print("Enter the value for the variable c \t : ");
		c = scanner.nextInt();

		answer = ((4 * a) / (a + 1)) + (4 * (a + b * c)) - ((5 * (3 + a)) / (b + c));

		System.out.println("The value of the expression is \t\t : " + answer);

		scanner.close();
	}


}
