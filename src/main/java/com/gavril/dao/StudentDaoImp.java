package com.gavril.dao;

import com.gavril.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("fakeData")
public class StudentDaoImp implements StudentDao {
    private static final Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Andrei", "Java"));
                put(2, new Student(2, "George", "JavaScript"));
                put(3, new Student(3, "Vlad", "Ruby"));
            }
        };
    }

    @Override
    public Collection<Student> getStudents() {
        return students.values();
    }

    @Override
    public Student getStudentById(int id) {
        return students.get(id);
    }

    @Override
    public Student addStudent(Student student) {
        return students.put(students.size() + 1, student);
    }

    @Override
    public Student deleteStudent(int id) {
        return students.remove(id);
    }

    @Override
    public Student updateStudent(Student student) {
        Student std = students.get(student.getId());
        std.setName(student.getName());
        std.setTech(student.getTech());
        return students.put(student.getId(), std);
    }
}
