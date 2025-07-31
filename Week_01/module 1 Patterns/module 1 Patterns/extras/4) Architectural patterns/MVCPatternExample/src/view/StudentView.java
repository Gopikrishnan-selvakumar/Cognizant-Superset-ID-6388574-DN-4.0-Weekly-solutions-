package com.mvc.student.view;

public class StudentView {
    public void displayStudentDetails(String id, String name, String grade) {
        System.out.println("---- Student Details ----");
        System.out.printf("ID   : %s%n", id);
        System.out.printf("Name : %s%n", name);
        System.out.printf("Grade: %s%n", grade);
    }
}
