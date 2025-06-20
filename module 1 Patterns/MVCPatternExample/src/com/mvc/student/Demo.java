package com.mvc.student;

import com.mvc.student.model.Student;
import com.mvc.student.view.StudentView;
import com.mvc.student.controller.StudentController;

public class Demo {
    public static void main(String[] args) {
        Student model = new Student("E049", "GOPI", "B+");
        StudentView  view  = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        System.out.println("---- Updating grade ----");
        controller.setStudentGrade("A+");
        controller.updateView();
    }
}
