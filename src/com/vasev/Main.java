package com.vasev;

import java.util.Scanner;


public class Main {

    /*

    This method prints Mentor Mate logo based ont the input of size(must  odd and bigger than 3).
    ---***---***------***---***---
    --*****-*****----*****-*****--
    -***-*****-***--***-*****-***-
    ***---***---******---***---***

    */

    public static void printMentorMate(int size) {

        String space = "-";
        String star = "*";

        // Sets how many rows will M have
        int rowCount = size + 1;

        // Counters for  M1
        int indentCounterM1 = size;
        int starCounterM1 = size;
        int gapCounterM1 = size;
        int starCounterTreeM1 = size;
        int gapCounterTwoM1 = size;
        int outerCounterM1 = size;

        // Counters for M2
        int indentCounterM2 = size;
        int starCounterM2 = size;
        int gapCounterM2 = size;
        int starCounterTreeM2 = size;
        int gapCounterTwoM2 = size;
        int outerCounterM2 = size;


        for (int i = 1; i <= rowCount; i++) {
            System.out.println();

            System.out.print(space.repeat(indentCounterM1));
            System.out.print(star.repeat(starCounterM1));
            System.out.print(space.repeat(gapCounterM1));
            System.out.print(star.repeat(starCounterTreeM1));

            if (i > 0 && i < rowCount / 2) starCounterTreeM1 += 2;

            if (i > rowCount / 2) {
                starCounterTreeM1 -= 2;
                gapCounterM1 += 2;
                System.out.print(space.repeat(gapCounterTwoM1));
                System.out.print(star.repeat(size));
                gapCounterTwoM1 += 2;
            }

            if (i < rowCount / 2) {
                gapCounterTwoM1 -= 2;
                gapCounterM1 -= 2;
                starCounterM1 += 2;
            }

            System.out.print(space.repeat(outerCounterM1));

            if (i > rowCount / 2 - 1 && i == rowCount / 2) starCounterM1 -= size - 1;

            indentCounterM1--;
            outerCounterM1--;

            /*
             *
             *
             *
             * PRINTING THE SECOND M (M2)
             *
             *
             *
             */

            System.out.print(space.repeat(indentCounterM2));
            System.out.print(star.repeat(starCounterM2));
            System.out.print(space.repeat(gapCounterM2));
            System.out.print(star.repeat(starCounterTreeM2));

            if (i > 0 && i < rowCount / 2) starCounterTreeM2 += 2;

            if (i > rowCount / 2) {
                starCounterTreeM2 -= 2;
                gapCounterM2 += 2;
                System.out.print(space.repeat(gapCounterTwoM2));
                System.out.print(star.repeat(size));
                gapCounterTwoM2 += 2;
            }

            if (i < rowCount / 2) {
                gapCounterTwoM2 -= 2;
                gapCounterM2 -= 2;
                starCounterM2 += 2;
            }

            System.out.print(space.repeat(outerCounterM2));

            if (i > rowCount / 2 - 1 && i == rowCount / 2) starCounterM2 -= size - 1;

            indentCounterM2--;
            outerCounterM2--;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter an odd number for size ");

        int size = in.nextInt();
        System.out.println();
        System.out.println("N = " + size);

        if (size > 2 && size <= 10000 && (size % 2) != 0) {
            printMentorMate(size);
        } else {
            System.out.println(size + " is an invalid number!");
            System.out.println("Number must be odd.");
        }
    }
}

