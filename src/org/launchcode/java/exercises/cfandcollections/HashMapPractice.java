package org.launchcode.java.exercises.cfandcollections;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer,String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your student's name(or ENTER to finish)");

        do{
            System.out.println("Student: ");
            newStudent = input.nextLine();

            if(!newStudent.equals("")){
                System.out.println("Student Id: ");
                Integer idNumber = input.nextInt();
                students.put(idNumber, newStudent);

                input.nextLine();
            }
        } while (!newStudent.equals(""));

        System.out.println("\nClass roster:");
        for(Map.Entry<Integer,String> student : students.entrySet()){
            System.out.println("Name: " + student.getValue() + "; Id # "+ student.getKey());
        }
    }
}
