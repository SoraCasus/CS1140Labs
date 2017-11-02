package com.joshua.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab4_4 {

	public static void run() {
		// Open SecretMsg.txt
		try {
			Scanner scanner = new Scanner(new File("SecretMsg.txt"));

			String instr1;
			String instr2;
			String instr3;
			String instr4;
			String instr5;
			String instr6;
			String finalMsg;

			// 4th Word on the 1st line

			scanner.next();
			scanner.next();
			scanner.next();
			instr1 = scanner.next();
			scanner.nextLine();

			//  System.out.println(instr1);
			// Extract and combine the first letters of the 2nd, 3rd and 4th words of 2nd line (Uppercase)
			String w2, w3, w4;
			char c2, c3, c4;

			scanner.next();
			w2 = scanner.next();
			w3 = scanner.next();
			w4 = scanner.next();
			c2 = w2.charAt(0);
			c3 = w3.charAt(0);
			c4 = w4.charAt(0);

			instr2 = "";
			instr2 += c2;
			instr2 += c3;
			instr2 += c4;
			instr2 = instr2.toUpperCase();

			// System.out.println(instr2);

			scanner.nextLine();

			// Extract and concatneate the 2nd word in the 3rd line with the 8th to 11th chars from the 4th line
			scanner.next();
			instr3 = scanner.next();
			scanner.nextLine();

			char c8, c9, c10, c11;
			String line4;
			line4 = scanner.nextLine();
			c8 = line4.charAt(8);
			c9 = line4.charAt(9);
			c10 = line4.charAt(10);
			c11 = line4.charAt(11);

			instr3 += c8;
			instr3 += c9;
			instr3 += c10;
			instr3 += c11;

			//System.out.println(instr3);

			// Extract the first 4 chars of the 7th word in the 5th line
			String word7;
			scanner.next();
			scanner.next();
			scanner.next();
			scanner.next();
			scanner.next();
			scanner.next();
			word7 = scanner.next();

			instr4 = word7.substring(0, 4);
			// System.out.println(instr4);

			// The 4th and 5th chars of the 10th word on 5th line
			String word10;

			scanner.next();
			scanner.next();
			word10 = scanner.next();

			char ch4, ch5;
			ch4 = word10.charAt(3);
			ch5 = word10.charAt(4);

			instr5 = "";
			instr5 += ch4;
			instr5 += ch5;

			scanner.nextLine();

			// System.out.println(instr5);
			// Concat 3rd token in line 6 w/ char ':' followed by length of 7th line

			String token3;
			scanner.next();
			scanner.next();
			token3 = scanner.next();

			instr6 = token3;
			instr6 += ':';
			scanner.nextLine();

			String line7;
			line7 = scanner.nextLine();

			int leng = line7.length();

			instr6 += leng;

			// System.out.println(instr6);

			finalMsg = instr1 + " " + instr2 + " " + instr3 + " " + instr4 + " " + instr5 + " " + instr6;

			System.out.println(finalMsg);

		} catch (FileNotFoundException e) {

		}

	}

}
