package com.gavril.dao;

import com.gavril.entity.Student;

import java.util.Collection;

public interface StudentDao {
    Collection<Student> getStudents();

    Student getStudentById(int id);

    Student addStudent(Student student);

    Student deleteStudent(int id);

    Student updateStudent(Student student);
}
