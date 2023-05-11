// ------------------------------------------
// Author:      Lauren Escobedo
// Assignment:  Chapter 9 Problem 9.8
// Date:        02/22/2023
// Language:    Java
// File Name:   Square.java
// Description: Exercise 9.8
//              - Quadrilaterals
// ------------------------------------------

// Subclass square, derived from rectangle
public class Square extends Quadrilateral {
    private double width;

    public Square(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        // Utilize superclasses constructor for points
        super(x1, y1, x2, y2, x3, y3, x4, y4);

        this.width = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    private double area() {
        return this.width * 4;
    }

    @Override
    public String toString() {
        String output = String.format("\nSquare: \n%sWidth: %2.2f\nArea:%2.2f\n", super.toString(), width, area());
        return output;
    }
}