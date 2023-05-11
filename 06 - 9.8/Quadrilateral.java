// ------------------------------------------
// Author:      Lauren Escobedo
// Assignment:  Chapter 9 Problem 9.8
// Date:        02/22/2023
// Language:    Java
// File Name:   Quadrilateral.java
// Description: Exercise 9.8
//              - Quadrilaterals
// ------------------------------------------

// Super class to the shapes
public class Quadrilateral {
    // Shapes points
    protected double x1, y1, x2, y2, x3, y3, x4, y4;

    // Constructor - sets points for the shapes
    public Quadrilateral(double x1, double y1,
            double x2, double y2,
            double x3, double y3,
            double x4, double y4) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }

    // Returns string representation of object
    @Override
    public String toString() {
        return "\nPoints:\n" + "x1 = " + x1 +
                "\t y1 = " + y1 +
                "\nx2 = " + x2 +
                "\t y2 = " + y2 +
                "\nx3 = " + x3 +
                "\t y3 = " + y3 +
                "\nx4 = " + x4 +
                "\t y4 = " + y4 + "\n\n";
    }
}