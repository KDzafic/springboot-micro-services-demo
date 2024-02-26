package com.spring.microservices.student.service;

import com.spring.microservices.student.entity.Student;
import com.spring.microservices.student.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;


    //todo: create dto
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    public List<Student> findlAllStudentsBySchool(Integer schoolId) {
        return studentRepository.findAllBySchoolId(schoolId);
    }
}
