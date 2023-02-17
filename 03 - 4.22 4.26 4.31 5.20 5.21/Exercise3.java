// ------------------------------------------
// Author:      Lauren Escobedo
// Assignment:  Chapter 4 Problem 4.26
// Date:        02/05/2023
// Language:    Java
// File Name:   Exercise3.java
// Description: What does the program print?
// ------------------------------------------

import java.lang.Math;

public class Exercise3 {
    public static void main(String[] args) throws Exception {
        int row = 10;

        // Iterate for 10 cycles
        while (row >= 1) {
            int column = 1;

            // iterate for 10 columns
            while (column <= 10) {
                // Output 1 or 0 depending on if the row is even or odd
                // Textbook was cut off, so I subbed in 1 and 0
                System.out.print(row %2 == 1 ? 0 : 1);
                ++ column;
            }

            -- row;
            System.out.println();
        }
    }
}