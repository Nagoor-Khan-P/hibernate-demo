package com.fullstack.hibernate_demo;

import com.fullstack.hibernate_demo.dto.Student;
import com.fullstack.hibernate_demo.service.StudentIServicempl;
import com.fullstack.hibernate_demo.service.StudentService;

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
    public static void main( String[] args )
    {
    	App app=new App();
    	Student student=new Student();
    	student.setSname("Nagoor Khan");
    	student.setLocation("Hyderabad");
    	student.setFathername("Patan Mabu Khan");
        service.addStudent(student);
    }
}
