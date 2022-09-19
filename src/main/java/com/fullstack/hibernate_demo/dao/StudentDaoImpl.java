package com.fullstack.hibernate_demo.dao;

import java.util.List;

import javax.persistence.Query;

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
		return null;
	}

	@Override
	public Student getStudentByName(String name) {
		// TODO Auto-generated method stu
		String hqlQuery="FROM Student E WHERE E.sname = :name";
		Query query = session.createQuery(hqlQuery);
		query.setParameter("name", name);
		List<Student> student=query.getResultList();
		System.out.print(student);
		return null;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		String hqlQuery="FROM Student";
		Query query=session.createQuery(hqlQuery);
		List<Student> students=query.getResultList();
		System.out.println(students);
		return null;
	}

}
