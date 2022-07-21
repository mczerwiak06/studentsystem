package com.springbootproject.studentsystem.service;

import com.springbootproject.studentsystem.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student saveStudent(Student student);
    void deleteStudentById(int id);
    Optional<Student> findStudentById(int id);
    List<Student> findAllStudents();
}
