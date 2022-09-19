package com.fullstack.hibernate_demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.fullstack.hibernate_demo.dto.Student;

public class StudentDaoImpl implements StudentDao{
	
	private SessionFactory factory;
	private Session session;
	
	
	
	public StudentDaoImpl() {
		super();
		factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
    	session=factory.openSession();
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
