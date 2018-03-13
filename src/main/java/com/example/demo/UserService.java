package com.example.demo;

import java.util.ArrayList;

public interface UserService {

    ArrayList<Student> fetchAllUsers();
    void save(Student stud);
    void update(Student stud);
    void delete(int id);
    Student findById(int id);

}
