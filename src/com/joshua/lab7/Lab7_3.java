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

		Vec2 origin = new Vec2(0, 0);
		Vec2 delta = new Vec2(0, 0);

		for (int i = 1; i <= steps; i++) {
			int dir = random.nextInt(4);
			switch (dir) {
				case NORTH: {
					delta.x++;
				}
				break;
				case EAST: {
					delta.y++;
				}
				break;
				case SOUTH: {
					delta.x--;
				}
				break;
				case WEST: {
					delta.y--;
				}
				break;
				default: {
				}
				break;
			}
			System.out.println(i + "\t" + delta.toString());
		}

		System.out.printf("Distance to lamp post = %4.2f\n", Vec2.Distance(origin, delta));

	}

	private static class Vec2 {
		int x;
		int y;

		public Vec2(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public static float Distance(Vec2 a, Vec2 b) {
			float dx = b.x - a.x;
			float dy = b.y - a.y;
			return (float) Math.sqrt(dx * dx + dy * dy);
		}

		public float Length() {
			return (float) Math.sqrt(x * x + y * y);
		}

		@Override
		public String toString() {
			return String.format("(%3d , %3d )", x, y);
		}
	}
}
