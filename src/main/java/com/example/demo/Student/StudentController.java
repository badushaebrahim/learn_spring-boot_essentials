package com.example.demo.Student;
import com.example.demo.Student.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@RequestMapping(path = "api/v1/stud")
public class StudentController {
	@Autowired
	private final StudentService studentService;

	public StudentController(StudentService studentService){
		this.studentService = studentService;
	}
	@GetMapping
	public List<Student> getStudents(){
		return studentService.getStudents();
		
	}

	@PostMapping("Student")
	public ResponseEntity<Student> saveStudent(@RequestBody Student st){
		return new ResponseEntity<Student> (StudentService.addStudent(st),HttpStatus.CREATED);
	}


}
