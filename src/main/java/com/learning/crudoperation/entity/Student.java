package com.learning.crudoperation.entity;

public class Student {

    private int id;
    private String studentName;
    private String branch;
    private double cgpa;

    public Student() {
    }

    public Student(int id, String studentName, String branch, double cgpa) {
        this.id = id;
        this.studentName = studentName;
        this.branch = branch;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", branch='" + branch + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}
