package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Student;
import com.springboot.repository.StudentRepositoy;

@RestController
public class StudentController {

	@Autowired
	private StudentRepositoy studentRepositoy;

	@PostMapping("/student/saveStudent")
	public Student saveStudent(@RequestBody Student student) {

		return studentRepositoy.save(student);
	}
	
	
	@GetMapping("/student/allStudent")
	public List<Student> getAllStudent(){
		return studentRepositoy.findAll();
	}
	
}
