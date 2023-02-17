// ------------------------------------------
// Author:      Lauren Escobedo
// Assignment:  Chapter 6 Problem 6.29
// Date:        02/08/2023
// Language:    Java
// File Name:   Exercise6_29.java
// Description: Coin Tossing 
// ------------------------------------------

import java.security.SecureRandom;
import java.util.Scanner;

public class Exercise6_29 {
    enum Face { HEADS, TAILS }
    static int tailsCount;
    static int headsCount;

    static Face flip() {
        // FLip the coin and return results
        SecureRandom rand = new SecureRandom();

        if (rand.nextInt(2) == 0) {
            headsCount ++;
            return Face.HEADS;
        } else {
            tailsCount ++;
            return Face.TAILS;
        }
    }

    public static void main(String[] args) throws Exception {
        // Declare/initialize variables
        int iterations;
        Scanner input = new Scanner(System.in);

        // User input for iteration limit
        System.out.print("\n\nHow many times do you want to flip the coin? ");
        iterations = input.nextInt();

        // "FLip" for "iterations" iterations
        for (int i = 0; i < iterations; i++) {
            System.out.println("The result of the flip was " + flip());
        }

        // Format output
        String output = "The coin was flipped " + iterations +
                        " times\nA result of heads was found " + headsCount +
                        " times\nA result of tails was found " + tailsCount +
                        " times\n\n";

        input.close();
        System.out.println(output);
    }
}