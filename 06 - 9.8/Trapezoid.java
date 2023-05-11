// ------------------------------------------
// Author:      Lauren Escobedo
// Assignment:  Chapter 9 Problem 9.8
// Date:        02/22/2023
// Language:    Java
// File Name:   Trapezoid.java
// Description: Exercise 9.8
//              - Quadrilaterals
// ------------------------------------------

// Subclass trapezoid, derived from quadrilateral
public class Trapezoid extends Quadrilateral {
    // Instance variables
    protected double height, base1, base2;

    // Constructor
    public Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        // Utilize superclasses constructor for points
        super(x1, y1, x2, y2, x3, y3, x4, y4);

        height = Math.abs(x1 - x2);
        base1 = y2 - y3;
        base2 = y1 - y4;
    }

    // Returns area
    public double area() {
        return Math.abs(0.5 * (base1 + base2) * height);
    }

    // Display the shape
    @Override
    public String toString() {
        String output = String.format("\nTrapezoid:\n %sHeight: %2.2f \nBase1: %2.2f \nBase2: %2.2f \nArea: %2.2f\n",
                super.toString(), height, base1, base2, area());

        return output;
    }
}