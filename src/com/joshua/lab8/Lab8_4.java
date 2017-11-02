package com.joshua.lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab8_4 {

	public static void run() {
		try {
			Scanner scanner = new Scanner(new File("Lab8Data.txt"));

			String quizName = scanner.nextLine();
			System.out.println(quizName);
			System.out.println();

			int totalQuizzes = scanner.nextInt();
			scanner.nextLine();

			String answer = scanner.nextLine();
			// System.out.println(answer);

			int classTotal = 0;

			for (int i = 0; i < totalQuizzes; i++) {

				int score = 0;
				int total = answer.length();

				String quizAnswers = scanner.next();
				String childName = scanner.nextLine();

				char[] answers = answer.toCharArray();
				char[] choices = quizAnswers.toCharArray();

				for (int j = 0; j < answers.length; j++) {
					if (j > choices.length) {
						break;
					}
					if (choices[j] == answers[j]) {
						score++;
					}
				}

				classTotal += score;

				System.out.printf("%3d\t: %s\n", score, childName);
			}

			System.out.println();
			float average = ((float) classTotal / ((float) totalQuizzes * answer.length())) * 100.0F;
			System.out.printf("Class Average = %4.2f%%\n", average);

		} catch (FileNotFoundException ignored) {
		}
	}

}
