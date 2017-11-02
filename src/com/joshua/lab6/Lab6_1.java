package com.joshua.lab6;

import java.util.Scanner;

public class Lab6_1 {

    public static void run() {

        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.print("Enter a three digit integer : ");
        num = scanner.nextInt();


         if((num / 100) == (num % 10))
             System.out.println(num + " is a palindrome");
         else
             System.out.println(num + " is NOT a palindrome");
    }



}
