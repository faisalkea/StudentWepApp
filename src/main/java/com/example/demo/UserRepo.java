package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Student, Integer> {

    Student findStudentByFirstName(String firstName);
    Student findStudentByFirstNameAndLastName(String firstName, String lastName);

}
