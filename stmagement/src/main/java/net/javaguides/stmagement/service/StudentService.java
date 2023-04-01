package net.javaguides.stmagement.service;
import  java.util.List;
import net.javaguides.stmagement.entity.Student;


public interface StudentService {
    List<Student> getAllStudents();
    
    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
