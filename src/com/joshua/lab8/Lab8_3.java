package com.joshua.lab8;

import java.util.Scanner;

public class Lab8_3 {

	public static void run() {

		Scanner scanner = new Scanner(System.in);


		String answerKey;
		System.out.print("Enter an answer key\t :");
		answerKey = scanner.nextLine();

		String quizAnswers;
		System.out.print("Enter quiz answers\t :");
		quizAnswers = scanner.nextLine();

		int total = answerKey.length();

		char[] answers = answerKey.toCharArray();
		char[] choices = quizAnswers.toCharArray();

		int score = 0;

		for (int i = 0; i < answers.length; i++) {
			if (i > choices.length) break;
			if (choices[i] == answers[i]) score++;
		}

		System.out.println();
		System.out.println("Quiz score\t\t : " + score + " out of " + total + " correct");

	}

}
