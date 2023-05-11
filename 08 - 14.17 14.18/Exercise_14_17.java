// ------------------------------------------
// Author:      Lauren Escobedo
// Assignment:  Chapter 14 Problem 14.17
// Date:        03/22/2023
// Language:    Java
// File Name:   Exercise_14_17.java
// Description: Exercise 14.17
//              - Three letter string from five letter word
// ------------------------------------------

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Exercise_14_17 {

    // Instance variables
    private ArrayList<Character> letters = new ArrayList<>();
    private ArrayList<String> combinations = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        // Variables
        Scanner input = new Scanner(System.in);
        Exercise_14_17 driver = new Exercise_14_17();

        // Get user input, truncate to 5 letters if longer
        System.out.println("Please enter a five letter word: ");
        String word = input.nextLine();
        word = word.substring(0, 5);        

        // Get the input in the char list
        for (char letter : word.toCharArray()) {
            driver.letters.add(letter);
        }

        // Get the combinations in the combo list
        driver.fillCombinations(driver.letters, driver.combinations);

        // Check if real words
        driver.checkCombinations(driver.combinations);

        // Close resources
        input.close();
    }

    private void checkCombinations(ArrayList<String> combinations) {
        // Set variables
        String url = "https://www.merriam-webster.com/dictionary/";
        int flag = 0;
        System.out.println("\n");

        // Iterate through array list to check all combinations
        for (String combo : combinations) {
            // Set full url based on which combo we're on
            url = url + combo;
                
            // Go online and see if word is real
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(url).openStream()))) {
                System.out.printf("This combo is a real word (or abbreviation): %s\n", combo);
                flag = 1;
            } catch (IOException ex) {
                System.out.print("");
            }
        }

        // Defualt message
        if (flag == 0) {
            System.out.println("This word does not have any combinations that are real words. :(");
        }
        System.out.println("\n\n");
    }

    private void fillCombinations(ArrayList<Character> letters, ArrayList<String> combinations) {

        // Brute force combinations for the word and add to combinations list
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    int flag = 0;

                    // Compose the combination
                    String combo = letters.get(i).toString() + letters.get(j).toString() + letters.get(k).toString();

                    // Check if it's already accounted for
                    for (String word : combinations) {
                        if (combo == word) {
                            flag = 1;
                            break;
                        }
                    }

                    // If not accounted for, add
                    if (flag == 0) {
                        combinations.add(combo);
                    }
                }
            }
        }
        
        // Output all combinations
        System.out.print("\n\nAll combinations for the word are...\n");
        for (String combo : combinations) {
            System.out.println(combo);
        }
    }
}