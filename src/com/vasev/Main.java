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

        // Counters for M
        int indentCounterM1 = size;
        int starCounterM1 = size;
        int gapCounterM1 = size;
        int starCounterTreeM1 = size;
        int gapCounterTwoM1 = size;
        int outerCounterM1 = size;

        for (int i = 1; i <= rowCount; i++) {
            System.out.println();

            String s0 = space.repeat(indentCounterM1);
            String s1 = star.repeat(starCounterM1);
            String s2 = space.repeat(gapCounterM1);
            String s3 = star.repeat(starCounterTreeM1);

            String s4 = "";
            String s5 = "";

            if (i > rowCount / 2) {
                starCounterTreeM1 -= 2;
                gapCounterM1 += 2;
                s4 = space.repeat(gapCounterTwoM1);
                s5 = star.repeat(size);
                gapCounterTwoM1 += 2;
            }

            if (i < rowCount / 2) {
                gapCounterTwoM1 -= 2;
                gapCounterM1 -= 2;
                starCounterM1 += 2;
                starCounterTreeM1 += 2;
            }

            String s6 = space.repeat(outerCounterM1);

            if (i > rowCount / 2 - 1 && i == rowCount / 2) starCounterM1 -= size - 1;

            indentCounterM1--;
            outerCounterM1--;

            String M = s0 + s1 + s2 + s3 + s4 + s5 + s6;
            System.out.print(M.repeat(2));
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

