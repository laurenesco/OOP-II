// ------------------------------------------
// Author:      Lauren Escobedo
// Assignment:  Chapter 14 Problem 14.18
// Date:        03/22/2023
// Language:    Java
// File Name:   Exercise_14_18.java
// Description: Exercise 14.18
//              - Text Analysis
// ------------------------------------------

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exercise_14_18 {
    public static void main(String[] args) throws Exception {
        Exercise_14_18 driver = new Exercise_14_18();

        Scanner input = new Scanner(System.in);
        System.out.println("\n\nPlease enter a sentence for analysis:");
        
        if (input.hasNextLine()) {
            String sentence = input.nextLine();

            driver.letterCount(sentence);
            driver.wordLengthCount(sentence);
            driver.wordCount(sentence);
        }

        input.close();
        System.exit(0);
    }

    private void letterCount(String sentence) {
        // Variables
        ArrayList<Character> phrase = new ArrayList<>();
        Map<Character,Integer> alphabet = new HashMap<Character,Integer>();

        // Format sentence
        sentence = sentence.trim().replaceAll("\\s", "");

        // Get sentence down to it's characters
        for (char letter : sentence.toCharArray()) {
            phrase.add(letter);
        }

        // Count characters
        for (char letter : phrase) {
            Integer count = alphabet.get(letter);
            int newCount = (count==null ? 1 : count+1);
            alphabet.put(letter, newCount);
        }

        // Print the map
        System.out.println("\nEach appearing letter and count of appearances: ");
        for (Map.Entry<Character, Integer> letter : alphabet.entrySet()) {
            System.out.println(letter.getKey() + ":" + letter.getValue().toString());
        }
    }
    
    private void wordLengthCount(String sentence) {
        // Variables
        int[] count = new int[10];

        // Split on space
        String[] words = sentence.split(" ");

        // Count them up
        for (String word : words) {
            switch(word.length()) {
                case 1:
                    count[0] ++;
                    break;
                case 2:
                    count[1] ++;
                    break;
                case 3:
                    count[2] ++;
                    break;
                case 4:
                    count[3] ++;
                    break;
                case 5:
                    count[4] ++;
                    break;
                case 6:
                    count[5] ++;
                    break;
                case 7:
                    count[6] ++;
                    break;
                case 8:
                    count[7] ++;
                    break;
                case 9:
                    count[8] ++;
                    break;
                case 10:
                    count[9] ++;
                    break;
                default:
                    break;  
            }
        }

        // Start table
        System.out.printf("\n%13s%2s|%11s%4s\n", "Word Length", "", "Letters", "");
        System.out.println("------------------------------");

        // Print data
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.printf("%8d%7s|%8d\n", i+1, "", count[i]);
                System.out.println("------------------------------");
            }
        }
    }

    private void wordCount(String sentence) {
        // Variables
        Map<String,Integer> wordCount = new HashMap<String,Integer>();

        // Split on space
        String[] words = sentence.split(" ");

        // Count the words
        for (String w : words) {
            Integer count = wordCount.get(w);
            int newCount = (count==null ? 1 : count+1);
            wordCount.put(w, newCount);
        }

        // Print the map
        System.out.println("\nEach appearing word and count of appearances: ");
        for (Map.Entry<String, Integer> word : wordCount.entrySet()) {
            System.out.println(word.getKey() + ":" + word.getValue().toString());
        }

        System.out.println();
    }
}