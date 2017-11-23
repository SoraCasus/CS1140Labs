package com.joshua.lab10;

public class Lab10_1 {

	public static void run() {

		int[][] magicSquare = {
				{16, 3, 2, 13},
				{5, 10, 11, 8},
				{9, 6, 7, 12},
				{4, 15, 14, 1}
		};

		int[] rowSum = new int[magicSquare[0].length];
		int[] colSum = new int[magicSquare[0].length];
		boolean[] rowCheck = new boolean[rowSum.length];
		boolean[] colCheck = new boolean[colSum.length];
		boolean isMagic = true;

		int majorDiag = 0;
		int minorDiag = 0;
		boolean majorCheck;
		boolean minorCheck;

		int baselineSum = 0;

		for (int i : magicSquare[0])
			baselineSum += i;           // Calculate the sum using the first row as baseline

		for (int i = 0; i < magicSquare.length; i++) {
			for (int j = 0; j < magicSquare[i].length; j++) {
				// Calculate the sums of each row and column
				rowSum[i] += magicSquare[i][j];
				colSum[i] += magicSquare[j][i];

				// Calculate the sum of the major diagonal
				if (i == j)
					majorDiag += magicSquare[i][j];

				// Calculate the sum of the minor diagonal
				if ((i + j) == magicSquare.length - 1)
					minorDiag += magicSquare[i][j];

			}
		}

		// Compare each row's sum and column's sum with the baseline sum
		for (int i = 0; i < rowSum.length; i++) {
			rowCheck[i] = rowSum[i] == baselineSum;
			colCheck[i] = colSum[i] == baselineSum;
		}

		// Compare the major diagonal and minor diagonal to the baseline sum
		majorCheck = majorDiag == baselineSum;
		minorCheck = minorDiag == baselineSum;

		// Print out the "Magic" Matrix
		for (int[] row : magicSquare) {
			for (int j = 0; j < magicSquare[0].length; j++) {
				System.out.printf("%2d\t", row[j]);
			}
			System.out.println();
		}

		// Print out the data for each Row
		// Row # = sum (Matches baseline sum)
		System.out.println();
		for (int i = 0; i < rowSum.length; i++) {
			System.out.printf("Row %d = %2d\t\t", i, rowSum[i]);
			System.out.println(rowCheck[i] ? "OK" : "NOT OK");
		}


		// Print out the data for each Row
		// Col # = sum (Matches baseline sum)
		System.out.println();
		for (int i = 0; i < colSum.length; i++) {
			System.out.printf("Col %d = %2d\t\t", i, colSum[i]);
			System.out.println(colCheck[i] ? "OK" : "NOT OK");
		}

		System.out.println();

		// Print out Major diagonal sum data
		// Major Diagonal = sum (Matches baseline sum)
		System.out.printf("Major Diagonal = %2d\t\t", majorDiag);
		System.out.println(majorCheck ? "OK" : "NOT OK");


		// Print out Minor diagonal sum data
		// Minor Diagonal = sum (Matches baseline sum)
		System.out.printf("Minor Diagonal = %2d\t\t", minorDiag);
		System.out.println(minorCheck ? "OK" : "NOT OK");

		// Check if all rows are equal to baseline sum
		for (boolean b : rowCheck)
			if (!b) isMagic = false;

		// Check if all columns are equal to baseline sum
		for (boolean b : colCheck)
			if (!b) isMagic = false;

		// Print out the result whether the matrix is a magic square or not
		System.out.println();
		if (isMagic)
			System.out.println("This square is Magical");
		else
			System.out.println("This square is not Magical");
	}


}
