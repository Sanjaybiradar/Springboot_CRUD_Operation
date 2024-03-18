package com.learning.crudoperation.repository;

import com.learning.crudoperation.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class StudentRepository {

    private List<Student> student = new ArrayList<>(Arrays.asList(
            new Student(1, "Manoj", "ComputerScience",8.9),
            new Student(2, "Chetan", "Aeronautical",8.6),
            new Student(7, "Nachi", "Civil",9.2),
            new Student(9, "Rahul", "Mechanical",7.7)
    ));

    public List<Student> getAllStudents() {
        return student;
    }

    public Student findById(int id) {
        for (int i = 0; i < student.size(); i++){
            if (student.get(i).getId() == id){
                return student.get(i);
            }
        }
        return null;
    }

    public List<Student> searchByName(String name) {
        return student.stream().filter(a -> a.getStudentName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public Student save(Student s) {
        Student s1 = new Student();
        s1.setId(s.getId());
        s1.setStudentName(s.getStudentName());
        s1.setBranch(s.getBranch());
        s1.setCgpa(s.getCgpa());
        student.add(s1);
        return s1;
    }

    public String delete(int id) {
        student.removeIf(a -> a.getId() == id);
        return null;
    }

    public Student updateStudent (Student s) {
        int id = 0;
        for (int i = 0; i<student.size(); i++){
            if (student.get(i).getId() == s.getId())
            {
                id = s.getId();
                break;
            }
        }

        Student s2 = new Student();
        s2.setId(id);
        s2.setStudentName(s.getStudentName());
        s2.setBranch(s.getBranch());
        s2.setCgpa(s.getCgpa());
        return s2;
    }


}
