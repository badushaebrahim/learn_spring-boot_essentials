package com.example.demo.Student;
import com.example.demo.Student.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/stud")
public class StudentController {
	@Autowired
	private final StudentService studentService;

	public StudentController(StudentService studentService){
		this.studentService = new StudentService();
	}
	@GetMapping
	public List<Student> getStudents(){
		return studentService.getStudents();
		
	}
}
