package com.capg.beans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("${a.studentId}")
	private int id;
	
	@Value("${a.studentName}")
	private String name;
	
	@Value("${a.studentMarks}")
	private int marks;
	
	@Autowired
	@Qualifier("techCourses")
	private Courses Tcourses;
	
	@Autowired
	@Qualifier("nonTechCourses")
	private Courses Ntcourses;
	
	@Autowired
	private Address address;
	
	public Student() {
		super();
	}
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public Courses getTcourses() {
		return Tcourses;
	}
	public void setTcourses(Courses tcourses) {
		Tcourses = tcourses;
	}
	public Courses getNtcourses() {
		return Ntcourses;
	}
	public void setNtcourses(Courses ntcourses) {
		Ntcourses = ntcourses;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", Tcourses=" + Tcourses + ", Ntcourses="
				+ Ntcourses + ", address=" + address + "]";
	}
	public void doInit()
	{
		System.out.println(" inside doInit");
	}
	public void doEnd()
	{
		System.out.println("inside doEnd");
	}
}