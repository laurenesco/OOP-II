// ------------------------------------------
// Author:      Lauren Escobedo
// Assignment:  Chapter 7 Problem 7.27
// Date:        02/15/2023
// Language:    Java
// File Name:   Exercise7_27.java
// Description: Exercise 7.27
//              - Sieve of Eratosthenes
// ------------------------------------------

import java.util.Arrays;

public class Exercise7_27 {

    public static void main(String[] args) throws Exception {
        // Declare and initialize results array
        boolean[] results = new boolean[1000];
        Arrays.fill(results, true);

        // Perform sieve of eratosthenes calculations
        for (int i = 2; i < results.length; i++) {
            if (i > 2 && i % 2 == 0) {
                results[i] = false;
            }
            if (i > 5 && i % 5 == 0) {
                results[i] = false;
            }
            if (i > 3 && i % 3 == 0) {
                results[i] = false;
            }
        }

        // Output array
        System.out.print("\n\n");
        for (int i = 2; i < results.length; i++) {
            if (results[i] == true) {
                System.out.printf("%d, ",i);
            }
        }
        System.out.print("\n\n");
    }
}