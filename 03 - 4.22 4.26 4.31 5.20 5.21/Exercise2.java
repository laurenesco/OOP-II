// ------------------------------------------
// Author:      Lauren Escobedo
// Assignment:  Chapter 4 Problem 4.31
// Date:        02/05/2023
// Language:    Java
// File Name:   Exercise2.java
// Description: Palindromes
// ------------------------------------------

import java.lang.Math;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) throws Exception {
        // Get user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to test for palindrome property: ");
        int test = input.nextInt();
        input.close();

        // Set loop variables
        int initial = test;
        int reversed = 0;
        while(test > 0) {
            // Reverse the number
            reversed = reversed * 10 + test % 10;
            test /= 10;
        }

        // Output initial input and reversed
        String output = "Initial = " + initial +
                        "\nReversed = " + reversed;
        System.out.println(output);

        // Output results
        if (initial == reversed) { output = "Input was a palindrome"; }
        else { output = "Input was not a palindrome"; }
        
        System.out.println(output);
    }
}