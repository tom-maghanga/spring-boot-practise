package com.springboot.tomdemo;

import bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("student")
    public Student getStudent( ){
        Student student = new Student(1,"Thomas", "Maghanga");
        return student;
    }

    @GetMapping("students")
    public List<Student> getstudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(2, "Jackim", "Mwaviswa"));
        students.add((new Student(3, "Emmanuel", "Righa")));
        return  students;
    }
}
