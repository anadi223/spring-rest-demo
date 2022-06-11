package com.demo.spring.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.context.Theme;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.entity.Student;

//getting student using link or path variable
@RestController
@RequestMapping("/api")
public class StudentRestController {

	@GetMapping("/students")
	public List<Student> getStudents() {
		List<Student> theStudents = new ArrayList<>();
		
		theStudents.add(new Student("ANADI", "Mishra"));
		theStudents.add(new Student("ANADI", "Pandey"));
		theStudents.add(new Student("ANADI", "Kaushik"));
		theStudents.add(new Student("ANADI", "Bajpayee"));
		
		return theStudents; //what jackson will do is convert this list into a json array of list
	}
	
	@GetMapping("/students/{studentId}") //get student with id
	public Student getStudentWithEndpoint(@PathVariable int studentId){
		List<Student> theStudents =new ArrayList<>();
		theStudents.add(new Student("ANADI", "Mishra"));
		theStudents.add(new Student("ANADI", "Pandey"));
		theStudents.add(new Student("ANADI", "Kaushik"));
		theStudents.add(new Student("ANADI", "Bajpayee"));
		
		return theStudents.get(studentId);
	}
}
