package com.Spring.smsf.Service;

import com.Spring.smsf.Entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();
    Student addStudent(Student student);
    Student getStudentById(Long id);
    Student updateStudent(Student student);
}
