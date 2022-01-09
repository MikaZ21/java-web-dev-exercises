package org.launchcode.java.exercises.cfandcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> randomNumbers = new ArrayList<>(
                Arrays.asList(
                        1,
                        2,
                        3,
                        4,
                        5,
                        6,
                        7,
                        8,
                        9,
                        10
                )
        );
        System.out.println(sumEven(randomNumbers));

        ArrayList<String> fruits = new ArrayList<>(
                Arrays.asList(
                        "Apple",
                        "Grape",
                        "Banana",
                        "Cherry",
                        "Guava",
                        "Pineapple",
                        "Blueberry")
                );
        System.out.println("What is the length of word you desire?");
        int wordLength = input.nextInt();
        designatedWord(fruits, wordLength);

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(phrase.split("\\.")));
        System.out.println(wordList);

    }

    public static int sumEven(ArrayList<Integer> array){
        int total = 0;
        for(int i : array) {
            if( i % 2 == 0){
                total += i;
            }
        }
        return total;
    }

    public static void designatedWord(ArrayList<String> fruitsCollection, int length){
        for(String word: fruitsCollection){
            if(word.length() == length){
                System.out.println(word);
            }
        }
    }
}
