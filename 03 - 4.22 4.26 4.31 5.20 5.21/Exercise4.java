// ------------------------------------------
// Author:      Lauren Escobedo
// Assignment:  Chapter 5 Problem 5.21
// Date:        02/05/2023
// Language:    Java
// File Name:   Exercise4.java
// Description: Pythagorean Triples
// ------------------------------------------

import java.lang.Math;

public class Exercise4 {
    public static void main(String[] args) throws Exception {
        // FLag variable tracks how many trianges have been found
        int flag = 0;

        for (int side_one = 1; side_one <= 500; side_one++) {
            // Iterate through side1 length
            for (int side_two = side_one; side_two <= 500; side_two++) {
                // Iterate though side2 length
                for (int hypo = side_two; hypo <= 500; hypo++) {
                    // Iterate through hypotenuse length
                    if (Math.pow(side_one, 2) + Math.pow(side_two, 2) == Math.pow(hypo, 2)) {
                        // When triangle is found, increment flag and output sides
                        flag ++;
                        String output = flag + ": " + side_one + " " + side_two + " " + hypo;
                        System.out.println(output);
                    }
                }
            }
        }
    }
}