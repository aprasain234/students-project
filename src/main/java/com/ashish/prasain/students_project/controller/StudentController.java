package com.ashish.prasain.students_project.controller;

import com.ashish.prasain.students_project.model.Student;
import com.ashish.prasain.students_project.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService service) {
        this.studentService = service;
    }

    @GetMapping("/test")
    public String testMethod() {
        return "From the Controller";
    }
    @GetMapping("/all-students")
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        model.addAttribute("student", new Student()); // for the form
        return "students"; // students.html
    }

    @PostMapping("/add-student")
    public String addStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";
    }
}
