package com.example.demo.Student;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	
	//private final static StudentRepository studentRepository;


	private static StudentRepository studentRepository;



	@Autowired
	public StudentService(StudentRepository studentRepository){
		super();
		StudentService.studentRepository = studentRepository;
	}




	public List<Student> getStudents(){
		// return List.of( new Student(12L,"badu2", "b@b.com", LocalDate.of(2000,Month.JANUARY,4), 21));	
		return studentRepository.findAll();
	}



	public static  Student addStudent(Student st){
		return studentRepository.save(st);

	}
}
