package com.qss.studentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qss.studentsystem.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
