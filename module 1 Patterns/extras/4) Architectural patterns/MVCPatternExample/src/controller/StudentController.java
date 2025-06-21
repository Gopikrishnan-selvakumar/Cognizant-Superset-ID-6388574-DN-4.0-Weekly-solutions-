package com.mvc.student.controller;

import com.mvc.student.model.Student;
import com.mvc.student.view.StudentView;

public class StudentController {

    private final Student model;
    private final StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view  = view;
    }

    public void setStudentName(String name)    { model.setName(name); }
    public void setStudentGrade(String grade)  { model.setGrade(grade); }

    public void updateView() {
        view.displayStudentDetails(model.getId(),
                model.getName(),
                model.getGrade());
    }
}
