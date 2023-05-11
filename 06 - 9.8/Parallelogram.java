// ------------------------------------------
// Author:      Lauren Escobedo
// Assignment:  Chapter 9 Problem 9.8
// Date:        02/22/2023
// Language:    Java
// File Name:   Parallelogram.java
// Description: Exercise 9.8
//              - Quadrilaterals
// ------------------------------------------

// Subclass parallelogram, derived from trapezoid
public class Parallelogram extends Quadrilateral {
    // Instance variables
    private double height, width;

    // Constructor
    public Parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        // Utilize superclasses constructor for points
        super(x1, y1, x2, y2, x3, y3, x4, y4);

        height = Math.abs(x1 - x2);
        width = y2 - y3;
    }

    // Returns area
    public double area() {
        return height * width;
    }

    // Displays height and width
    public String displayHW() {
        return "Height: " + height + "\nWidth: " + width;
    }

    // Display the shape
    @Override
    public String toString() {
        return "\nParallelogram: \n" + super.toString() + displayHW() + "\nArea:" + area() + "\n";
    }
}