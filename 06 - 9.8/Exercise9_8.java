// ------------------------------------------
// Author:      Lauren Escobedo
// Assignment:  Chapter 9 Problem 9.8
// Date:        02/22/2023
// Language:    Java
// File Name:   Execise9_8.java
// Description: Exercise 9.8
//              - Quadrilaterals
// ------------------------------------------

// Driver class
public class Exercise9_8 {
    public static void main(String[] args) throws Exception {

        Trapezoid trapezoid = new Trapezoid(1.2, 4.5, 5.6, 3.8, 4.2, 2.4, 1.2, 4.1);
        System.out.println(trapezoid.toString());

        Parallelogram parallelogram = new Parallelogram(4.0, 2.0, 7.0, 10.0, 2.0, 7.0, 7.0, 1.0);
        System.out.println(parallelogram.toString());

        Rectangle rectangle = new Rectangle(7.0, 4.0, 3.0, 4.0, 3.0, 2.0, 1.0, 2.0);
        System.out.println(rectangle.toString());

        Square square = new Square(4.0, 0.0, 8.0, 0.0, 8.0, 4.0, 4.0, 4.0);
        System.out.println(square.toString());

        System.exit(0);
    }
}