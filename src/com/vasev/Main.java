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

        // Sets how many rows M will have
        int rowCount = size + 1;

        // Counters for M
        int indentCounter = size;
        int starCounter = size;
        int gapCounter = size;
        int starCounterTwo = size;
        int gapCounterTwo = size;
        int outerCounter = size;

        for (int i = 1; i <= rowCount; i++) {
            System.out.println();

            String s0 = space.repeat(indentCounter);
            String s1 = star.repeat(starCounter);
            String s2 = space.repeat(gapCounter);
            String s3 = star.repeat(starCounterTwo);

            String s4 = "";
            String s5 = "";

            if (i > rowCount / 2) {
                starCounterTwo -= 2;
                gapCounter += 2;
                s4 = space.repeat(gapCounterTwo);
                s5 = star.repeat(size);
                gapCounterTwo += 2;
            }

            if (i < rowCount / 2) {
                gapCounterTwo -= 2;
                gapCounter -= 2;
                starCounter += 2;
                starCounterTwo += 2;
            }

            String s6 = space.repeat(outerCounter);

            if (i > rowCount / 2 - 1 && i == rowCount / 2) starCounter -= size - 1;

            indentCounter--;
            outerCounter--;

            String m = s0 + s1 + s2 + s3 + s4 + s5 + s6;
            System.out.print(m.repeat(2));
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

