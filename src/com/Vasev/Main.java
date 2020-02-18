package com.Vasev;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter size ");


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

    /*

    This method prints Mentor Mate logo based ont the input of size(must  odd and bigger than 3).
    ---***---***------***---***---
    --*****-*****----*****-*****--
    -***-*****-***--***-*****-***-
    ***---***---******---***---***

    */

    public static void printMM(int size) {

        // Setting row count
        int rowCount = size + 1;

        // Counters for the first part of M1
        int gapCounterM1 = size;
        int starCounterM1 = size;
        int indentCounterM1 = size;

        // Star counters for the second part of M1
        int starCounterTwoM1 = size;
        int starCounterTreeM1 = size;
        int starCounterFourM1 = size;

        // Gap and outer counter for the last part of M1
        int gapCounterTwoM1 = size;
        int outerCounterM1 = size;


        //Counters for the first part of M2
        int gapCounterM2 = size;
        int starCounterM2 = size;
        int indentCounterM2 = size;

        //Star counters for the second part of M2
        int starCounterTwoM2 = size;
        int starCounterTreeM2 = size;
        int starCounterFourM2 = size;

        // Gap and outer counter for the last part of M2
        int gapCounterTwoM2 = size;
        int outerCounterM2 = size;


        // Sets how many rows will M have
        for (int i = 1; i <= rowCount; i++) {
            System.out.println();


            //printing indent
            for (int j = 1; j <= indentCounterM1; j++) {
                System.out.print("-");
            }

            //printing stars for the first half of M
            for (int k = 1; k <= starCounterM1; k++) {
                System.out.print("*");
            }

            //printing gap for the first M
            for (int j = 1; j <= gapCounterM1; j++) {
                System.out.print("-");
            }

            //printing stars for the second half of M
            for (int k = 1; k <= starCounterTreeM1; k++) {
                System.out.print("*");
            }

            if (i > 0 && i < rowCount / 2) starCounterTreeM1 += 2;
            if (i > rowCount / 2) starCounterTreeM1 -= 2;

            //printing empty space for the second half of M
            if (i > rowCount / 2) {
                for (int j = 1; j <= gapCounterTwoM1; j++) {
                    System.out.print("-");
                }
            }

            //printing stars for the last part of M
            if (i > rowCount / 2) {
                for (int k = 1; k <= starCounterFourM1; k++) {
                    System.out.print("*");
                }
            }

            if (i < rowCount / 2) {
                gapCounterTwoM1 -= 2;
                starCounterTwoM1 += 2;
            }

            if (i > rowCount / 2 - 1 && i == rowCount / 2) starCounterTwoM1 -= 2;
            if (i > rowCount / 2) gapCounterTwoM1 += 2;

            //printing empty space for the last part of M
            for (int j = 1; j <= outerCounterM1; j++) {
                System.out.print("-");
            }

            if (i < rowCount / 2) {
                gapCounterM1 -= 2;
                starCounterM1 += 2;
            }

            if (i > rowCount / 2 - 1 && i == rowCount / 2) starCounterM1 -= size - 1;
            if (i > rowCount / 2) gapCounterM1 += 2;

            indentCounterM1--;
            outerCounterM1--;

            /*
             *
             *
             *
             *
             * PRINTING  THE SECOND M (M2)
             *
             *
             *
             *
             */

            //printing empty space
            for (int j = 1; j <= indentCounterM2; j++) {
                System.out.print("-");
            }

            //printing stars for the first half of M
            for (int k = 1; k <= starCounterM2; k++) {
                System.out.print("*");
            }

            //printing the gap for the second m
            for (int j = 1; j <= gapCounterM2; j++) {
                System.out.print("-");
            }

            //printing stars for the second half of M
            for (int k = 1; k <= starCounterTreeM2; k++) {
                System.out.print("*");
            }

            if (i > 0 && i < rowCount / 2) starCounterTreeM2 += 2;
            if (i > rowCount / 2) starCounterTreeM2 -= 2;


            //printing empty space for the second half of M
            if (i > rowCount / 2) {
                for (int j = 1; j <= gapCounterTwoM2; j++) {
                    System.out.print("-");
                }
            }

            //printing stars for the last part of M
            if (i > rowCount / 2) {
                for (int k = 1; k <= starCounterFourM2; k++) {
                    System.out.print("*");
                }
            }

            if (i < rowCount / 2) {
                gapCounterTwoM2 -= 2;
                starCounterTwoM2 += 2;
            }

            if (i > rowCount / 2 - 1 && i == rowCount / 2)starCounterTwoM2 -= 2;
            if (i > rowCount / 2) gapCounterTwoM2 += 2;

            //printing empty space for the last part of M
            for (int j = 1; j <= outerCounterM2; j++) {
                System.out.print("-");
            }

            if (i < rowCount / 2) {
                gapCounterM2 -= 2;
                starCounterM2 += 2;
            }

            if (i > rowCount / 2 - 1 && i == rowCount / 2) starCounterM2 -= size - 1;
            if (i > rowCount / 2) gapCounterM2 += 2;

            indentCounterM2--;
            outerCounterM2--;

        }

    }
}

