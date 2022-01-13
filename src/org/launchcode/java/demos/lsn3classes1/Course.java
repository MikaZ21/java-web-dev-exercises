package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private ArrayList<Teacher> instructor;
    private ArrayList<Student> enrolledStudents;


    public Course(String courseName, ArrayList<Teacher> instructor, ArrayList<Student> enrolledStudents) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.enrolledStudents = enrolledStudents;
    }

    public void courseInfo() {
          System.out.println("Course name: " + this.courseName);
            System.out.println("Course instructors: ");
            for(Teacher teachers : this.instructor) {
                System.out.println(teachers.getFirstName());
            }
            System.out.println("Enrolled students: ");
            for(Student students : this.enrolledStudents) {
                System.out.println(students.getName());
            };
    }

    public String courseInfo2() {
        return "Course name: " + this.courseName;
//            System.out.println("Course instructors: ");
//            for(Teacher teachers : this.instructor) {
//                System.out.println(teachers.getFirstName());
//            }
//            System.out.println("Enrolled students: ");
//            for(Student students : this.enrolledStudents) {
//                System.out.println(students.getName());
//            };
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Teacher> getInstructor() {
        return instructor;
    }

    public void setInstructor(ArrayList<Teacher> instructor) {
        this.instructor = instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
}
