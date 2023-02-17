// ------------------------------------------
// Author:      Lauren Escobedo
// Assignment:  Chapter 5 Problem 5.20
// Date:        02/05/2023
// Language:    Java
// File Name:   Exercise5.java
// Description: Calculating Pi
// ------------------------------------------

import java.lang.Math;

public class Exercise5 {
    public static void main(String[] args) throws Exception {
        // Variables for sequence calculations
        double pi = 3.14159, k = 4, even = 3, odd = 5, constant = 4;
        // Flag checks if sequence has summed to 3.14159 yet
        boolean flag = false;

        // Perform sequence calculation
        for (int i = 2; i <= 136200; i++) {
            if (i % 2 == 0) {
                k -= constant/even;
                even += 4;
            }
            if (i % 2 != 0) {
                k += constant/odd;
                odd += 4;
            }

            System.out.println(k);

            // If/when sequence equals 3.14159, output and flag it
            if ((Math.floor(k * 1e5) / 1e5) == pi && flag == false) { 
                System.out.printf("The sequence's sum began with %.5f on iteration %d\n", pi, i);
                flag = true; 
            }
        }
    }
}