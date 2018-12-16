package com.example.demo;

import java.util.List;

public interface UserService {

    List<Student> fetchAllUsers();
    void save(Student stud);
    void update(Student stud);
    void delete(int id);
    Student findById(int id);

}
