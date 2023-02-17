// ------------------------------------------
// Author:      Lauren Escobedo
// Assignment:  Chapter 2 Problems 2.28, 2.31
// Date:        01/14/2023
// Language:    Java
// Description: Exercises 2.28 and 2.31
//              - Diameter, Circumference and Area of a Circle
//              - Table of squares and cubes
// ------------------------------------------

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner userInput = new Scanner(System.in);
        double pi = Math.PI;

        System.out.println("Enter the radius of a circle");
        int radius = userInput.nextInt();

        String output = "The diameter is: " + 2*radius + "\n" +
                        "The circumference is: " + 2*pi*radius + "\n" +
                        "The area is: " + pi*Math.pow(radius,2) + "\n";

        System.out.print(output);

        userInput.close();

        // START SECOND ASSIGNMENT //

        System.out.print("\n\nnumber    square    cube\n");

        for(int i = 1; i < 11; i ++) {
            System.out.printf("%-10d%-10.0f%-10.0f\n", i, Math.pow(i,2), Math.pow(i,3));
        }
    }
}

                   /* Class Info */
/* Public classes must be in a file which shares the same *
 * name, e.g. public class App in App.java                *
 *                                                        *
 * By convention, class names should be in title case,    * 
 * and can not begin with a digit. (Can include $)        *
 *                                                        *
 * At least one method must be called main, and must be   *
 * defined as 'public static void main(String[] args)'    */

/* 
abstract class SimpleSampleCode {
    private static void testcode() {
        System.out.println("Hello, World!");

        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter an integer");
        int firstNum = userInput.nextInt();

        System.out.println("Enter another integer");
        int secondNum = userInput.nextInt();
        6+9*

        userInput.close();

        System.out.printf("%s%d", "The sum is ", firstNum + secondNum);
        // or
        System.out.printf("The sum is %d$n", firstNum + secondNum);
    }
}
*/
