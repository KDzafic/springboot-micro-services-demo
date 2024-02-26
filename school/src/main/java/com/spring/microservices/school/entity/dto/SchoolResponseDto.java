package com.spring.microservices.school.entity.dto;


import com.spring.microservices.school.entity.Student;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SchoolResponseDto {

    private String name;
    private String email;
    List<Student> students;
}
