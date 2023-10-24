package com.springboot.tomdemo;

import bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("student")
    public Student getStudent( ){
        Student student = new Student(1,"Thomas", "Maghanga");
        return student;
    }
}
