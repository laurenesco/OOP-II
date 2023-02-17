// ------------------------------------------
// Author:      Lauren Escobedo
// Assignment:  Chapter 7 Problem 7.29
// Date:        02/15/2023
// Language:    Java
// File Name:   Exercise7_29.java
// Description: Exercise 7.29
//              - Fibonacci Sequence
// ------------------------------------------

import java.util.Scanner;
import java.lang.Math;

public class Exercise7_29 {

        // Prints fibonacci sequence up to "n"
        static Double fibonnaci(int n)
        {
            // Declare/Initialize variables
            Double first = 0, second = 1, counter = 0;
            Double third;
      
            // Perform sequence calculations
            while (counter < n) {                     
                // Swap
                third = second + first;
                first = second;
                second = third;
                counter++;
            }

            // Detect overflow
            if (Double.isInfinite(first) || Double.isNan(first)) { throw ArithmeticException("overflow"); }

            return first;
        }

    public static void main(String[] args) throws Exception {
        // Declare/initialize variables
        int iterations;
        Scanner input = new Scanner(System.in);

        // User input for iteration limit
        System.out.print("\n\nWhat fibonnaci number do you want to calculate? ");
        iterations = input.nextInt();
        System.out.println();

        // Retrieve fibonacci sequence for given "n"
        Double result = fibonnaci(iterations);

        // Print result
        System.out.println(result);
        System.out.print("\n");
        input.close();
    }
}