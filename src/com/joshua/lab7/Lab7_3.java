/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joshua.lab7;

import java.util.Random;

/**
 * @author 5059901
 */
public class Lab7_3 {

	private static final int NORTH = 0;
	private static final int EAST = 1;
	private static final int SOUTH = 2;
	private static final int WEST = 3;

	public static void Run(int steps) {
		Random random = new Random();

		int originX = 0;
		int originY = 0;
		int deltaX = 0;
		int deltaY = 0;

		for (int i = 1; i <= steps; i++) {
			int dir = random.nextInt(4);
			switch (dir) {
				case NORTH: {
					deltaY++;
				}
				break;
				case EAST: {
					deltaX++;
				}
				break;
				case SOUTH: {
					deltaY--;
				}
				break;
				case WEST: {
					deltaX--;
				}
				break;
				default: {
				}
				break;
			}
			System.out.println(i + "\t" + String.format("(%3d , %3d )", deltaX, deltaY));
		}

		float dx = deltaX - originX;
		float dy = deltaY - originY;
		float distance = (float) Math.sqrt(dx * dx + dy * dy);
		System.out.printf("Distance to lamp post = %4.2f\n", distance);

	}
}
