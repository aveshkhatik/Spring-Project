package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.model.Student;

public interface StudentRepositoy extends JpaRepository<Student, Long> {

}
