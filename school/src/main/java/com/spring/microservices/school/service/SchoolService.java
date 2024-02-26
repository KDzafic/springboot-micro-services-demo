package com.spring.microservices.school.service;

import com.spring.microservices.school.client.StudentClient;
import com.spring.microservices.school.entity.School;
import com.spring.microservices.school.entity.dto.SchoolResponseDto;
import com.spring.microservices.school.repository.SchoolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepository schoolRepository;
    private StudentClient studentClient;

    //todo: create dto
    public void saveSchool(School school) {
        schoolRepository.save(school);
    }

    public List<School> findAllSchool() {
        return schoolRepository.findAll();
    }

    public SchoolResponseDto findSchoolsWithStudents(Integer schoolId) {
        var school = schoolRepository.findById(schoolId)
                .orElse(
                        School.builder()
                                .name("NOT_FOUND")
                                .email("NOT_FOUND")
                                .build()
                );
        var students = studentClient.findAllStudentsBySchool(schoolId);
        return SchoolResponseDto.builder()
                .name(school.getName())
                .email(school.getEmail())
                .students(students)
                .build();
    }
}
