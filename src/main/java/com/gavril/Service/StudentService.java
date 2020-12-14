package com.gavril.Service;

import com.gavril.Dao.StudentDao;
import com.gavril.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getStudents() {
        return studentDao.getStudents();
    }

    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);
    }

    public Student addStudent(Student student) {
        return studentDao.addStudent(student);
    }

    public Student deleteStudent(int id) {
        return studentDao.deleteStudent(id);
    }

    public Student updateStudent(Student student) {
        return studentDao.updateStudent(student);
    }
}
