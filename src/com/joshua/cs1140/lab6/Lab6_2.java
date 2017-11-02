package com.joshua.cs1140.lab6;

import java.util.Scanner;

public class Lab6_2 {

    public static void run() {

        Scanner scanner = new Scanner(System.in);

        String word;
        String testWord;

        System.out.print("Enter a word: ");
        word = scanner.nextLine();
        testWord = word.toLowerCase();

        char[] letters = testWord.toCharArray();
        boolean isPalindrome = true;

        for(int i = 0; i < letters.length; i++) {
            if(letters[i] != letters[letters.length - i - 1])
                isPalindrome = false;
        }

        if(isPalindrome)
            System.out.println(word + " is a palindrome");
        else
            System.out.println(word + " is NOT a palindrome");

    }

}
