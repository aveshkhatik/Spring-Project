package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Subject;
import com.springboot.repository.SubjectRepository;

@RestController
public class SubjectController {

	@Autowired
	private SubjectRepository subjectRepository;

	@PostMapping("/subject/saveSubject")
	public Subject saveSubject(@RequestBody Subject subject) {
		return subjectRepository.save(subject);
	}

	@GetMapping("/subject/allSubjects")
	public List<Subject> getAllSubjects() {
		return subjectRepository.findAll();
	}
}
