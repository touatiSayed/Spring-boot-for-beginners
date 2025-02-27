package com.Sayed.Springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "Sayed",
                        "Touati",
                        LocalDate.now(),
                        "contact@sayedtouati.com",
                        18
                ),
                new Student(
                        "Student 3",
                        "Bouali",
                        LocalDate.now(),
                        "contact@aliboucoding.com",
                        34
                )
        );
    }
}
