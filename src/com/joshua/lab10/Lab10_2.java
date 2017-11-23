package com.joshua.lab10;

import java.util.Random;
import java.util.Scanner;

public class Lab10_2 {

	public static void run() {

		Scanner scanner = new Scanner(System.in);

		int width = 15;
		int height = 20;
		int mineCount;

		char[][] minefield = new char[width][height];

		// Set Minefield to blank
		minefield = clearMinefield(minefield);

		// Generate random mines
		while (true) {
			System.out.print("Number of mines to be hidden : ");
			mineCount = scanner.nextInt();
			if (mineCount <= 0 || mineCount > (width * height)) {
				System.out.println("Please enter a valid number");
				continue;
			}
			break;

		}

		minefield = generateMines(minefield, mineCount);

		// Show minefield
		printMinefield(minefield);

		System.out.println();
		System.out.println();

		// Generate hints
		minefield = generateHints(minefield);

		// Show minefield
		printMinefield(minefield);

	}

	/**
	 * Clears the given minefield filling it entirely with '.'
	 *
	 * @param minefield - The minefield to be cleared
	 * @return - The cleared minefield
	 */
	private static char[][] clearMinefield(char[][] minefield) {
		for (char[] row : minefield) {
			for (int i = 0; i < row.length; i++) {
				row[i] = '.';
			}
		}
		return minefield;
	}

	/**
	 * Fills the given minefield with the given number of mines randomly
	 *
	 * @param minefield - The minefield to generate mines within
	 * @param mineCount - The number of mines to be generated
	 * @return - The minefield with mines generated
	 */
	private static char[][] generateMines(char[][] minefield, int mineCount) {
		int minesPlaced = 0;
		Random random = new Random();

		while (minesPlaced <= mineCount) {
			int x = random.nextInt(minefield.length);
			int y = random.nextInt(minefield[0].length);
			if (minefield[x][y] != '*') {
				minefield[x][y] = '*';
				minesPlaced++;
			}
		}
		return minefield;
	}

	/**
	 * Prints the given minefield to the console
	 *
	 * @param minefield - The minefield to be printed to the console
	 */
	private static void printMinefield(char[][] minefield) {
		for (char[] row : minefield) {
			for (char cell : row)
				System.out.print(cell);
			System.out.println();
		}
	}

	/**
	 * Generates hints indicating how many mines are adjacent to the cell
	 *
	 * @param minefield - The minefield to generate hints for
	 * @return - The minefield with generated hints
	 */
	private static char[][] generateHints(char[][] minefield) {

		for (int x = 0; x < minefield.length; x++) {
			for (int y = 0; y < minefield[0].length; y++) {
				if (minefield[x][y] != '*')
					minefield[x][y] = minesNear(minefield, x, y);
			}
		}

		return minefield;
	}

	/**
	 * Calculates how many mines are in the immediate surroundings of the given cell
	 *
	 * @param minefield - The minefield to test
	 * @param x         - The x Coordinate of the cell
	 * @param y         - The y Coordinate of the cell
	 * @return - The number of mines in the immediate surroundings
	 */
	private static char minesNear(char[][] minefield, int x, int y) {
		int mines = 0;
		mines += mineAt(minefield, x - 1, y - 1); // Up-Left
		mines += mineAt(minefield, x + 0, y - 1); // Up
		mines += mineAt(minefield, x + 1, y - 1); // Up-Right
		mines += mineAt(minefield, x - 1, y + 0); // Left
		mines += mineAt(minefield, x + 1, y + 0); // Right
		mines += mineAt(minefield, x - 1, y + 1); // Down-Left
		mines += mineAt(minefield, x + 0, y + 1); // Down
		mines += mineAt(minefield, x + 1, y + 1); // Down-Right
		if (mines > 0) {
			return (char) (mines + '0');
		}
		return '.';
	}

	/**
	 * Returns numerical boolean if a mine is located at the given location
	 *
	 * @param x - The x Coordinate
	 * @param y - The y Coordinate
	 * @return - 1 if there is a mine present, 0 if there is no mine present
	 */
	private static int mineAt(char[][] minefield, int x, int y) {
		int width = minefield.length;
		int height = minefield[0].length;
		// Check that the coordinates are in bounds
		if (x >= 0 && x < width && y >= 0 && y < height) {
			if (minefield[x][y] == '*') return 1;
		}
		return 0;
	}
}
