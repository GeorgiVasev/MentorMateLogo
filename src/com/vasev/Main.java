package com.vasev;

import java.util.Scanner;


public class Main {

    /*

    This method prints Mentor Mate logo based on the input of size,
    number must be odd and bigger than 2.

    Size = 3;
    ---***---***------***---***---
    --*****-*****----*****-*****--
    -***-*****-***--***-*****-***-
    ***---***---******---***---***

    */

    public static void printMM(int size) {

        String space = "-";
        String star = "*";

        // Sets how many rows will M have
        int rowCount = size + 1;

        int spaceCounter = size;
        int starCounter = size;
        int starCounterTwo = size;
        int gapCounter = size;
        int gapCounterTwo = size;

        for (int i = 1; i <= rowCount; i++) {
            System.out.println();

            int m = 0;
            while (m < 2) {

                System.out.print(space.repeat(spaceCounter));
                System.out.print(star.repeat(starCounter));
                System.out.print(space.repeat(gapCounter));
                System.out.print(star.repeat(starCounterTwo));

                if (i > rowCount / 2) {
                    System.out.print(space.repeat(gapCounterTwo));
                    System.out.print(star.repeat(size));
                }

                System.out.print(space.repeat(spaceCounter));

                m++;
            }

            if (i > rowCount / 2) {

                starCounterTwo -= 2;
                gapCounter += 2;
                gapCounterTwo += 2;

            } else if (i < rowCount / 2) {

                gapCounterTwo -= 2;
                gapCounter -= 2;
                starCounter += 2;
                starCounterTwo += 2;

            } else {

                starCounter -= size - 1;

            }

            spaceCounter--;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter an odd number for size ");

        int size = in.nextInt();
        System.out.println();
        System.out.println("N = " + size);

        if (size > 2 && size <= 10000 && (size % 2) != 0) {
            printMM(size);
        } else {
            System.out.println(size + " is an invalid number!");
            System.out.println("Number must be odd.");
        }
    }
}

