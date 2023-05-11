// ------------------------------------------
// Author:      Lauren Escobedo
// Assignment:  Chapter 23 Problem 23.19
// Date:        04/12/2023
// Language:    Java
// File Name:   Exercise_23_19.java
// Description: Exercise 23_19
//              - Calculating the Sum of the Squares
// ------------------------------------------

import java.util.Arrays;
import java.util.stream.*;
import java.util.List;

public class Exercise_23_19 {

    public static void main(String[] args) throws Exception {
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
        List<Integer> streamValues = Arrays.asList(3, 10, 6, 1, 4, 8, 2, 5, 9, 7);

        // Display original values
        System.out.print("Original values: ");
        System.out.println(IntStream.of(values)
                            .mapToObj(String::valueOf)
                            .collect(Collectors.joining(" "))); 
        
        // Sum of squares with map and sum
        System.out.printf("\nSum of squares via map and sum: %d%n%n",
                           IntStream.of(values)
                                    .map(x -> x * x)
                                    .sum());

        // Sum of squares with reduce method
        System.out.printf("Sum of squares via reduce: %s%n%n",
                            streamValues.stream().reduce(0, (a, b) -> a + b * b));

        System.exit(0);
    }   
}

/* 

9 + 100 + 36 + 1 + 16 + 64 + 4 + 25 + 81 + 49

23.19 (Calculating the Sum of the Squares) Section 17.7.3 used map and
sum to calculate the sum of the squares of an IntStream’s values.
Reimplement stream pipeline in Fig. 17.9 to replace map and sum with
the following reduce, which receives a lambda that does not represent
an associative operation:

.reduce((x, y) -> x + y * y)

Error-Prevention Tip 17.2 cautioned you that reduce’s argument must be
an associative operation. Execute the reimplemented stream pipeline using
a parallel stream. Does it produce the correct sum of the squares of the
IntStream’s values?

Error-Prevention Tip 17.2:
The operation specified by a reduce’s argument must be
associative—that is, the order in which reduce applies the
operation to the stream’s elements must not matter. This is
important, because reduce is allowed to apply its operation
to the stream elements in any order. A non-associative
operation could yield different results based on the processing
order. For example, subtraction is not an associative operation
—the expression 7 – (5 – 3) yields 5 whereas the expression (7
– 5) – 3 yields –1. Associative reduce operations are critical
for parallel streams (Chapter 23) that split operations across
multiple cores for better performance. Exercise 23.19 explores
this issue further.

*/