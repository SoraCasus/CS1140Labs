package com.joshua.lab10;

import java.util.Arrays;
import java.util.Random;

public class Lab10_3 {

// ================================
// add your methods here
// ================================

	public static void run() {
		int[] list1 = new int[10];
		int[] list2 = new int[10];
		int[] list3 = new int[10];
		int[] list4 = new int[10];

		double list1avg, list2avg, list3avg, list4avg;
		int list1max, list2max, list3max, list4max;
		int list1min, list2min, list3min, list4min;
		int list1AboveAvg, list2AboveAvg, list3AboveAvg, list4AboveAvg;

		loadArray(list1);
		loadArray(list2);

		for (int i = 0; i < 10; i++)
			if (list1[i] > list2[i]) {
				list3[i] = list1[i];
				list4[i] = list2[i];
			} else {
				list3[i] = list2[i];
				list4[i] = list1[i];
			}

		list1min = findMin(list1);
		list2min = findMin(list2);
		list3min = findMin(list3);
		list4min = findMin(list4);

		list1max = findMax(list1);
		list2max = findMax(list2);
		list3max = findMax(list3);
		list4max = findMax(list4);

		list1avg = findAvg(list1);
		list2avg = findAvg(list2);
		list3avg = findAvg(list3);
		list4avg = findAvg(list4);

		list1AboveAvg = findAboveAvg(list1, list1avg);
		list2AboveAvg = findAboveAvg(list2, list2avg);
		list3AboveAvg = findAboveAvg(list3, list3avg);
		list4AboveAvg = findAboveAvg(list4, list4avg);

		printList(list1, 1);
		printList(list2, 2);
		printList(list3, 3);
		printList(list4, 4);

		System.out.println();
		System.out.println();

		System.out.println("         Average  Min    Max     Above Avg");
		System.out.printf("\nList 1 %7.1f   %4d   %4d   %11d", list1avg, list1min, list1max, list1AboveAvg);
		System.out.printf("\nList 2 %7.1f   %4d   %4d   %11d", list2avg, list2min, list2max, list2AboveAvg);
		System.out.printf("\nList 3 %7.1f   %4d   %4d   %11d", list3avg, list3min, list3max, list3AboveAvg);
		System.out.printf("\nList 4 %7.1f   %4d   %4d   %11d", list4avg, list4min, list4max, list4AboveAvg);
	}

	/**
	 * Loads random values into array ranging from 1(inclusive) -> 99(inclusive)
	 *
	 * @param list - The array to be filled
	 */
	private static void loadArray(int[] list) {
		Random random = new Random();
		for (int i = 0; i < list.length; i++) {
			list[i] = random.nextInt(99) + 1;
		}
	}

	/**
	 * Sorts through the array returning the lowest value possible
	 *
	 * @param list - The array to be searched
	 * @return - The lowest value within the array
	 */
	private static int findMin(int[] list) {
		int min = list[0];
		for (int i : list)
			if (i < min)
				min = i;

		return min;
	}

	/**
	 * Sorts through the array returning the highest value possible
	 *
	 * @param list - The array to be searched
	 * @return - The highest value within the array
	 */
	private static int findMax(int[] list) {
		int max = list[0];
		for (int i : list)
			if (i > max)
				max = i;

		return max;
	}

	/**
	 * Calculates the average of all the values in the given array
	 *
	 * @param list - The array to calculate the average for
	 * @return - The average of the given array
	 */
	private static double findAvg(int[] list) {
		int total = 0;
		for (int i : list)
			total += i;
		return (double) total / (double) list.length;
	}

	/**
	 * Counts the number of values which are greater than the given average
	 *
	 * @param list    - The list to be tested
	 * @param average - The average to compare all values to
	 * @return - The number of values which are greater than the given average
	 */
	private static int findAboveAvg(int[] list, double average) {
		int count = 0;
		for (int i : list)
			if (i > average) count++;
		return count;
	}

	private static void printList(int[] list, int num) {
		System.out.print("List " + num + " =\t ");
		Arrays.stream(list).forEach((i) -> System.out.printf("%2d ", i));
		System.out.print("\n");
	}
}