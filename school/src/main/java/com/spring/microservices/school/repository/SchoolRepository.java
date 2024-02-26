package com.spring.microservices.school.repository;

import com.spring.microservices.school.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School,Integer> {
}
