package com.fullstack.hibernate_demo;

import com.fullstack.hibernate_demo.dto.Student;
import com.fullstack.hibernate_demo.service.StudentIServicempl;
import com.fullstack.hibernate_demo.service.StudentService;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
	static StudentService service;
	
	public App() {
		service=new StudentIServicempl();
	}
    /**
     * @param args
     */
    public static void main( String[] args )
    {
    	App app=new App();
    	Student student=new Student();
    	student.setSname("Shaziya Shaik");
    	student.setLocation("Hyderabad");
    	student.setFathername("Shaik");
        service.addStudent(student);
    }
}
