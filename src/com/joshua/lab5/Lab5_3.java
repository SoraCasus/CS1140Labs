package com.joshua.lab5;

import java.util.Scanner;

/**
 * Lab5_3
 *
 * @author Joshua Mayer
 */
public class Lab5_3 {

	public static void run() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Integer Math Calculator Program\n");
		System.out.println("Operations Available\n");
		System.out.println("+ \t Addition");
		System.out.println("- \t Subtraction");
		System.out.println("* \t Multiplication");
		System.out.println("/ \t Division");
		System.out.println("% \t Remainder");
		System.out.println();

		char selecter;

		System.out.print("Which operation do you wish : ");
		selecter = scanner.nextLine().charAt(0);

		int x, y;
		int answer;
		System.out.println();
		System.out.print("Enter Value for X : ");
		x = scanner.nextInt();
		System.out.print("Enter Value for Y : ");
		y = scanner.nextInt();

		switch (selecter) {
			case '+': {
				System.out.println(x + " + " + y + " = " + (x + y));
			}
			break;
			case '-': {
				System.out.println(x + " - " + y + " = " + (x - y));
			}
			break;
			case '*': {
				System.out.println(x + " * " + y + " = " + (x * y));
			}
			break;
			case '/': {
				if (y == 0) {
					System.out.println("Division by zero error!\nPlease try again!\n\n");
					run();
				}
				System.out.println(x + " / " + y + " = " + (x / y));
			}
			break;
			case '%': {
				if (y == 0) {
					System.out.println("Division by zero error!\nPlease try again!");
					run();
				}
				System.out.println(x + " % " + y + " = " + (x % y));
			}
			break;
			default: {
				System.out.println("Please enter a valid operator!");
				run();
			}
			break;
		}
	}
}
