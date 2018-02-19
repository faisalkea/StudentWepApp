package com.example.demo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Student {

    private int studentId;
    private String firstName;
    private String lastName;
    private String cpr;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date enrollmentDate;

    public Student() {
    }

    public Student(int studentId, String firstName, String lastName, String cpr, Date date) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cpr = cpr;
        this.enrollmentDate = date;

    }

    public Student(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }
}
