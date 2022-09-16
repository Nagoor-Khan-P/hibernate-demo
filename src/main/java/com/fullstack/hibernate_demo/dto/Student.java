package com.fullstack.hibernate_demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_table")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	@Column(name = "student_name")
	private String sname;
	@Column(name = "student_location")
	private String location;
	@Column(name = "father_name")
	private String fathername;
	
	
	
	public Student() {
		super();
	}
	
	public Student(int eid, String sname, String location, String fathername) {
		super();
		this.eid = eid;
		this.sname = sname;
		this.location = location;
		this.fathername = fathername;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	@Override
	public String toString() {
		return "Student [eid=" + eid + ", sname=" + sname + ", location=" + location + ", fathername=" + fathername
				+ "]";
	}
	
	
}
