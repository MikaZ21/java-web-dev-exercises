package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        //declare variables
        HashMap<Character, Integer> characterCounts = new HashMap<>();

        String testString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero." +
                " Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = testString.toCharArray();

        for(char character: charactersInString) {
            if(characterCounts.containsKey(character)) {
                characterCounts.put(character, characterCounts.get(character) + 1);
            }
            else {
                characterCounts.put(character, 1);
            }
        }

//        String testString = "";
//        Scanner input = new Scanner(System.in);
//
//        //get input from user
//        System.out.println("Please type the string you'd like me to analyze");
//        testString = input.nextLine();
//
//        //lower case input
//        String testStringLowercased = testString.toLowerCase();
//        char[] charactersInStringCharArray = testStringLowercased.toCharArray();
//
//        //add and update map entries for each letter in input
//        for (char character : charactersInStringCharArray) {
//            // only care about characters that are alphabetic/letters
//            if (Character.isLetter(character)) {
//                if (characterCounts.containsKey(character)) {
//                    characterCounts.put(character, characterCounts.get(character) + 1);
//                } else {
//                    characterCounts.put(character, 1);
//                }
//            }
//        }
        // print the counts of each letter
        for (Map.Entry<Character, Integer> oneChar : characterCounts.entrySet()) {
            System.out.println(oneChar.getKey() + ": " + oneChar.getValue());
        }
    }
}
//Below, "read from file"
//        import java.io.IOException;
//        import java.nio.file.Files;
//        import java.nio.file.Paths;
//        import java.util.HashMap;
//        import java.util.Map;
//
//public class CountingCharacters {
//
//
//    public static void main(String[] args) throws IOException {
//        // read file
//        HashMap<Character, Integer> characterCounts = new HashMap<>();
//
//        String testString = new String(Files.readAllBytes(Paths.get("C:\\launchcode\\lc101\\cohortSep21\\java\\src\\studio2\\example.txt")));
//
//        String testStringLowercased = testString.toLowerCase();
//        char[] charactersInString = testStringLowercased.toCharArray();
//
//        for (char character : charactersInString) {
//            if (Character.isLetter(character)){
//                if (characterCounts.containsKey(character)) {
//                    characterCounts.put(character, characterCounts.get(character) + 1);
//                }
//                else {
//                    characterCounts.put(character, 1);
//                }
//            }
//        }
//        for (Map.Entry<Character, Integer> oneChar : characterCounts.entrySet()) {
//            System.out.println(oneChar.getKey() + ": " + oneChar.getValue());
//        }
//    }
//}