package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<Student, Integer> {

    Student findStudentByFirstName(String firstName);
    Student findStudentByFirstNameAndLastName(String firstName, String lastName);
}
