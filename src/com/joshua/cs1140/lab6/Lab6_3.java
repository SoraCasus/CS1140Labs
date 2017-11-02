package com.joshua.cs1140.lab6;

import java.util.Random;

public class Lab6_3 {

    public static void run() {

        Random rand = new Random(System.nanoTime());

        int dice1 = rand.nextInt(6) + 1;
        int dice2 = rand.nextInt(6) + 1;
        int dice3 = rand.nextInt(6) + 1;

        System.out.println(dice1 + "\n" + dice2 + "\n" + dice3);

        boolean pair = dice1 == dice2 || dice1 == dice3 || dice2 == dice3;
        int pairedNumber = dice1 == dice2 || dice1 == dice3 ? dice1 : dice2;
        boolean triple = dice1 == dice2 && dice1 == dice3;

        if (triple) {
            System.out.println("Congratulations : You threw THREE - " + dice1 + "s");
            if (dice1 == 6)
                System.out.println("You win $20");
            else
                System.out.println("You win $10");
        } else if (pair) {
            System.out.println("Congratulations : You threw TWO - " + pairedNumber + "s");
            System.out.println("You win $5");
        } else {
            System.out.println("Unfortunately : You did not throw anything of value");
            System.out.println("You lose $1");
        }


    }

}
