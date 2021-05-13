package com.capg.users;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.capg.beans.Student;


public class MainClass {
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring-factory.xml");
		
		Student student = (Student)spring.getBean("student");
		
		System.out.println(student);
	
		 
	}
}