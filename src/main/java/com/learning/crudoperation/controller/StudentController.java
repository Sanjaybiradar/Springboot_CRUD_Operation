package com.learning.crudoperation.controller;

import com.learning.crudoperation.entity.Student;
import com.learning.crudoperation.service.StudentService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private static final Logger LOGGER = LogManager.getLogger(StudentService.class);

   /* private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }*/

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/getAllStudents")
    public List<Student> findAllStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/getStudent/{id}")
    public Student findStudentById(@PathVariable int id){
        return studentService.getStudentById(id);
    }


    @PutMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.update(student);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String detelteById(@PathVariable int id){
        return studentService.deleteStudent(id);
    }
}
