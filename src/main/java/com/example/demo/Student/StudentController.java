package com.example.demo.Student;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/stud")
public class StudentController {
	private final StudentService studentService;

	public StudentController(StudentService studentservice){
		this.studentService = new StudentService();
	}
	@GetMapping
	public List<Student> getStudents(){
		return studentService.getStudents();
		
	}
}
