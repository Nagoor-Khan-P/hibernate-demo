package com.fullstack.hibernate_demo.service;

import java.util.List;

import com.fullstack.hibernate_demo.dao.StudentDao;
import com.fullstack.hibernate_demo.dao.StudentDaoImpl;
import com.fullstack.hibernate_demo.dto.Student;

public class StudentIServicempl implements StudentService{
	
	private StudentDao studentDao;
	
	

	public StudentIServicempl() {
		super();
		this.studentDao = new StudentDaoImpl();
	}

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		studentDao.addStudent(student);
		return student;
	}

	@Override
	public Student getStudentByName(String name) {
		// TODO Auto-generated method stub
		Student student=studentDao.getStudentByName(name);
		return student;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> list=studentDao.getAllStudent();
		return list;
	}

}
