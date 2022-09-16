package com.fullstack.hibernate_demo.dao;

import java.util.List;

import com.fullstack.hibernate_demo.dto.Student;

public interface StudentDao {
	public Student addStudent(Student student);
	public Student getStudentByName(String name);
	public List<Student> getAllStudent();
}
