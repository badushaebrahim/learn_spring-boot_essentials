package com.example.demo.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	public List<Student> getStudents(){
		return List.of( new Student(12L,"badu2", "b@b.com", LocalDate.of(2000,Month.JANUARY,4), 21));	
	}
}
