package com.wipro.controller;
 

import com.wipro.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    // This method will be called to display the form
    @GetMapping("/studentForm")
    public String showForm(Model model) {
        // Create a new Student object
        Student student = new Student();
        // Add the student object to the model
        model.addAttribute("student", student);
        // Return the view name (display.jsp)
        return "display";
    }

    // This method will be called when the form is submitted
    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute("student") Student student) {
        // Process the student object (e.g., save to database)
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        // Redirect to a success page or return a view name
        return "success";
    }
}