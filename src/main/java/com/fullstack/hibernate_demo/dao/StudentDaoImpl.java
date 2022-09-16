package com.fullstack.hibernate_demo.dao;

import java.util.List;

import org.hibernate.Session;

import com.fullstack.hibernate_demo.dto.Student;
import com.fullstack.hibernate_demo.hibernate_config.HibernateConfig;

public class StudentDaoImpl implements StudentDao{
	
	private HibernateConfig config;
	private Session session;
	
	
	
	public StudentDaoImpl() {
		super();
		config=new HibernateConfig();
		session=config.buildSessionFactory().openSession();
	}

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		session.save(student);
		session.close();
		return null;
	}

	@Override
	public Student getStudentByName(String name) {
		// TODO Auto-generated method stu
		
		
		return null;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
