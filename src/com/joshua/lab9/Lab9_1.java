package com.joshua.lab9;

import com.joshua.Utils;

import java.util.Arrays;
import java.util.Random;

public class Lab9_1 {


	public static void run() {

		Random random = new Random();


		// Generate array1 and array2
		// Store max values in array3 and min in array 4
		// Process data for max/min/avg/aboveAvg

		int[] array1 = new int[10];
		int[] array2 = new int[10];
		int[] array3 = new int[10];
		int[] array4 = new int[10];

		for (int i = 0; i < 10; i++) {
			array1[i] = Utils.generateRandom(99);
			array2[i] = Utils.generateRandom(99);

			if (array1[i] > array2[i]) {
				array3[i] = array1[i];
				array4[i] = array2[i];
			} else {
				array3[i] = array2[i];
				array4[i] = array1[i];
			}
		}

		System.out.println();

		System.out.print("List 1 =\t ");
		Arrays.stream(array1).forEach((i) -> System.out.printf("%2d ", i));
		System.out.print("\n");

		System.out.print("List 2 =\t ");
		Arrays.stream(array2).forEach((i) -> System.out.printf("%2d ", i));
		System.out.print("\n\n");

		System.out.print("List 3 =\t ");
		Arrays.stream(array3).forEach((i) -> System.out.printf("%2d ", i));
		System.out.print("\n");

		System.out.print("List 4 =\t ");
		Arrays.stream(array4).forEach((i) -> System.out.printf("%2d ", i));
		System.out.print("\n\n");

		System.out.println("\t\t\t Average \t Minimum \t Maximum \t Above Average");
		System.out.println("List 1 =\t " + processArray(array1).toString());
		System.out.println("List 2 =\t " + processArray(array2).toString());
		System.out.println("List 3 =\t " + processArray(array3).toString());
		System.out.println("List 4 =\t " + processArray(array4).toString());

	}


	private static ArrayData processArray(int[] data) {
		ArrayData res = new ArrayData();
		int total = 0;
		res.min = data[0];
		res.max = data[0];

		for (int i : data) {
			total += i;

			if (i > res.max)
				res.max = i;
			if (i < res.min)
				res.min = i;
		}

		res.average = (float) total / (float) data.length;

		for (int i : data) {
			if (i > res.average)
				res.aboveAverage++;
		}

		return res;
	}

	private static class ArrayData {
		int max;
		int min;
		float average;
		int aboveAverage = 0;

		public String toString() {
			return String.format("%7.1f \t\t %3d \t\t %3d \t\t\t %2d", average, min, max, aboveAverage);
		}
	}


}
