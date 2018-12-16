package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    ArrayList<Student> students = new ArrayList<>();

    public UserServiceImpl() {
        students.add(new Student(0, "Faisal", "Jarkass", "12346578", new Date()));
        students.add(new Student(1, "Jon", "Eikholm", "12346578", new Date()));
        students.add(new Student(2, "Kristoffer", "Miklas", "12346578", new Date()));
        students.add(new Student(3, "Alex", "Coag", "12346578", new Date()));
        students.add(new Student(4, "Marianne", "Nielsen", "12346578", new Date()));
        //userRepo.save(students);
    }

    @Override
    public List<Student> fetchAllUsers() {
        return userRepo.findAll();
        //return students;
    }

    @Override
    public void save(Student stud) {
        userRepo.save(stud);
    }

    @Override
    public void update(Student stud) {
        userRepo.save(stud);
    }

    @Override
    public void delete(int id) {
        userRepo.delete(id);
    }

    @Override
    public Student findById(int id) {
        return userRepo.findOne(id);
    }

    public List<Student> fetchAll() {
        return (List<Student>)userRepo.findAll();
    }

    public Student findByFirstName(String name){
        return userRepo.findStudentByFirstName(name);
    }

    public Student findByName(String first, String last){
        return userRepo.findStudentByFirstNameAndLastName(first, last);
    }

}
