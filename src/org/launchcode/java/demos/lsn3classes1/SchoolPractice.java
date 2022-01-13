package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.Arrays;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!

        Student newStudent = new Student
                ("Mika", 9,1,4.0);
        Student newStudent2 = new Student
                ("Sally", 5, 2,3.0);
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(newStudent,newStudent2));

        Teacher courseInstructor = new Teacher
                ("Dylan","Mullins","Java",10);
        Teacher courseInstructor2 = new Teacher
                ("Selina","Poon","Java",5);
        ArrayList<Teacher> teachers = new ArrayList<>(Arrays.asList(courseInstructor, courseInstructor2));

        Course courseTaking = new Course("LC101", teachers, students);

        courseTaking.courseInfo();
        System.out.println("Hello");


        System.out.println(courseTaking.courseInfo2());
    }
}
