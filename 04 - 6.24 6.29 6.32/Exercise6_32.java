// ------------------------------------------
// Author:      Lauren Escobedo
// Assignment:  Chapter 6 Problem 6.32
// Date:        02/08/2023
// Language:    Java
// File Name:   Exercise6_32.java
// Description: Distance Between Points 
// ------------------------------------------

import java.lang.Math;
import java.util.Scanner;

public class Exercise6_32 {
    static double getCoordinateDifference(double[] setOne, double [] setTwo) { 
        // Extract coordinates
        double x1 = setOne[0];
        double y1 = setOne[1];
        double x2 = setTwo[0];
        double y2 = setTwo[1];

        // Return absolute value of sqrt((x2 - x2)^2 + (y2 - y1)^2)
        return Math.abs(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))); 
    }

    static double[] getCoordinatePair() {
        // Initialize/declare variables for block
        double[] coordinates = {0,0}; 
        String var = "x";
        Scanner input = new Scanner(System.in);

        // Assign x to array index 0, y to array index 1
        for (int i = 0; i < 2; i++) {
            if (i == 1) { var = "y"; }
            System.out.printf("Enter a(n) %s coordinate: ", var);
            coordinates[i] = input.nextDouble();
        }

        // Return double of type array containing user created x and y coordinate
        return coordinates;
    }

    public static void main(String[] args) throws Exception {

        double setOne[] = getCoordinatePair();
        double setTwo[] = getCoordinatePair();

        String output = "\nThe distance is " + getCoordinateDifference(setOne, setTwo);
        System.out.println(output);
    }
}