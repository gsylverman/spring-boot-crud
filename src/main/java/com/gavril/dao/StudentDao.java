package com.gavril.dao;

import com.gavril.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {
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

    public Collection<Student> getStudents() {
        return students.values();
    }

    public Student getStudentById(int id) {
        return students.get(id);
    }

    public Student addStudent(Student student) {
        return students.put(students.size() + 1, student);
    }

    public Student deleteStudent(int id) {
        return students.remove(id);
    }

    public Student updateStudent(Student student) {
        Student std = students.get(student.getId());
        std.setName(student.getName());
        std.setTech(student.getTech());
        return students.put(student.getId(), std);
    }
}
