package com.fullstack.hibernate_demo.service;

import java.util.List;

import com.fullstack.hibernate_demo.dto.Student;

public interface StudentService {
	public Student addStudent(Student student);
	public Student getStudentByName(String name);
	public List<Student> getAllStudent();
}
