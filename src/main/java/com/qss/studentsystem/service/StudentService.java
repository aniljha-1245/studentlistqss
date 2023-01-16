package com.qss.studentsystem.service;

import java.util.List;

import com.qss.studentsystem.model.Student;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
