package com.example.demo.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	// @Bean
	// CommandLineRunner commadLineRunner(StudentRepository Repository){
	// return args ->{
	// 	Student ba = new Student(12L,"badu2", "b@b.com", LocalDate.of(2000,Month.JANUARY,4), 21);
	// 	Student ba2 = new Student(12L,"badu", "b4@b.com", LocalDate.of(2000,Month.JANUARY,4), 21);
	// 	Repository.save(ba);

	// };	
	// }

}
