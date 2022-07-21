package com.springbootproject.studentsystem.controller;

import com.springbootproject.studentsystem.model.Student;
import com.springbootproject.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student added";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable int id){
        studentService.deleteStudentById(id);
        return "Student deleted";
    }

    @GetMapping("/find/{id}")
    public Optional<Student> findById(@PathVariable int id){
        return studentService.findStudentById(id);
    }

    @GetMapping("/findAll")
    public List<Student> findAll(){
        return studentService.findAllStudents();
    }
}
