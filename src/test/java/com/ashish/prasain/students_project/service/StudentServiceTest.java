//package com.ashish.prasain.students_project.service;
//
//import com.ashish.prasain.students_project.model.Student;
//import com.ashish.prasain.students_project.repositary.StudentRepositary;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//
//@SpringBootTest
//class StudentServiceTest {
//
//    @Autowired
//    private StudentService service;
//
//    @Autowired
//    private StudentRepositary.StudentRepository repository;
//
//    @BeforeEach
//    void setUp() {
//        repository.deleteAll();
//    }
//
//    @Test
//    void testAddAndRetrieveStudent() {
//        Student student = new Student();
//        student.setName("John");
//        student.setEmail("john@example.com");
//        service.addStudent(student);
//
//        List<Student> students = service.getAllStudents();
//        Assertions.assertEquals(1, students.size());
//        Assertions.assertEquals("John", students.get(0).getName());
//    }
//}
