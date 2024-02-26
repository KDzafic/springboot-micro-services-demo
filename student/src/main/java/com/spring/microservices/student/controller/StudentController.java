package com.spring.microservices.student.controller;

import com.spring.microservices.student.entity.Student;
import com.spring.microservices.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
    }

    @GetMapping("/get")
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok(studentService.findAllStudents());
    }

    @GetMapping("/school/{school-id}")
    public ResponseEntity<List<Student>> getAllStudentsBySchool(@PathVariable("school-id") Integer schoolId) {
        return ResponseEntity.ok(studentService.findlAllStudentsBySchool(schoolId));
    }
}
