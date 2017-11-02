package com.joshua.lab6;

import java.util.Random;
import java.util.Scanner;

public class Lab6_5 {

    private static final int ADD = 0;
    private static final int SUB = 1;
    private static final int MUL = 2;
    private static final int DIV = 3;
    private static final int MOD = 4;


    public static void run() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(System.nanoTime());

        int questionCount;
        int correctCount = 0;

        System.out.println("Arithmetic Practise Program");
        System.out.print("How many questions do you wish to try : ");
        questionCount = scanner.nextInt();

        for(int i = 0; i < questionCount; i++) {
            int x = random.nextInt(100) + 1;
            int y = random.nextInt(100) + 1;
            int sign = random.nextInt(5);
            int answer = 0;

            switch(sign) {
                case ADD: {
                    System.out.print(x + " + " + y + " = ");
                    answer = scanner.nextInt();

                    if(answer == (x + y)) {
                        correctCount++;
                        System.out.println("Correct\n");
                    } else {
                        System.out.println("Incorrect - the correct answer is: " + (x + y) + "\n");
                    }
                } break;
                case SUB: {
                    System.out.print(x + " - " + y + " = ");
                    answer = scanner.nextInt();

                    if(answer == (x - y)) {
                        correctCount++;
                        System.out.println("Correct\n");
                    } else {
                        System.out.println("Incorrect - the correct answer is: " + (x - y) + "\n");
                    }
                } break;
                case MUL: {

                    System.out.print(x + " * " + y + " = ");
                    answer = scanner.nextInt();

                    if(answer == (x * y)) {
                        correctCount++;
                        System.out.println("Correct\n");
                    } else {
                        System.out.println("Incorrect - the correct answer is: " + (x * y) + "\n");
                    }
                } break;
                case DIV: {

                    System.out.print(x + " / " + y + " = ");
                    answer = scanner.nextInt();

                    if(answer == (x / y)) {
                        correctCount++;
                        System.out.println("Correct\n");
                    } else {
                        System.out.println("Incorrect - the correct answer is: " + (x / y) + "\n");
                    }
                } break;
                case MOD: {

                    System.out.print(x + " % " + y + " = ");
                    answer = scanner.nextInt();

                    if(answer == (x % y)) {
                        correctCount++;
                        System.out.println("Correct\n");
                    } else {
                        System.out.println("Incorrect - the correct answer is: " + (x % y) + "\n");
                    }
                } break;
            }
        }

        float average = correctCount != 0 ? ((float)correctCount / (float)questionCount) * 100.0F : 0.0F;

        System.out.println("You got " + correctCount + " out of a maximum of " + questionCount + " questions");
        System.out.printf("Your average is: %7.2f%%", average);

    }


}
