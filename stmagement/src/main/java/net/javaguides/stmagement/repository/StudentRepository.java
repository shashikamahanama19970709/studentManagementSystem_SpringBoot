package net.javaguides.stmagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.javaguides.stmagement.entity.Student;
//import org.springframework.stereotype.Repository;
//
//@Repository

public interface StudentRepository extends JpaRepository<Student,Long> {

}
