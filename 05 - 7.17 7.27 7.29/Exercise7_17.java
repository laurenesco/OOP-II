// ------------------------------------------
// Author:      Lauren Escobedo
// Assignment:  Chapter 7 Problem 7.17
// Date:        02/15/2023
// Language:    Java
// File Name:   Exercise7_17.java
// Description: Exercise 7.17
//              - Dice Rolling 
// ------------------------------------------

import java.security.SecureRandom;
import java.util.Scanner;

public class Exercise7_17 {

    static int roll() {
        // Roll the dice and return results
        SecureRandom rand = new SecureRandom();
        int die1 = rand.nextInt(6) + 1;
        int die2 = rand.nextInt(6) + 1;

        return (die1 + die2) - 2;
    }

    public static void main(String[] args) throws Exception {
        // Declare/initialize variables
        int iterations;
        Scanner input = new Scanner(System.in);

        // Declare and initialize results array
        int[] results = new int[11];
        for (int i = 0; i < results.length; i++) {
            results[i] = 0;
        }

        // User input for iteration limit
        System.out.print("\n\nHow many times do you want to roll the dice? ");
        iterations = input.nextInt();
        System.out.println();

        // "Roll" for "iterations" iterations
        // Increment the index that was rolled each time
        for (int i = 0; i < iterations; i++) {
            results[roll()] ++;
        }

        // Format output 
        System.out.print("Result ");
        for (int i = 0; i < 11; i++) {
            System.out.printf("| %6d ", i+2);
        }

        String line = "\n----------" +
                      "----------" +
                      "----------" +
                      "----------" +
                      "----------" +
                      "----------\nTally  ";
        System.out.print(line);

        for (int i = 0; i < results.length; i++) {
            System.out.printf("| %6d ", results[i]);
        }

        System.out.print("\n\n\n");

        input.close();
    }
}