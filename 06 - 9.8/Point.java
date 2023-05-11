// ------------------------------------------
// Author:      Lauren Escobedo
// Assignment:  Chapter 9 Problem 9.8
// Date:        02/22/2023
// Language:    Java
// File Name:   Point.java
// Description: Exercise 9.8
//              - Quadrilaterals
// ------------------------------------------

// Point class to represent points for the Quadrilateral class
public class Point {
    private double x_cord, y_cord;

    // Constructor
    public Point(double x, double y) {
        this.x_cord = x;
        this.y_cord = y;
    }

    // Returns x coordinate
    public double getX() {
        return x_cord;
    }

    // Returns y coordinate
    public double getY() {
        return y_cord;
    }

    // Returns string representation
    @Override
    public String toString() {
        return "x coordinate: " + x_cord + " y coordinate: " + y_cord + "\n";
    }
}