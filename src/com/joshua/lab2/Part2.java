package com.joshua.lab2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Part2 {

	public static void run() {

		DecimalFormat format = new DecimalFormat("0.00");

		Scanner scanner = new Scanner(System.in);

		double price;
		double gst;
		double totalPrice;

		System.out.print("Please enter the item price: $");

		price = scanner.nextDouble();
		gst = price * 0.05;
		totalPrice = price * 1.05;

		System.out.println("Price \t : $" + format.format(price));
		System.out.println("GST \t : $" + format.format(gst));
		System.out.println("Total \t : %" + format.format(totalPrice));

		System.out.println();

		double tendered;
		double changeDue;

		System.out.print("Enter the amount tendered: $");
		tendered = scanner.nextDouble();
		changeDue = tendered - totalPrice;

		if (changeDue < 0.0) {
			double amountDue = -changeDue;
			System.out.println("You did not give enough money!");
			System.out.println("You still owe \t : " + format.format(amountDue));
		}

		System.out.println("Tendered \t : " + format.format(tendered));
		System.out.println("Price \t\t : " + format.format(totalPrice));
		System.out.println("Change Due \t : " + format.format(changeDue));

	}

}
