package com.gavril.dao;

import com.gavril.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;

@Repository
@Qualifier("sqlData")
public class StudentDaoMySql implements StudentDao {
    @Override
    public Collection<Student> getStudents() {
        return new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "George", "Java"));
            }
        }.values();
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public Student addStudent(Student student) {
        return null;
    }

    @Override
    public Student deleteStudent(int id) {
        return null;
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }
}
