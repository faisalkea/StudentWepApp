package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    ArrayList<Student> students = new ArrayList<>();

    public UserServiceImpl() {
        students.add(new Student(0, "Faisal", "Jarkass", "12346578", new Date()));
        students.add(new Student(1, "Jon", "Eikholm", "12346578", new Date()));
        students.add(new Student(2, "Kristoffer", "Miklas", "12346578", new Date()));
        students.add(new Student(3, "Alex", "Coag", "12346578", new Date()));
        students.add(new Student(4, "Marianne", "Nielsen", "12346578", new Date()));
    }

    @Override
    public ArrayList<Student> fetchAllUsers(){
        return students;
    }

}
