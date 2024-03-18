package com.learning.crudoperation.service;

import com.learning.crudoperation.entity.Student;
import com.learning.crudoperation.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    /*private final StudentRepository studentRepository;               // De-coupling Constructor Injection

    public StudentService(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }*/

    @Autowired(required = true)
    private StudentRepository studentRepository;

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    public List<Student> getStudents() {
        return studentRepository.getAllStudents();
    }

    public Student getStudentById(int id){
        return studentRepository.findById(id);
    }


    public String deleteStudent(int id) {
        studentRepository.delete(id);
        return "Student Removed!!  Id : "+id;
    }

    public Student update(Student student) {
        return studentRepository.updateStudent(student);
    }
}
