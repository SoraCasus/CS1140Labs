package com.joshua;

import java.util.Random;

public class Utils {

	private static Random random;

	static {
		random = new Random();
	}

	/**
	 * Generates a random number between 1(inclusive) and max(inclusive)
	 *
	 * @param max - Maximum bound (inclusive)
	 * @return Random integer between 1(inclusive) and max(inclusive)
	 */
	public static int generateRandom(int max) {
		return random.nextInt(max) + 1;
	}


}
