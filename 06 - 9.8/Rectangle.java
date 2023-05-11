// ------------------------------------------
// Author:      Lauren Escobedo
// Assignment:  Chapter 9 Problem 9.8
// Date:        02/22/2023
// Language:    Java
// File Name:   Rectangle.java
// Description: Exercise 9.8
//              - Quadrilaterals
// ------------------------------------------

// Subclass rectange, derived from quadrilateral
public class Rectangle extends Quadrilateral {
    // Instance variables
    private double height;
    protected double width;

    // Constructor
    public Rectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        // Utilize superclasses constructor for points
        super(x1, y1, x2, y2, x3, y3, x4, y4);

        width = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        height = Math.sqrt(Math.pow((x4 - x1), 2) + Math.pow((y4 - y1), 2));
    }

    // Returns area
    private double area() {
        return height * width;
    }

    // Display the shape
    @Override
    public String toString() {
        String output = String.format("\nRectangle: \n%sHeight: %2.2f\nLength: %2.2f\nArea:%2.2f\n", super.toString(),
                height, width, area());
        return output;
    }
}