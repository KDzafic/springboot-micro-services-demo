package com.spring.microservices.school.controller;


import com.spring.microservices.school.entity.School;
import com.spring.microservices.school.entity.dto.SchoolResponseDto;
import com.spring.microservices.school.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/school")
@RequiredArgsConstructor
public class SchoolController {

    private final SchoolService schoolService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody School school) {
        schoolService.saveSchool(school);
    }

    @GetMapping("/get")
    public ResponseEntity<List<School>> getAllStudents() {
        return ResponseEntity.ok(schoolService.findAllSchool());
    }

    @GetMapping("/with-students/{school-id}")
    public ResponseEntity<SchoolResponseDto> getSchoolsWithStudents(@PathVariable("school-id") Integer schoolId) {
        return ResponseEntity.ok(schoolService.findSchoolsWithStudents(schoolId));
    }
}
