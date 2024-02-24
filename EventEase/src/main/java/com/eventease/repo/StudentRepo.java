package com.eventease.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eventease.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{
	Student findByUsername(String username);
}
