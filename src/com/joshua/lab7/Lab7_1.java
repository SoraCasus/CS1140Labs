/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joshua.lab7;

import com.joshua.lab6.Lab6_3;

/**
 * @author 5059901
 */
public class Lab7_1 {

	public static void Run(int throwCount) {
		System.out.println("Dice throw simulation");

		int total = 0;
		for (int i = 0; i < throwCount; i++)
			total += Lab6_3.run(false);

		System.out.printf("After %6d runs the player made $" + total, throwCount);
		System.out.println();

	}

}
