package com.ashish.prasain.students_project.repositary;

import com.ashish.prasain.students_project.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

