package com.example.expo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@RestController /*  Request Controller ability to expose resources  to the client to  consume*/
@RequestMapping (path = "api/v1/students")
public class StudentController {
    @GetMapping
    public List<Student> getAllStudents(){

        List<Student> students = Arrays.asList(
                new Student(1L, "John", "Seun@gmail.com", Gender.FEMALE),
                new Student(2L, "Brown", "Brown@gmail.com", Gender.MALE)
      );
        return students;
    }



}
