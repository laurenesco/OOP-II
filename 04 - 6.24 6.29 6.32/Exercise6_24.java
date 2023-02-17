// ------------------------------------------
// Author:      Lauren Escobedo
// Assignment:  Chapter 6 Problem 6.24
// Date:        02/08/2023
// Language:    Java
// File Name:   Exercise6_24.java
// Description: Perfect Numbers
// ------------------------------------------

import java.util.ArrayList;
import java.lang.StringBuilder;

public class Exercise6_24 {
    // C-like "Macro definition" equivalent size variable
    private static final int size = 1000;

    private static String isPerfect(int test) {
        int sum = 0;
        ArrayList<Integer> factors = new ArrayList<>();

        // Find factors and add to list
        for (int i = 1; i < test; i ++) {
            if (test % i == 0) {
                factors.add(i);
            }
        }

        // IF factors are detected
        if (factors.size() > 0) {
            // Add them up
            for (int i = 0; i < factors.size(); i++) {
                sum += factors.get(i).intValue();
            }

            // IF perfect generate and return output. If not, return nothing
            if (sum == test) {
                StringBuilder output = new StringBuilder();
                output.append(Integer.toString(test));
                output.append(" - ");
                output.append(factors.get(0).intValue());
                for (int i = 1; i < factors.size(); i++) {
                    String s = " + " + factors.get(i).intValue();
                    output.append(s);
                }
                return output + "\n";
            } else { return ""; }
        }
        // Default return
        return "";
    }
    public static void main(String[] args) throws Exception {

        System.out.printf("\nImperfect numbers ranging from 1 to %d\n\n", size);

        // Find out if numbers are perfect from 0 to "size"
        for (int i = 0; i < size; i++) {
            System.out.print(isPerfect(i));
        }

        System.out.println();
    }
}