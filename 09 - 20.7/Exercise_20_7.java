// ------------------------------------------
// Author:      Lauren Escobedo
// Assignment:  Chapter 20 Problem 20.7
// Date:        03/29/2023
// Language:    Java
// File Name:   Exercise_20_7.java
// Description: Exercise 20.7
//              - Generic isEqualTo method
// ------------------------------------------

public class Exercise_20_7 {

    public static void main(String[] args) throws Exception {
        // Declare some test variables of different types
        Object      objectVar = 50;
        Integer     integerVar = 50;
        Double      doubleVar = 50.01;
        Character   characterVar = 'C';
        String      stringVar = "test";

        Exercise_20_7 driver = new Exercise_20_7();

        driver.isEqualTo(objectVar, integerVar);
        driver.isEqualTo(integerVar, doubleVar);
        driver.isEqualTo(doubleVar, characterVar);
        driver.isEqualTo(characterVar, stringVar);

        System.exit(0);
    }

    private <T> void isEqualTo(T first, T second) {
        System.out.println(first == second);
    }
}