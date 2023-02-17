// ------------------------------------------
// Author:      Lauren Escobedo
// Assignment:  Chapter 4 Problem 4.22
// Date:        02/05/2023
// Language:    Java
// File Name:   Exercise1.java
// Description: Tabular Output
// ------------------------------------------

import java.lang.Math;

public class Exercise1 {
    public static void main(String[] args) throws Exception {
        // This program is so simple comments aren't really needed...
        System.out.printf("%-10s%-10s%-10s%-10s\n", "N", "10*N", "100*N", "1000*N");
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%-10d%-10d%-10d%-10d\n", i, i*10, i*100, i*1000);
        }
    }
}